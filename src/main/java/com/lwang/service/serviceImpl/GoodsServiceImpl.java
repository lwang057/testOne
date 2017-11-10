package com.lwang.service.serviceImpl;

import com.lwang.dao.GoodsMapper;
import com.lwang.model.Goods;
import com.lwang.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * GoodsServiceImpl.class
 *
 * @author lwang
 * @date 2017/11/10.
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    GoodsMapper goodsMapper;

    @Override
    public void saveGoods(Goods goods) {

        goodsMapper.insertSelective(goods);
    }

}
