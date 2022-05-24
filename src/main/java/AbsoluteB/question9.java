package AbsoluteB;

import java.util.Scanner;

public class question9 {
    private static Scanner sc;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the Kilometers =  ");
        int kilometer = sc.nextInt();

        int meter = kilometer * 1000;
        int centimeter = kilometer * 100000;

        System.out.println("Distance in Meters      = " + meter);
        System.out.println("Distance in CentiMeters = " + centimeter);


    }
}