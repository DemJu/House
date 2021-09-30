import home.Housing;
import people.Owner;

public class Application {

    private static final String city = "Izhevsk";

    public static void main(String[] args)
    {
        Housing home = new Housing();
        Owner owr = new Owner();

        System.out.println("Owner: " + home.getOwnerHome() + ", age: " + owr.getAge());
        System.out.println("Home floor: " + home.getCountFloor() + ", color: " + home.getColourHome());
        System.out.println("City: " + city);
    }
}