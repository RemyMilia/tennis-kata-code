package tennis;

public class Match {
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
		serverScore += 1;
	}

	public void receiverScores() {
		receiverScore += 1;
	}
}
