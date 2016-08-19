package com.java.training.shop.interfaces;

import java.util.ArrayList;

public interface VisitorInterface {

    void buy(GoodsInterface goods);

    void returnGoods(GoodsInterface goods);

    String getName();
}
