package tennis;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TennisGameStepDefs {

	private TennisGame tennisGame;
	private Game game;
	private Set set;
	private Match match;

	@Given("^a new tennis game$")
	public void a_new_tennis_game() throws Exception {
		game = new Game();
		set = new Set();
		match = new Match();
		tennisGame = new TennisGame(match, asList(set), game);
	}

	@When("^the tennis game starts$")
	public void the_tennis_game_starts() throws Exception {
	}

	@Then("^the game score should be (\\d+):(\\d+)$")
	public void the_game_score_should_be(int serverScore, int receiverScore)
			throws Exception {
		assertThat(tennisGame.getGame().getServerScore())
				.isEqualTo(serverScore);
		assertThat(tennisGame.getGame().getReceiverScore()).isEqualTo(
				receiverScore);
	}

	@Then("^the set score should be (\\d+):(\\d+)$")
	public void the_set_score_should_be(int serverScore, int receiverScore)
			throws Exception {
		assertThat(
				tennisGame.getSets().stream().findFirst().get()
						.getReceiverScore()).isEqualTo(serverScore);
		assertThat(
				tennisGame.getSets().stream().findFirst().get()
						.getServerScore()).isEqualTo(receiverScore);
	}

	@Then("^the set number should be (\\d+)$")
	public void the_set_number_should_be(int sets) throws Exception {
		assertThat(tennisGame.getSets().size()).isEqualTo(sets);
	}

	@Then("^the match score should be (\\d+):(\\d+)$")
	public void the_match_score_should_be(int serverScore, int receiverScore)
			throws Exception {
		assertThat(tennisGame.getMatch().getServerScore()).isEqualTo(
				serverScore);
		assertThat(tennisGame.getMatch().getReceiverScore()).isEqualTo(
				receiverScore);
	}

	@When("^the server wins a game point$")
	public void the_server_wins_a_game_s_point() throws Exception {
		tennisGame.serverScores(true);
	}

	@Then("^the game score is (\\d+):(\\d+)$")
	public void the_game_score_is(int arg1, int arg2) throws Exception {
		assertThat(tennisGame.getGame().getServerScore()).isEqualTo(arg1);
		assertThat(tennisGame.getGame().getReceiverScore()).isEqualTo(arg2);
	}

	@When("^the receiver wins a game point$")
	public void the_receiver_wins_a_game_s_point() throws Exception {
		tennisGame.serverScores(false);
	}

	@When("^the score is (\\d+):(\\d+) and the server wins a game point$")
	public void the_score_is_and_the_server_wins_a_game_point(int arg1, int arg2)
			throws Exception {
		tennisGame.getGame().setServerScore(arg1);
		tennisGame.getGame().setReceiverScore(arg2);
		tennisGame.getGame().serverScores();
	}

	@When("^the score is (\\d+):(\\d+) and the receiver wins a game point$")
	public void the_score_is_and_the_receiver_wins_a_game_point(int arg1,
			int arg2) throws Exception {
		tennisGame.getGame().setServerScore(arg1);
		tennisGame.getGame().setReceiverScore(arg2);
		tennisGame.getGame().receiverScores();
	}

	@When("^the score is A:(\\d+), the set score is (\\d+):(\\d+) and the server wins a game point$")
	public void the_score_is_A_the_set_score_is_and_the_server_wins_a_game_point(
			int arg1, int arg2, int arg3) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the set score is (\\d+):(\\d+)$")
	public void the_set_score_is(int arg1, int arg2) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^the score is (\\d+):A, the set score is (\\d+):(\\d+) and the receiver wins a game point$")
	public void the_score_is_A_the_set_score_is_and_the_receiver_wins_a_game_point(
			int arg1, int arg2, int arg3) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^the game score is (\\d+):(\\d+), the set score is (\\d+):(\\d+) and the server wins a game point$")
	public void the_game_score_is_the_set_score_is_and_the_server_wins_a_game_point(
			int arg1, int arg2, int arg3, int arg4) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^the score is (\\d+):(\\d+), the receiver wins a point and the receiver wins a game point$")
	public void the_score_is_the_receiver_wins_a_point_and_the_receiver_wins_a_game_point(
			int arg1, int arg2) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the match score (\\d+):(\\d+)$")
	public void the_match_score(int arg1, int arg2) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
