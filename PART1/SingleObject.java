package PART1;
public class SingleObject   {

    //create object of SingleObject
    private static SingleObject instance = new SingleObject();

    // private constructor
    private SingleObject(){}

    //get object 
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}