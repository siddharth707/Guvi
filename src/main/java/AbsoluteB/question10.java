package AbsoluteB;

import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {

        int num1;
        int num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the two number");
        num1=sc.nextInt();
        num2=sc.nextInt();
        if (num1<num2){
            System.out.println(num1);
        }
        else if (num2<num1) {
            System.out.println(num2);

        }

    }
}
