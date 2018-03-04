package tennis;

import java.util.List;

public class TennisGame {
	private Match match;
	private List<Set> sets;
	private Game game;

	public TennisGame(Match match, List<Set> sets, Game game) {
		super();
		this.match = match;
		this.sets = sets;
		this.game = game;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public List<Set> getSets() {
		return sets;
	}

	public void setSets(List<Set> sets) {
		this.sets = sets;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
}
