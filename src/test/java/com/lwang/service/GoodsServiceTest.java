package com.lwang.service;

import com.lwang.model.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * GoodsServiceTest.class
 *
 * @author lwang
 * @date 2017/11/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsServiceTest {

    @Resource
    GoodsService goodsService;

    @Test
    public void testSaveGoods() {

        Goods goods = new Goods();
        goods.setId(119);
        goodsService.saveGoods(goods);
    }

}
