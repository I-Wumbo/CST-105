/**
 * Author: Karl Albornoz
 * This work is my own.
 */
package week7milestones;

public class OffensivePlayer extends NFLPlayer {
	private int yardsGainedbyPassing;
	private int yardsGainedbyRunning;
	private int penaltiesCommitted;
	private int sacksAllowed;
	private int passesCompleted;
	private double rating;
	private int touchdowns;
	private int fumbles;

	// No arg contstructor creates a default player without any set values.
	public OffensivePlayer() {
		super();
		this.yardsGainedbyPassing = 0;
		this.yardsGainedbyRunning = 0;
		this.penaltiesCommitted = 0;
		this.sacksAllowed = 0;
		this.passesCompleted = 0;
		this.rating = getRating();
		this.touchdowns = 0;
		this.fumbles = 0;
	}

	/**
	 * 
	 * @param name                 Players name
	 * @param position             Players position
	 * @param height               Players height in inches
	 * @param yardsGainedbyPassing Yards this player has gained by passing. Enter 0
	 *                             if not sure
	 * @param yardsGainedbyRunning Total yards a player has gained by running. If
	 *                             not a runningback this stays 0.
	 * @param penaltiesCommitted   Penalties committed by linemen.
	 * @param sacksAllowed         Number of times a lineman has let the defense
	 *                             through to tackle the QB.
	 * @param passesCompleted      Number of passes a QB has completed, or number of
	 *                             passes offense player has caught. Enter 0 if
	 *                             player is defense
	 * @param touchdowns           Number of touchdowns scored by player. If a QB
	 *                             this is the number of TD throws.
	 * @param rushingAttempts      Rushing attempts made by player
	 * @param fumbles              Number of fumbles made by player
	 * @param yardsGainedbyRunning
	 * @param penaltiesCommitted
	 * @param sacksAllowed
	 * @param tackles              Number of tackles made by player
	 */
	public OffensivePlayer(String name, String position, double height, int yardsGainedbyPassing,
			int yardsGainedbyRunning, int penaltiesCommitted, int sacksAllowed, int passesCompleted, int touchdowns,
			int fumbles) {
		super(name, position, height);

		this.yardsGainedbyPassing = yardsGainedbyPassing;
		this.yardsGainedbyRunning = yardsGainedbyRunning;
		this.penaltiesCommitted = penaltiesCommitted;
		this.sacksAllowed = sacksAllowed;
		this.passesCompleted = passesCompleted;
		this.rating = getRating();
		this.touchdowns = touchdowns;
		this.fumbles = fumbles;
	}

	// Returns number of yards made by running
	public int getYardsGainedbyRunning() {
		return yardsGainedbyRunning;
	}

	// Sets the number of yards made by running
	public void setYardsGainedbyRunning(int yardsGainedbyRunning) {
		this.yardsGainedbyRunning = yardsGainedbyRunning;
	}

	// Returns the number of penalties commited
	public int getPenaltiesCommitted() {
		return penaltiesCommitted;
	}

	// Sets the number of penalties commited
	public void setPenaltiesCommitted(int penaltiesCommitted) {
		this.penaltiesCommitted = penaltiesCommitted;
	}

	// Returns number of Sacks allowed through
	public int getSacksAllowed() {
		return sacksAllowed;
	}

	// Sets the number of Sacks allowed through
	public void setSacksAllowed(int sacksAllowed) {
		this.sacksAllowed = sacksAllowed;
	}

	// Returns yards gained by passing
	public int getYardsGainedbyPassing() {
		return yardsGainedbyPassing;
	}

	// Sets yards gained by passing
	public void setYardsGainedbyPassing(int yardsGainedbyPassing) {
		this.yardsGainedbyPassing = yardsGainedbyPassing;
	}

	// Returns height in x ft x in.
	public String getHeightFeet(double height) {
		int feet = (int) (height / 12);
		double inches = height % 12;
		return feet + " ft " + inches + " in";
	}

	// Returns passes completed.
	public int getPassesCompleted() {
		return passesCompleted;
	}

	// Sets the number of passes completed
	public void setPassesCompleted(int passesCompleted) {
		this.passesCompleted = passesCompleted;
	}

	// Calculates and returns rating based on values I thought may be important.
	// Calculation is different based on, QB, Lineman, WideReceiver, and Runningback
	@Override
	public double getRating() {
		switch (super.getPosition()) {
		case "QB":
			rating = (yardsGainedbyPassing / 100) + passesCompleted + touchdowns - fumbles;
			break;
		case "Lineman":
			rating = 20 - penaltiesCommitted - sacksAllowed;
			break;
		case "WideReceiver":
			rating = passesCompleted + (yardsGainedbyRunning / 10) + touchdowns - fumbles;
			break;
		case "Runningback":
			rating = (yardsGainedbyRunning / 10) + touchdowns - fumbles;
			break;
		default:
			rating = touchdowns - fumbles;
			break;
		}
		return rating;
	}

	// Returns number of touchdowns
	public int getTouchdowns() {
		return touchdowns;
	}

	// Sets number of touchdowns
	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}

	// Gets number of Fumbles made
	public int getFumbles() {
		return fumbles;
	}

	// Sets number of Fumbles made
	public void setFumbles(int fumbles) {
		this.fumbles = fumbles;
	}

	// Returns the players name, height, and position
	@Override
	public String toString() {
		return "Name: " + super.getName() + "\nHeight: " + getHeightFeet(getHeight()) + "\nPosition: "
				+ super.getPosition() + "\n";
	}

	public static void main(String[] args) {
		// Test no arg constructor
		OffensivePlayer test = new OffensivePlayer();
		System.out.println(test);

		// Test constructor
		OffensivePlayer player1 = new OffensivePlayer("John", "Runningback", 76, 200, 75, 0, 0, 3, 4, 1);
		System.out.println(player1);

		// Test name getter and setter
		test.setName("Oliver");
		System.out.println(test.getName());

		// Test touchdown getter and setter
		test.setTouchdowns(0);
		System.out.println("Touchdowns: " + test.getTouchdowns());

		// Test position getter and setter
		test.setPosition("Lineman");
		System.out.println("Position: " + test.getPosition());

		// Test set height and getter in both forms
		test.setHeight(70);
		System.out.println("Height in Inches: " + test.getHeight());
		System.out.println("Height: " + test.getHeightFeet(test.getHeight()));

		// Test PassesCompleted getter and setter
		test.setPassesCompleted(0);
		System.out.println("PassesCompleted: " + test.getPassesCompleted());

		// Test Fumbles getter and setter
		test.setFumbles(0);
		System.out.println("Fumbles: " + test.getFumbles());

		// Test get rating
		System.out.println("Rating: " + test.getRating());

	}

}
