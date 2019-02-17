/**
 * Author: Karl Albornoz
 * This Work is my own.
 */
package week7milestones;

public abstract class NFLPlayer {
	private String name;
	private String position;
	private double height;

	public NFLPlayer() {
		this.name = "Default";
		this.position = "Default";
		this.height = 0;
	}

	public NFLPlayer(String name, String position, double height) {
		this.name = name;
		this.position = position;
		this.height = height;
	}

	// Returns the name
	public String getName() {
		return name;
	}

	// Sets the name
	public void setName(String name) {
		this.name = name;
	}

	// Returns position
	public String getPosition() {
		return position;
	}

	// Sets the Position
	public void setPosition(String position) {
		this.position = position;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public abstract double getRating();

}
