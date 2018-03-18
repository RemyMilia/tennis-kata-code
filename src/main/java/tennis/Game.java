package tennis;

import java.util.HashMap;
import java.util.Map;

public class Game {
	private static final String SCORER = "SCORER";
	private static final String SCORED = "SCORED";
	private int serverScore = 0;
	private int receiverScore = 0;
	private boolean isGame = false;

	public int getServerScore() {
		return serverScore;
	}

	public void setServerScore(int serverScore) {
		this.serverScore = serverScore;
	}

	public int getReceiverScore() {
		return receiverScore;
	}

	public void setReceiverScore(int receiverScore) {
		this.receiverScore = receiverScore;
	}

	public void serverScores() {
		Map<String, Integer> newGameScore = gameScore(serverScore,
				receiverScore);
		serverScore = newGameScore.get(SCORER);
		receiverScore = newGameScore.get(SCORED);
	}

	public void receiverScores() {
		Map<String, Integer> newGameScore = gameScore(receiverScore,
				serverScore);
		receiverScore = newGameScore.get(SCORER);
		serverScore = newGameScore.get(SCORED);
	}

	public boolean isGame() {
		return isGame;
	}

	public void resetGame() {
		isGame = false;
	}

	private Map<String, Integer> gameScore(int scorer, int scored) {
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
				scorer = 0;
				scored = 0;
			}
			break;
		case 1:
			isGame = true;
			scorer = 0;
			scored = 0;
			break;
		}
		gameScoreMap.put(SCORER, scorer);
		gameScoreMap.put(SCORED, scored);
		return gameScoreMap;
	}

}
