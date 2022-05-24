package Strings;

class cal{
    public int add(int k, int j){
        return k+j;
    }
}
class calcu extends cal{
    public int sub(int k, int j){
        return k-j;
    }
}

public class inheritance {
    public static void main(String[] args) {
        calcu c1= new calcu();
        int result1= c1.add(5,4);
        int result2= c1.sub(10, 5);

        System.out.println(result1);
        System.out.println(result2);

    }
}
