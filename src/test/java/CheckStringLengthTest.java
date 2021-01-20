import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckStringLengthTest {
    @Test
    public void longerThanTwentyCharacters (){
        //Given
        String testString = "asasasaasasasasasasasasasasasasasa";
        //When
        boolean result = CheckStringLengthApp.lttwenty(testString);
        //Then
        assertEquals(true, result);
    }
}
