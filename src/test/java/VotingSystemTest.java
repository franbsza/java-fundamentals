import data.structures.challenge.VotingSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VotingSystemTest {

    VotingSystem votingSystem = new VotingSystem();

    @Test
    void executeTest(){
        votingSystem.vote("Contestant One");
        votingSystem.vote("Contestant One");
        votingSystem.vote("Contestant One");
        votingSystem.vote("Contestant Two");
        votingSystem.vote("Contestant Three");
        votingSystem.vote("Contestant Three");
        votingSystem.vote("Contestant Three");
        votingSystem.vote("Contestant Three");
        votingSystem.vote("Contestant Three");
        votingSystem.vote("Contestant One");

        Assertions.assertNotNull(votingSystem.getVotes());
        Assertions.assertEquals(4, votingSystem.getVotes().get("Contestant One"));
        Assertions.assertEquals(1, votingSystem.getVotes().get("Contestant Two"));
        Assertions.assertEquals(5, votingSystem.getVotes().get("Contestant Three"));
    }
}
