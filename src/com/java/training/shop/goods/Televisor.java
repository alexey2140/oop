package com.java.training.shop.goods;

public class Televisor extends ElectronicDevice {


    public void selectChannel() {
    }

    public void selectChannel(int channelNumber) {
        System.out.println("Select channel # - " + channelNumber);
    }

    public void selectChannel(String channelName) {
        System.out.println("Select channel - " + channelName);
    }

    public Televisor(String name) {
        super(name);
    }

    public Televisor(double price, boolean hasGuarantee, String name, String company) {
        super(price, hasGuarantee, name, company);
    }

}
