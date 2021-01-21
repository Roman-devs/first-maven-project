import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchleifenTestTest {
    @Test
    @DisplayName("PreviousTest")
    public void moreThan30persons(){
    int participants = 32;
    SchleifenTest.checkPeople(participants);
    assertEquals("There are more than 30 people in the room. Shame on you!", "There are more than 30 people in the room. Shame on you!");
    }

    @Test
    @DisplayName("Red Check")
    public void red(){
        int participants = 31;
        String colorStatus = "red";
        String result = SchleifenTest.alarmEvent(participants, colorStatus);
        assertEquals("GTFO!", result);
    }
    @Test
    @DisplayName("Yellow Check with less than 30")
    public void yellow1(){
        int participants = 19;
        String colorStatus = "yellow";
        String result = SchleifenTest.alarmEvent(participants, colorStatus);
        assertEquals("Looking good so far.", result);
    }

    @Test
    @DisplayName("Yellow Check with more than 30")
    public void yellow2(){
        int participants = 35;
        String colorStatus = "yellow";
        String result = SchleifenTest.alarmEvent(participants, colorStatus);
        assertEquals("GTFO!", result);
    }

    @Test
    @DisplayName("Green Check with less than 60")
    public void green1(){
        int participants = 35;
        String colorStatus = "green";
        String result = SchleifenTest.alarmEvent(participants, colorStatus);
        assertEquals("Looking good so far.", result);
    }

    @Test
    @DisplayName("Green Check with more than 60")
    public void green2(){
        int participants = 72;
        String colorStatus = "green";
        String result = SchleifenTest.alarmEvent(participants, colorStatus);
        assertEquals("GTFO!", result);
    }
}
