package com.lsh.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lsh.gulimall.common.utils.PageUtils;

import com.lsh.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author codestar
 * @email codestar@gmail.com
 * @date 2021-06-01 00:30:32
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

