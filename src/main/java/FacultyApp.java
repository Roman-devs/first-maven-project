public class FacultyApp {


    public static int FacultyTest(int number){
        int result = 1;
        for(int i = 1; i < number + 1; i++){
            result = result * i;
        }
        return result;
    }

    public static int FacultyTestWhile(int number){
        int result = 1;
        int numberGiven = number;
        while (numberGiven > 0) {
            result = numberGiven * result;
            numberGiven -= 1;
        }
        return result;
    }
}
