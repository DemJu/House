package Home;

import People.Owner;

public class Housing {

    private String ownerHome;
    private int countFloor = 1;
    private String colourHome = "Black";

    public String getOwnerHome() {
        Owner owr = new Owner();
        this.setOwnerHome(owr.getName() + " " + owr.getFamily());
        return ownerHome;
    }

    public void setOwnerHome(String ownerHome) {
        this.ownerHome = ownerHome;
    }

    public int getCountFloor() {
        return countFloor;
    }

    public void setCountFloor(int countFloor) {
        this.countFloor = countFloor;
    }

    public String getColourHome() {
        return colourHome;
    }

    public void setColourHome(String colourHome) {
        this.colourHome = colourHome;
    }
}
