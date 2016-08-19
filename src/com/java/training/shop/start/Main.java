package com.java.training.shop.start;

import com.java.training.shop.SalesRoom;
import com.java.training.shop.client.CommonVisitor;
import com.java.training.shop.client.VipVisitor;
import com.java.training.shop.department.ElectronicDepartment;
import com.java.training.shop.department.GameDepartment;
import com.java.training.shop.enums.ConsultResult;
import com.java.training.shop.goods.Computer;
import com.java.training.shop.goods.GameConsole;
import com.java.training.shop.goods.Televisor;
import com.java.training.shop.staff.Administrator;
import com.java.training.shop.staff.Consultant;

public class Main {
    public static void main(String[] args) {
        imitateShopWorking();
    }
    private static void imitateShopWorking() {

        SalesRoom salesRoom = new SalesRoom(); // создаем торговый зал

        // создаем администратора всего торгового зала
        Administrator administrator = new Administrator(salesRoom);

        // создаем два департамента (отдела)
        ElectronicDepartment electronicDepartment = new ElectronicDepartment();
        GameDepartment gameDepartment = new GameDepartment();

        // добавляем департаменты в торговый зал
        salesRoom.addDepartment(electronicDepartment);
        salesRoom.addDepartment(gameDepartment);

        // добавляем сотрудников в каждый отдел
        Consultant consultant = new Consultant("Джон");
        consultant.setFree(true);

        Consultant consultant2 = new Consultant("Джесс");

        electronicDepartment.addEmployee(consultant);
        electronicDepartment.addEmployee(consultant2);

        // создаем товары для отделов
        Computer computer = new Computer(200, true, "Zenbook", "Asus", 2048);
        Televisor televisor = new Televisor(1000, false, "SmartTV", "Samsung");
        GameConsole xbox = new GameConsole("XBOX", 1024);

        // добавляем товары в отделы
        electronicDepartment.addGoods(televisor);
        electronicDepartment.addGoods(computer);
        gameDepartment.addGoods(xbox);

        // создаем покупателей
        CommonVisitor visitor1 = new CommonVisitor("Джон");
        VipVisitor vipVisitor = new VipVisitor("Джон", 50);


        // ищем свободного консультанта из нужного отдела
        ConsultResult consultResult = administrator.getFreeConsultant(electronicDepartment).consult(visitor1);

        switch (consultResult) {
            case BUY:
                visitor1.buy(televisor);
                break;
            case EXIT:
                break;
        }



        {
//        GoodsInterface goods = new Televisor("Samsung");
//        ((Televisor)goods).selectChannel();
//        Subwoofer subwoofer = new Subwoofer("Microlab");
//
//        Computer computer = new Computer("MacBook");
//        Computer computer2 = new Computer("ASUS");
//
//        CommonVisitor commonVisitor = new CommonVisitor();
//
//        commonVisitor.buy(goods);
//        commonVisitor.buy(computer);
//        commonVisitor.buy(computer2);
//        commonVisitor.buy(subwoofer);
//
//        SberBank sberBank = new SberBank("Sberbank", "test disc");
//        sberBank.checkInfo(true);
//        sberBank.checkInfo();
//        sberBank.checkInfo();
//
//        VTB vtb = new VTB("VTB", "test disc");
//        vtb.checkInfo();
//        vtb.checkInfo();
//
//        System.out.println("SberBank.requestCount = " + SberBank.requestCount);
        }
    }
}
