package com.java.training.shop.goods;

public class Computer extends ElectronicDevice {


    private int ram;

    public void loadOS() {

    }

    public Computer(String name) {
        setName(name);
    }

    public Computer(String name, int ram) {
        super(name);
        this.ram = ram;
    }

    public Computer(double price, boolean hasGuarantee, String name, String company, int ram) {
        super(price, hasGuarantee, name, company);
        this.ram = ram;
    }
}
