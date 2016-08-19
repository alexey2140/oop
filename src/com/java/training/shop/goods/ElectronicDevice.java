package com.java.training.shop.goods;

import com.java.training.shop.interfaces.ElectronicInterface;

public class ElectronicDevice extends AbstractGoods implements ElectronicInterface {

    public ElectronicDevice() {

    }

    public ElectronicDevice(String name) {
        super(name);
    }

    public ElectronicDevice(double price, boolean hasGuarantee, String name, String company) {
        super(price, hasGuarantee, name, company);
    }

    @Override
    public void on() {
        // общая реализация
    }
    @Override
    public void off() {
        // общая реализация
    }
}
