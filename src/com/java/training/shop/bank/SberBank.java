package com.java.training.shop.bank;

public class SberBank extends AbstractBank {

    public SberBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    private String sberBankDiscount;

    @Override
    public void checkInfo() {
        super.checkInfo();
    }

    @Override
    public void giveCredit() {
        // доработанная реализация
    }

    // сбербанк умеет также рассматривать срочные заявки с помощью перегруженного метода
    public void checkInfo(boolean critical) {
        System.out.println("sberbank");
    }
}