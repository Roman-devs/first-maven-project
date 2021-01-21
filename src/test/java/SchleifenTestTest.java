import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchleifenTestTest {
    @Test
    public void moreThan30persons(){
    int participants = 32;
    SchleifenTest.checkPeople(participants);
    assertEquals("There are more than 30 people in the room. Shame on you!", "There are more than 30 people in the room. Shame on you!");
    }
}
