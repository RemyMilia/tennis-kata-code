package tennis;

public class Set {
	private int serverScore = 0;
	private int receiverScore = 0;

	public Set(int serverScore, int receiverScore) {
		super();
		this.serverScore = serverScore;
		this.receiverScore = receiverScore;
	}

	public Set() {
	}

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
}
