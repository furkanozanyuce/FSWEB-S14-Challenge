package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private  double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    //constructor
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    //setter
    protected void setPrice(double newPrice) {
        this.price = newPrice;
    }

    //method
    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double total = this.price;

        System.out.println("Burger Name: " + getName());
        System.out.println("Burger Meat: " + getMeat());
        System.out.println("BreadRoll Type: " + getBreadRollType());

        if (this.addition1Name != null) {
            total += this.addition1Price;
            System.out.println("Addition1: " + getAddition1Name());
        }

        if (this.addition2Name != null) {
            total += this.addition2Price;
            System.out.println("Addition2: " + getAddition2Name());
        }
        if (this.addition3Name != null) {
            total += this.addition3Price;
            System.out.println("Addition3: " + getAddition3Name());
        }
        if (this.addition4Name != null) {
            total += this.addition4Price;
            System.out.println("Addition4: " + getAddition4Name());
        }
        this.price = total;
        //class castingle heathy'ye price yazdırmıyo çünkü onun kendi toplam price'ı var
        if (this.getClass().equals(Hamburger.class) || this.getClass().equals(DeluxeBurger.class)) {
            System.out.println("Price: " + total);
        }
        return this.price;
    }
}
