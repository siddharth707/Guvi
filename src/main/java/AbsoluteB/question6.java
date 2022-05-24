package AbsoluteB;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n, i=1;
        System.out.println("give the range");
        n= cs.nextInt();
        while (i<=n){
            System.out.print(i * i + " ");
                    i++;

        }
        cs.close();
    }
}
