public class Demo {
    public static void main(String[] args) {
        double monday = new Weather().printData("SUNDAY");
        System.out.println(monday);
    }
}


enum DayType {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class Weather {
    double printData(String day) {
        switch (day) {
            case "MONDAY":
                return 33.6;
            case "TUESDAY":
                return 10.5;
            case "WEDNESDAY":
                return 78.5;
            case "THURSDAY":
                return 67.4;
            case "FRIDAY":
                return 12.3;
            case "SUNDAY":
                return 150.5;
            case "SATURDAY":
                return 454.4;
            default:
                return 0.0;
        }
    }
}
