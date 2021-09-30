package home;

import people.Owner;

public class Housing {

    private String ownerHome;
    private final int countFloor = 2;
    private String colourHome = "Black";
    private String[] colourHomeArray = {"Black","Blue","Red","White"};

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

    public String getColourHome() {
        this.setColourHome(colourHomeArray[(int) (Math.random()*colourHomeArray.length)]);
        return colourHome;
    }

    public void setColourHome(String colourHome) {
        this.colourHome = colourHome;
    }
}
