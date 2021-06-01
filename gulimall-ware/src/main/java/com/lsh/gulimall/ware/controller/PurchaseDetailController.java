package com.lsh.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;


import com.lsh.gulimall.common.utils.PageUtils;
import com.lsh.gulimall.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lsh.gulimall.ware.entity.PurchaseDetailEntity;
import com.lsh.gulimall.ware.service.PurchaseDetailService;

/**
 * 
 *
 * @author codestar
 * @email codestar@gmail.com
 * @date 2021-06-01 00:36:48
 */
@RestController
@RequestMapping("ware/purchasedetail")
public class PurchaseDetailController {
	@Autowired
	private PurchaseDetailService purchaseDetailService;

	/**
     * 列表
     */
	@RequestMapping("/list")
	// @RequiresPermissions("ware:purchasedetail:list")
	public R list(@RequestParam Map<String, Object> params) {
		PageUtils page = purchaseDetailService.queryPage(params);

		return R.ok().put("page", page);
	}


	/**
     * 信息
     */
	@RequestMapping("/info/{id}")
	// @RequiresPermissions("ware:purchasedetail:info")
	public R info(@PathVariable("id") Long id) {
            PurchaseDetailEntity purchaseDetail = purchaseDetailService.getById(id);

		return R.ok().put("purchaseDetail", purchaseDetail);
	}

	/**
     * 保存
     */
	@RequestMapping("/save")
	// @RequiresPermissions("ware:purchasedetail:save")
	public R save(@RequestBody PurchaseDetailEntity purchaseDetail) {
            purchaseDetailService.save(purchaseDetail);

		return R.ok();
	}

	/**
     * 修改
     */
	@RequestMapping("/update")
	// @RequiresPermissions("ware:purchasedetail:update")
	public R update(@RequestBody PurchaseDetailEntity purchaseDetail) {
            purchaseDetailService.updateById(purchaseDetail);

		return R.ok();
	}

	/**
     * 删除
     */
	@RequestMapping("/delete")
	// @RequiresPermissions("ware:purchasedetail:delete")
	public R delete(@RequestBody Long[] ids) {
            purchaseDetailService.removeByIds(Arrays.asList(ids));

		return R.ok();
	}

}
