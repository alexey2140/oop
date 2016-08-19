package com.java.training.shop;

import com.java.training.shop.interfaces.DepartmentInterface;
import com.java.training.shop.interfaces.VisitorInterface;

import java.util.ArrayList;

public class SalesRoom {

    public static final String NAME = "technodom";

    private ArrayList<DepartmentInterface> departmentList = new ArrayList<DepartmentInterface>();// в каждом деппартаменте имеются свои отделы

    private ArrayList<VisitorInterface> visitorList = new ArrayList<VisitorInterface>();

    public ArrayList<DepartmentInterface> getDepartmentList() { return departmentList; }

    public void addDepartment (DepartmentInterface department) { departmentList.add(department); }

    public void addVisitor(VisitorInterface visitor) { visitorList.add(visitor); }

}
