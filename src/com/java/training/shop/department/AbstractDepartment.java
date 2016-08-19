package com.java.training.shop.department;

import com.java.training.shop.interfaces.DepartmentInterface;
import com.java.training.shop.interfaces.EmployeeInterface;
import com.java.training.shop.interfaces.GoodsInterface;
import com.java.training.shop.staff.Consultant;

import java.util.ArrayList;

public abstract class AbstractDepartment implements DepartmentInterface {

    public AbstractDepartment() {
    }

    public AbstractDepartment(String name) {
        this.name = name;
    }

    private String name;
    private ArrayList<EmployeeInterface> employeeList = new ArrayList<EmployeeInterface>();
    private ArrayList<GoodsInterface> goodsList = new ArrayList<GoodsInterface>();

    @Override
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() { return employeeList; }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) { this.employeeList = employeeList; }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() { return goodsList; }

    public void setGoodsList (ArrayList<GoodsInterface> goodsList) { this.goodsList = goodsList; }

    public void addEmployee(Consultant employee) {
        employee.setDepartment(this);
        employeeList.add(employee);
    }

    public void addGoods(GoodsInterface goods) {
        goods.setDepartment(this); // при добавлении товара для него автоматически прописывается департамент
        goodsList.add(goods);
    }
}
