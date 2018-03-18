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
		game.serverScores(true);
		if (game.isGame()) {
			resolveScoreServerPoint(true);
		}
	}

	public void receiverScores() {
		game.serverScores(false);
		if (game.isGame()) {
			resolveScoreServerPoint(false);
		}
	}

	private void resolveScoreServerPoint(boolean isScoredByServer) {
		Set currentSet = sets.get(sets.size() - 1);
		currentSet.serverScores(isScoredByServer ? true : false);
		if (currentSet.isSet()) {
			// new copy because of immutable asList in tests
			sets = new ArrayList<Set>(sets);
			sets.add(new Set());
			match.serverScores(isScoredByServer ? true : false);
		}
		game.resetGame();
	}

}
