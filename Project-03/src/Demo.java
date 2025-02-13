public class Demo {
    public static void main(String[] args) {
        // double monday = new Weather().printData(DayType.MONDAY);
        DayType day = DayType.MONDAY;//Not Object But,have a Constructor
        // DayType day = new DayType();//Wrong (Not Create Object)
        double monday = new Weather().printData(day);
        //day.code=10;
        System.out.println(monday);

        System.out.println("-----------");
        System.out.println(day.name());
        System.out.println(day.code);
        System.out.println("-----------");
    }
}

enum DayType {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    final int code;

    DayType(int code) {
        this.code = code;
    }
}


class Weather {

    double printData(DayType day) {

        for (DayType d: DayType.values() //Values() ---> Array set
             ) {
            System.out.println(d.name());
            System.out.println(d.code);
        }



        switch (day) {
            case MONDAY:
                return 33.6;
            case TUESDAY:
                return 10.5;
            case WEDNESDAY:
                return 78.5;
            case THURSDAY:
                return 67.4;
            case FRIDAY:
                return 12.3;
            case SUNDAY:
                return 150.5;
            case SATURDAY:
                return 454.4;
            default:
                return 0.0;
        }
    }
}
