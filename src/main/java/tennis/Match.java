package tennis;

import lombok.Data;

@Data
public class Match {
	private int serverScore = 0;
	private int receiverScore = 0;

	public void serverScores(boolean isScoredByServer) {
		if (isScoredByServer) {
			serverScore += 1;
		} else {
			receiverScore += 1;
		}
	}

}
