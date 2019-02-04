/**
 * Author: Karl Albornoz
 * All work here is my own.
 */
package week7milestones;

public class NFLPlayer {
	private String name;
	private String position; // Should be 'QB', 'Offense', or 'Defense'
	private double height;
	private int yardsGainedbyPassing;
	private int passesCompleted;
	private double rating;
	private int touchdowns;
	private int rushingAttempts;
	private int fumbles;
	private int tackles;

	// No arg contstructor creates a default player without any set values.
	public NFLPlayer() {
		this.name = "Default";
		this.position = "Default";
		this.height = 0;
		this.yardsGainedbyPassing = 0;
		this.passesCompleted = 0;
		this.rating = 0;
		this.touchdowns = 0;
		this.rushingAttempts = 0;
		this.fumbles = 0;
		this.tackles = 0;
	}

	/**
	 * 
	 * @param name                 Players name
	 * @param position             Players position
	 * @param height               Players height in inches
	 * @param yardsGainedbyPassing Yards this player has gained by passing. Enter 0
	 *                             if not sure
	 * @param passesCompleted      Number of passes a QB has completed, or number of
	 *                             passes offense player has caught. Enter 0 if
	 *                             player is defense
	 * @param touchdowns           Number of touchdowns scored by player. If a QB
	 *                             this is the number of TD throws.
	 * @param rushingAttempts      Rushing attempts made by player
	 * @param fumbles              Number of fumbles made by player
	 * @param tackles              Number of tackles made by player
	 */
	public NFLPlayer(String name, String position, double height, int yardsGainedbyPassing, int passesCompleted,
			int touchdowns, int rushingAttempts, int fumbles, int tackles) {
		this.name = name;
		this.position = position;
		this.height = height;
		this.yardsGainedbyPassing = yardsGainedbyPassing;
		this.passesCompleted = passesCompleted;
		this.rating = getRating();
		this.touchdowns = touchdowns;
		this.rushingAttempts = rushingAttempts;
		this.fumbles = fumbles;
		this.tackles = tackles;
	}

	// Returns the name
	public String getName() {
		return name;
	}

	// Sets the name
	public void setName(String name) {
		this.name = name;
	}

	// Returns yards gained by passing
	public int getYardsGainedbyPassing() {
		return yardsGainedbyPassing;
	}

	// Sets yards gained by passing
	public void setYardsGainedbyPassing(int yardsGainedbyPassing) {
		this.yardsGainedbyPassing = yardsGainedbyPassing;
	}

	// Returns height in inches
	public double getHeight() {
		return height;
	}

	// Sets the height in inches
	public void setHeight(double height) {
		this.height = height;
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
	// Calculation is different based on, QB, Defense, Offense
	public double getRating() {
		switch (position) {
		case "QB":
			rating = (yardsGainedbyPassing / 100) + passesCompleted + touchdowns - fumbles;
			break;
		case "Offense":
			rating = passesCompleted + touchdowns - fumbles;
			break;
		case "Defense":
			rating = tackles + rushingAttempts;
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

	// Gets number of rush attempts
	public int getRushingAttempts() {
		return rushingAttempts;
	}

	// Returns number of rush attempts
	public void setRushingAttempts(int rushingAttempts) {
		this.rushingAttempts = rushingAttempts;
	}

	// Gets number of Fumbles made
	public int getFumbles() {
		return fumbles;
	}

	// Sets number of Fumbles made
	public void setFumbles(int fumbles) {
		this.fumbles = fumbles;
	}

	// Gets number of tackles made, if player is offense, this is 0
	public int getTackles() {
		return tackles;
	}

	// Sets number of tackles made
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}

	// Gets the players position
	public String getPosition() {
		return position;
	}

	// Sets the players position
	public void setPosition(String position) {
		this.position = position;
	}

	// Returns the players name, height, and position
	@Override
	public String toString() {
		return "Name: " + name + "\nHeight: " + getHeightFeet(getHeight()) + "\nPosition: " + position + "\n";
	}

	public static void main(String[] args) {
		// Test no arg constructor
		NFLPlayer test = new NFLPlayer();
		System.out.println(test);

		// Test constructor
		NFLPlayer player1 = new NFLPlayer("John", "QB", 76, 200, 3, 4, 1, 4, 0);
		System.out.println(player1);

		// Test name getter and setter
		test.setName("Oliver");
		System.out.println(test.getName());

		// Test touchdown getter and setter
		test.setTouchdowns(3);
		System.out.println("Touchdowns: " + test.getTouchdowns());

		// Test position getter and setter
		test.setPosition("Offense");
		System.out.println("Position: " + test.getPosition());

		// Test set height and getter in both forms
		test.setHeight(65);
		System.out.println("Height in Inches: " + test.getHeight());
		System.out.println("Height: " + test.getHeightFeet(test.getHeight()));

		// Test PassesCompleted getter and setter
		test.setPassesCompleted(5);
		System.out.println("PassesCompleted: " + test.getPassesCompleted());

		// Test Fumbles getter and setter
		test.setFumbles(4);
		System.out.println("Fumbles: " + test.getFumbles());

		// Test get rating
		System.out.println("Rating: " + test.getRating());

	}
}
