package week7milestones;

import java.util.ArrayList;
import java.util.Random;

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
		Random rand = new Random();
		int number;
		for (int i = 0; i < 6; i++) {
			number = rand.nextInt(2) + 1;
			if (number == 1) {
				players.add(new OffensivePlayer());
				break;
			}
			players.add(new DefensivePlayer());
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
}
