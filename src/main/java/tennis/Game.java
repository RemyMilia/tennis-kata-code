package tennis;

public class Game {
	private int serverScore = 0;
	private int receiverScore = 0;

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
		serverScore = gameScore(serverScore);
	}

	public void receiverScores() {
		receiverScore = gameScore(receiverScore);
	}

	private int gameScore(int currentPlayerScore) {
		return currentPlayerScore += (currentPlayerScore == 0 || currentPlayerScore == 15) ? 15
				: 10;
	}
}
