package model;

public class Pet {

    public String name;
    public int    age;
    public int    price;
    public String product;
    public int    timePeriod;

    public Pet(String name, int price, String product, int timePeriod, int age) {
        this.name       = name;
        this.price      = price;
        this.product    = product;
        this.timePeriod = timePeriod;
        this.age        = age;
    }

}
