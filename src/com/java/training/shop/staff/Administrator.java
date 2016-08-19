package com.java.training.shop.staff;

import com.java.training.shop.SalesRoom;
import com.java.training.shop.interfaces.DepartmentInterface;
import com.java.training.shop.interfaces.EmployeeInterface;

public class Administrator {

    private SalesRoom salesRoom;

    public Administrator(SalesRoom salesRoom) {
        this.salesRoom = salesRoom;
    }

    public Consultant getFreeConsultant (DepartmentInterface departmentInterface) {
        for (EmployeeInterface employee : departmentInterface.getEmployeeList()) {
            if (employee instanceof Consultant) {
                if (employee.isFree()) {
                    return (Consultant) employee;
                }
            }
        }

        return null;
    }


}
