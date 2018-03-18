package tennis;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TennisGame {
	private Match match;
	private List<Set> sets;
	private Game game;

	public void serverScores() {
		this.game.serverScores();
		if (this.game.isGame()) {
			resolveScore();
		}
	}

	private void resolveScore() {
		this.sets.get(this.sets.size() - 1).serverScores();
		this.game.resetGame();
		if (this.sets.get(this.sets.size() - 1).isSet()) {
			// new copy because of immutable asList in test
			this.sets = new ArrayList<Set>(this.sets);
			this.sets.add(new Set());
			this.match.serverScores();
		}
	}

	public void receiverScores() {
		this.game.receiverScores();
		if (this.game.isGame()) {
			this.sets.get(this.sets.size() - 1).receiverScores();
			this.game.resetGame();
			if (this.sets.get(this.sets.size() - 1).isSet()) {
				this.sets = new ArrayList<Set>(this.sets);
				this.sets.add(new Set());
				this.match.receiverScores();
			}
		}
	}

}
