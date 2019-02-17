/**
 * Author: Karl Albornoz
 * This work is my own.
 */
package week7milestones;

public class DefensivePlayer extends NFLPlayer {
	private int tackles;
	private int sacksAchieved;
	private int interceptionsCaught;
	private double yardsLost;
	private double rating;

	// No arg contstructor creates a default player without any set values.
	public DefensivePlayer() {
		super();
		this.tackles = 0;
		this.sacksAchieved = 0;
		this.interceptionsCaught = 0;
		this.yardsLost = 0;
		this.rating = getRating();
	}

	public DefensivePlayer(int tackles, int sacksAchieved, int interceptionsCaught, double yardsLost) {

		this.tackles = tackles;
		this.sacksAchieved = sacksAchieved;
		this.interceptionsCaught = interceptionsCaught;
		this.yardsLost = yardsLost;
		this.rating = getRating();
	}

	// Returns Tackles
	public int getTackles() {
		return tackles;
	}

	// Sets number of Tackles
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}

	// Returns number of sacks player has achieved
	public int getSacksAchieved() {
		return sacksAchieved;
	}

	// Sets number of sacks player has achieved
	public void setSacksAchieved(int sacksAchieved) {
		this.sacksAchieved = sacksAchieved;
	}

	// Returns number of Interceptions caught by player
	public int getInterceptionsCaught() {
		return interceptionsCaught;
	}

	// Sets number of Interceptions caught by player
	public void setInterceptionsCaught(int interceptionsCaught) {
		this.interceptionsCaught = interceptionsCaught;
	}

	// Returns number of yards lost due to player error.
	public double getYardsLost() {
		return yardsLost;
	}

	// Sets number of yards lost due to player error.
	public void setYardsLost(double yardsLost) {
		this.yardsLost = yardsLost;
	}

	// Returns height in x ft x in.
	public String getHeightFeet(double height) {
		int feet = (int) (height / 12);
		double inches = height % 12;
		return feet + " ft " + inches + " in";
	}

	// Calculates and returns rating based on values I thought may be important.
	// Calculation is different based on DefensiveLine, Linebacker, Corner, Safety
	@Override
	public double getRating() {
		switch (super.getPosition()) {
		case "DefensiveLine":
		case "Linebacker":
			rating = (tackles * 5) + (sacksAchieved * 7) + (interceptionsCaught * 10) - yardsLost;
			break;
		case "Corner":
		case "Safety":
			rating = (tackles * 5) + (interceptionsCaught * 5) - yardsLost;
			break;
		default:
			rating = tackles + sacksAchieved + interceptionsCaught - yardsLost;
			break;
		}
		return rating;
	}

	// Returns the players name, height, and position
	@Override
	public String toString() {
		return "Name: " + super.getName() + "\nHeight: " + getHeightFeet(super.getHeight()) + "\nPosition: "
				+ super.getPosition() + "\n";
	}

	public static void main(String[] args) {
		// Test no arg constructor
		DefensivePlayer test = new DefensivePlayer();
		System.out.println(test);

		test.setHeight(80);
		System.out.println(test.getHeight());

		test.setPosition("Linebacker");
		System.out.println(test.getPosition());

		test.setName("Manolo");
		System.out.println(test.getName());

		test.setInterceptionsCaught(1);
		test.setSacksAchieved(2);
		test.setTackles(15);
		test.setYardsLost(75);
		System.out.println("\n" + test);

	}

}
