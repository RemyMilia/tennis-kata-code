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

	public void serverScores(boolean b) {
		if (b) {
			this.game.serverScores();
			if (this.game.isGame()) {
				endGame();
				if (this.sets.size() == 0) {
					this.sets.add(new Set(1, 0));
				} else {
					this.sets.get(this.sets.size() - 1).serverScores();
				}
			}
		} else {
			this.game.receiverScores();
			if (this.game.isGame()) {
				endGame();
				if (this.sets.size() == 0) {
					this.sets.add(new Set(1, 0));
				} else {
					this.sets.get(this.sets.size() - 1).receiverScores();
				}
			}
		}

	}

	private void endGame() {
		this.game.setReceiverScore(0);
		this.game.setServerScore(0);
		this.game.resetGame();
	}
}
