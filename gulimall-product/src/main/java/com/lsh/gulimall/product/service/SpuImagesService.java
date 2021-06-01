package com.lsh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lsh.gulimall.common.utils.PageUtils;
import com.lsh.gulimall.common.utils.Query;
import com.lsh.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author codestar
 * @email sunlightcs@gmail.com
 * @date 2021-05-31 22:31:07
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

