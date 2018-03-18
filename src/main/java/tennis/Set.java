package tennis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Set {
	private int serverScore = 0;
	private int receiverScore = 0;
	private boolean isSet = false;

	public void serverScores(boolean isScoredByServer) {
		if (isScoredByServer) {
			serverScore += 1;
		} else {
			receiverScore += 1;
		}

		if (serverScore == 6 || receiverScore == 6) {
			isSet = true;
		}
	}

	public boolean isSet() {
		return isSet;
	}
}
