package com.epam.conditions;

public class SeasonDeterminer {
    public static final String WINTER = "Winter";
    public static final String SPRING = "Spring";
    public static final String SUMMER = "Summer";
    public static final String AUTUMN = "Autumn";

    public void tellTheSeason(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(WINTER);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(SPRING);
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(SUMMER);
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(AUTUMN);
                break;
            default:
                System.out.println("Wrong month number");
                break;
        }
    }

}
