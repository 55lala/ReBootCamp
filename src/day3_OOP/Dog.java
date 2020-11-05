package day3_OOP;

public class Dog extends Animal{

    //Dog is an Animal
    //Dog has a name
    public Dog(){
        super(9);
    }
   // public Dog(int i){
      //  super(i);
    public Dog(int i){
        this();
    }
}
