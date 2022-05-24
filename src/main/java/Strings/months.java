package Strings;

public class months {
    public static void main(String[] args) {
        int month=8;
        String monthString="";
        switch(month){
            case 1: monthString="31-Jan";
        break;
        case 2: monthString="28-Feb";
        break;
        case 3: monthString="31-Mar";
        break;
        case 4: monthString="30-Apr";
        break;
        case 5: monthString="31- may";
        break;
        case 6: monthString="30- Jun";
        break;
        case 7: monthString="31- July";
        break;
        case 8: monthString="31- Aug";
        break;
        case 9: monthString="30- Sep";
        break;
        case 10: monthString="31- oct";
        break;
        case 11: monthString="30- Nov";
        break;
        case 12: monthString="31- Dec";
        break;
        default:System.out.print("Invalid month!");
    }
    System.out.println(monthString);
}}

