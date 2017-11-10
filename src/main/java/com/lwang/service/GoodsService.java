package com.lwang.service;

import com.lwang.model.Goods;

/**
 * GoodsService.class
 *
 * @author lwang
 * @date 2017/11/10.
 */
public interface GoodsService {

    /**
     * 添加商品ID
     * @param goods
     */
    void saveGoods(Goods goods);

}
