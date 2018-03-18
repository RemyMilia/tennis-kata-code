package tennis;

import lombok.Data;

@Data
public class Match {
	private int serverScore = 0;
	private int receiverScore = 0;

	public void serverScores() {
		serverScore += 1;
	}

	public void receiverScores() {
		receiverScore += 1;
	}
}
