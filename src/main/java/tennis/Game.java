package tennis;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Game {
	private static final String SCORER = "SCORER";
	private static final String SCORED = "SCORED";

	private int serverScore = 0;
	private int receiverScore = 0;
	private boolean isGame = false;

	public void serverScores(boolean isScoredByServer) {
		Map<String, Integer> newGameScore;
		if (isScoredByServer) {
			newGameScore = gameScorer(serverScore, receiverScore);
			serverScore = newGameScore.get(SCORER);
			receiverScore = newGameScore.get(SCORED);
		} else {
			newGameScore = gameScorer(receiverScore, serverScore);
			serverScore = newGameScore.get(SCORED);
			receiverScore = newGameScore.get(SCORER);
		}
	}

	public boolean isGame() {
		return isGame;
	}

	public void resetGame() {
		isGame = false;
	}

	private Map<String, Integer> gameScorer(int scorer, int scored) {
		Map<String, Integer> gameScoreMap = new HashMap<>();
		switch (scorer) {
		case 0:
		case 15:
			scorer += 15;
			break;
		case 30:
			scorer += 10;
			break;
		case 40:
			if (scored == 40) {
				scorer = 1;
			} else if (scored == 1) {
				scored = 40;
			} else {
				isGame = true;
				scorer = scored = 0;
			}
			break;
		case 1:
			isGame = true;
			scorer = scored = 0;
			break;
		}
		gameScoreMap.put(SCORER, scorer);
		gameScoreMap.put(SCORED, scored);
		return gameScoreMap;
	}
}
