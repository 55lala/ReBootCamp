package day2;

public class Examples {
    public static void main(String[] args) {
        new Examples(7, 4);
    }
        public Examples(){
        System.out.println("no param");
    }
    public Examples (int a){
        System.out.println(a);
    }
    public Examples(int a, int b){
        this(a);
        System.out.println(b);
    }
}
