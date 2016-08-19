package com.java.training.shop.client;

import com.java.training.shop.interfaces.GoodsInterface;

public class VipVisitor extends AbstractVisitor {

    public VipVisitor(String name, float discount) {
        super(name);
        this.discount = discount;
    }

    private float discount;

    @Override
    public void buy(GoodsInterface goods) {
        if(!checkDiscount()) {
            super.buy(goods);
        }else {
            //купить со скидкой
        }
    }

    private boolean checkDiscount() {
        return discount > 0;
    }
}
