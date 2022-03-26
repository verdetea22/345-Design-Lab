package PART1;
public class SingletonPatternDemo {

    public static void main(String[] args){

        SingleObject object = SingleObject.getInstance();

        object.showMessage();

    } //end of static void main


} // end of class