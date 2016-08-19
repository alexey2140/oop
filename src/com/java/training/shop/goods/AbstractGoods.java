package com.java.training.shop.goods;

import com.java.training.shop.department.AbstractDepartment;
import com.java.training.shop.interfaces.DepartmentInterface;
import com.java.training.shop.interfaces.GoodsInterface;

public abstract class AbstractGoods implements GoodsInterface {

    public static final int DEFAULT_GUARANTEE = 2;

    public AbstractGoods() {

    }

    public AbstractGoods(String name) { this.name = name; }

    public AbstractGoods(double price, boolean hasGuarantee, String name, String company) {
        this.price = price;
        this.hasGuarantee = hasGuarantee;
        this.name = name;
        this.company = company;
    }

    // свойства которые будут иметь все товары
    private double price;

    private boolean hasGuarantee;

    private String name;

    private AbstractDepartment department;

    private String company;

    public static void print(String message) {
        System.out.println("message = " + message);

    }


    @Override
    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    @Override
    public boolean hasGuarantee() { return hasGuarantee; }

    public void setHasGuarantee(boolean hasGuarantee) { this.hasGuarantee = hasGuarantee; }

    @Override
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public DepartmentInterface getDepartment() { return department; }

    public void setDepartment(AbstractDepartment department) {this.department = department; }

    @Override
    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company; }
}
