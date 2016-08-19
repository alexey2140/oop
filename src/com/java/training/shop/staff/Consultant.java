package com.java.training.shop.staff;

import com.java.training.shop.department.AbstractDepartment;
import com.java.training.shop.enums.ConsultResult;
import com.java.training.shop.interfaces.DepartmentInterface;
import com.java.training.shop.interfaces.VisitorInterface;

public class Consultant extends AbstractEmployee {

    public void consult() {

    }

    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(VisitorInterface visitor) {
        super.setFree(false);

        // здесь должна быть логика, купит или пойдет домой

        return ConsultResult.BUY;


    }

    public void send() {

    }

    @Override
    public void setDepartment(DepartmentInterface department) {
        super.setDepartment(department);
    }
}
