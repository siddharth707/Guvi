package AbsoluteB;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {

        int number;
        long factorial =1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number=input.nextInt();
        input.close();
       if(number <0)
           System.out.println("cant find factorial as negative numebr");
       else if (number<=1)
           System.out.printf("%d!=%d", number, factorial);
       else {
           for (int counter=number; counter >=2; counter --){
               factorial=factorial*counter;
           }
           System.out.printf("%d! = %d" , number, factorial);
            }

    }
}
