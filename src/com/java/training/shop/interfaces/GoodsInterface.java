package com.java.training.shop.interfaces;

import com.java.training.shop.department.AbstractDepartment;

public interface GoodsInterface {

    //общие методы для любого товара
    double getPrice();

    boolean hasGuarantee();

    String getName();

    DepartmentInterface getDepartment();

    String getCompany();

    void setDepartment(AbstractDepartment abstractDepartment);
}
