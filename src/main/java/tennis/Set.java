package tennis;

public class Set {
	private int serverScore = 0;
	private int receiverScore = 0;
	private boolean isSet = false;

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

	public boolean isSet() {
		return isSet;
	}

	public void serverScores() {
		serverScore += 1;
		if (serverScore == 6) {
			isSet = true;
		}
	}

	public void receiverScores() {
		receiverScore += 1;
		if (receiverScore == 6) {
			isSet = true;
		}
	}
}
