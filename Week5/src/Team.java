import java.util.ArrayList;
import java.util.List;

public class Team {

	private List<Player> players = new ArrayList<Player>();
	private String name;
	
	public Team(String name) {
		this.setName(name);
	}
	
	public void describe() {
		System.out.println("Team Name: " + name);
		for (Player each : players) {
			each.describe();
		}
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void removePlayer(String playerName) {
		for (Player each : players) {
			if (each.getName().equals(playerName)) {
				players.remove(each);
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	
}
