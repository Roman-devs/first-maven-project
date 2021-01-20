public class CheckStringLengthApp {

    public static void main(String[] args) {
        // Initializing variables
        int int1 = 2;
        int int2 = 101;
        String exampleString = "fancyPantssssssssssssssssssssssssssss";
        // Results
        int result = sum(int1, int2);
        boolean result2 = check100(int1, int2);
        boolean result3 = fancy(exampleString);
        boolean result4 = lttwenty(exampleString);
        String resTest = String.valueOf(result4);
        // Print Results exercise 1
        System.out.println("Summe: "+result);
        System.out.println("One of both values is greater than 100: " + result2);
        // Print Results exercise 2
        System.out.println("Example String: " + exampleString);
        System.out.println("Contains fancy: " + result3);
        System.out.println("Longer than twenty digits:" + result4);
    }

    public static int sum (int someValue, int otherValue){
        return someValue + otherValue;
    }

    public static boolean check100(int a, int b){
        boolean checka = (a > 100) || (b > 100);
        return checka;
    }

    public static boolean fancy (String example){
        boolean checkContains = example.contains("fancy");
        return checkContains;
    }

    public static boolean lttwenty (String example){
        boolean checkLength = example.length()>=20;
        return checkLength;
    }
}

