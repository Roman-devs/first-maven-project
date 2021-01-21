public class SchleifenTest {

    public static void main(String[] args) {

    }

    public static String checkPeople (int people) {
        if (people > 30) {
            return "There are more than 30 people in the room. Shame on you!";
        } else {
            return "You're good to go!";
        }
    }

    public static String alarmEvent(int number, String color){
        switch(color){
            case "red":
                return checkColorStatus(number, 0);
            case "yellow":
                return checkColorStatus(number, 30);
            case "green":
                return checkColorStatus(number, 60);
        }
        return null;
    }

    public static String checkColorStatus(int number, int limit){
        if (number >= limit){
            return "GTFO!";
        } else{
            return "Looking good so far.";
        }
    }
}
