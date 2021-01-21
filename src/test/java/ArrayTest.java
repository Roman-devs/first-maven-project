import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {
    @Test
    public void numberOfStudents (){
        //Given
        int numStudents = 10;
        //When
        String[] result = ArrayApp.buildArray(numStudents);
        //Then
        assertEquals(result.length, numStudents);
    }
}
