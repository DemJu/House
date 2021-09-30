package people;

public class Owner {

    private String name = "Tom";
    private String family = "Hardi";
    private final int age = 30;
    private String[] nameArray = {"Tom","Piter","Vitia","Bob"};
    private String[] familyArray = {"Hardi","Parcker","Victory","Marli"};

    public String getName() {
        this.setName(nameArray[(int)(Math.random()*familyArray.length)]);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        this.setFamily(familyArray[(int)(Math.random()*familyArray.length)]);
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }
}
