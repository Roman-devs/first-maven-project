import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacultyTest {

    @ParameterizedTest
    @MethodSource

    public void FacultyTestFunction(int number, int expected){
        int result = FacultyApp.FacultyTest(number);
        assertEquals(expected, result);
    }
    private static Stream<Arguments>FacultyTestFunction(){
        return Stream.of(
                Arguments.of(0,1),
                Arguments.of(1,1),
                Arguments.of(2,2),
                Arguments.of(3,6)
        );
    }

    @ParameterizedTest
    @MethodSource

    public void FacultyTestFunctionWhile(int number, int expected){
        int result = FacultyApp.FacultyTestWhile(number);
        assertEquals(expected, result);
    }
    private static Stream<Arguments>FacultyTestFunctionWhile(){
        return Stream.of(
                Arguments.of(0,1),
                Arguments.of(1,1),
                Arguments.of(2,2),
                Arguments.of(3,6)
        );
    }
}
