package com.java.training.shop.client;

import com.java.training.shop.goods.Televisor;
import com.java.training.shop.interfaces.GoodsInterface;
import com.java.training.shop.interfaces.VisitorInterface;

public abstract class AbstractVisitor implements VisitorInterface {

    public AbstractVisitor(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void buy(GoodsInterface goods) {
        System.out.println(goods.getName());

        if (goods instanceof Televisor) {
            ((Televisor)goods).selectChannel();
        }
    }

    @Override
    public void returnGoods(GoodsInterface goods) {}

    @Override
    public String getName() {
        return name;
    }

}
