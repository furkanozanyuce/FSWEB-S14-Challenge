package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    @Override
    public double itemizeHamburger() {
        double normalTotal = super.itemizeHamburger();

        double extraTotal = 0.0;

        if (this.healthyExtra1Name != null) {
            extraTotal += this.healthyExtra1Price;
            System.out.println("HealthyAddition1: " + getHealthyExtra1Name());
        }

        if (this.healthyExtra2Name != null) {
            extraTotal += this.healthyExtra2Price;
            System.out.println("HealthyAddition2: " + getHealthyExtra2Name());
        }

        double finalPrice = normalTotal + extraTotal;
        super.setPrice(finalPrice);
        System.out.println("Price: " + finalPrice);
        return finalPrice;
    }
}
