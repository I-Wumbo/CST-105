package week7milestones;

import java.util.ArrayList;

public class NFLPlayerManager {
	private ArrayList<NFLPlayer> players = new ArrayList<>();

	// Default constructor adds 6 default players
	public NFLPlayerManager() {
		createPlayers();
	}

	// Constructor that adds the number of players passed in
	public NFLPlayerManager(NFLPlayer[] playersArray) {
		createPlayers(playersArray);
	}

	// Creates the number of players passed in. Must be at least 6 players
	private void createPlayers(NFLPlayer[] playersArray) {
		if (playersArray.length < 6) {
			throw new IllegalArgumentException("Array must contain at least 6 players");
		}

		for (NFLPlayer player : playersArray) {
			players.add(player);
		}
	}

	// Method that adds 6 default players with all default data
	private void createPlayers() {
		for (int i = 0; i < 6; i++) {
			players.add(new NFLPlayer());
		}
	}

	// Get all players in the ArrayList
	public ArrayList<NFLPlayer> getPlayers() {
		return players;
	}

	// Set players to a new ArrayList of players.
	public void setPlayers(ArrayList<NFLPlayer> players) {
		this.players = players;
	}

	// Returns all the players
	@Override
	public String toString() {
		return "Players: " + "\n" + getPlayers();
	}

	public static void main(String[] args) {
		ArrayList<NFLPlayer> playerList = new ArrayList<>();
		playerList.add(new NFLPlayer("John Johnson", "QB", 76, 200, 3, 4, 1, 4, 0));
		playerList.add(new NFLPlayer("Dennis Thompson", "Offense", 71, 0, 5, 1, 2, 0, 0));
		playerList.add(new NFLPlayer("Phil Danson", "Defense", 74, 0, 0, 1, 3, 4, 16));
		playerList.add(new NFLPlayer("Tim", "QB", 76, 150, 2, 3, 1, 4, 0));
		playerList.add(new NFLPlayer("Robert", "Offense", 74, 0, 3, 3, 1, 0, 0));
		playerList.add(new NFLPlayer("Darren", "Defense", 76, 0, 0, 0, 1, 4, 10));

		NFLPlayer[] playerArray = { new NFLPlayer("John Johnson", "QB", 76, 200, 3, 4, 1, 4, 0),
				new NFLPlayer("Dennis Thompson", "Offense", 71, 0, 5, 1, 2, 0, 0),
				new NFLPlayer("Phil Danson", "Defense", 74, 0, 0, 1, 3, 4, 16),
				new NFLPlayer("Tim", "QB", 76, 150, 2, 3, 1, 4, 0),
				new NFLPlayer("Robert", "Offense", 74, 0, 3, 3, 1, 0, 0),
				new NFLPlayer("Billy", "Defense", 76, 0, 0, 0, 1, 4, 10) };

		// Test no arg constructor
		NFLPlayerManager test = new NFLPlayerManager();
		System.out.println(test);
		System.out.println();

		// Test arg constructor
		NFLPlayerManager manager1 = new NFLPlayerManager(playerArray);
		System.out.println(manager1);
		System.out.println();

		// Test set players
		test.setPlayers(playerList);
		System.out.println(test.getPlayers());
		System.out.println();

		// Test overload createplayers
		test.createPlayers(playerArray);
		System.out.println(test);

	}
}
