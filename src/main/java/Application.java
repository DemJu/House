import Home.Housing;
import People.Owner;

public class Application {

    public static void main(String[] args){
        Housing home = new Housing();
        Owner owr = new Owner();
        System.out.println("Owner: " + home.getOwnerHome() + ", age:" + owr.getAge());
        System.out.println("Home floor: " + home.getCountFloor() + ", color: " + home.getColourHome());
    }
}