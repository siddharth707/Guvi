package Strings;

class test{
    void show(){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }
    void show(String a, int b ){
        System.out.println("3");
    }
    public static void main(String[] args) {

        test t= new test();
        t.show();

    }
}
