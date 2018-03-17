package tennis;

public class Game {
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
		serverScore = gameScore(serverScore, receiverScore);
	}

	public void receiverScores() {
		receiverScore = gameScore(receiverScore, serverScore);
	}

	public boolean isGame() {
		return isGame;
	}

	public void resetGame() {
		isGame = false;
	}

	private int gameScore(int currentPlayerScore, int otherSidePlayerScore) {
		if (currentPlayerScore == 0 || currentPlayerScore == 15) {
			currentPlayerScore += 15;
		} else if (currentPlayerScore == 30) {
			currentPlayerScore += 10;
		} else if (currentPlayerScore == 40 && otherSidePlayerScore == 40) {
			currentPlayerScore = 1;
		} else if (currentPlayerScore == 1) {
			isGame = true;
		}
		return currentPlayerScore;
	}

}
