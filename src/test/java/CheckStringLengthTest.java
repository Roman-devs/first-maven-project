import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckStringLengthTest {
    @Test
    public void additionoftwonumbers (){
        //Given
        int firstValue  = 5;
        int secondValue = 5;
        //When
        int result = CheckStringLengthApp.sum(firstValue, secondValue);
        //Then
        assertEquals(10, result);
    }

    @Test
    public void greaterthanhundred(){
        //Given
        int firstValue = 67;
        int secondValue = 101;
        //When
        boolean result = CheckStringLengthApp.check100(firstValue, secondValue);
        //Then
        assertEquals(true,result);
    }
}
