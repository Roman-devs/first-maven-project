public class ArrayApp {

    public static void main(String[] args) {

    }

    public static String[] buildArray (int numStudents){
        String [] studentArray = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            studentArray[i] = "Student"+i;
        }
        return studentArray;
    }
}
