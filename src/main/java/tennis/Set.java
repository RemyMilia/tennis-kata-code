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
