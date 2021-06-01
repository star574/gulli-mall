package com.lsh.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;


import com.lsh.gulimall.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lsh.gulimall.member.entity.MemberReceiveAddressEntity;
import com.lsh.gulimall.member.service.MemberReceiveAddressService;
import com.lsh.gulimall.common.utils.PageUtils;



/**
 * 会员收货地址
 *
 * @author codestar
 * @email codestar@gmail.com
 * @date 2021-06-01 00:34:04
 */
@RestController
@RequestMapping("member/memberreceiveaddress")
public class MemberReceiveAddressController {
	@Autowired
	private MemberReceiveAddressService memberReceiveAddressService;

	/**
     * 列表
     */
	@RequestMapping("/list")
	// @RequiresPermissions("member:memberreceiveaddress:list")
	public R list(@RequestParam Map<String, Object> params) {
		PageUtils page = memberReceiveAddressService.queryPage(params);

		return R.ok().put("page", page);
	}


	/**
     * 信息
     */
	@RequestMapping("/info/{id}")
	// @RequiresPermissions("member:memberreceiveaddress:info")
	public R info(@PathVariable("id") Long id) {
            MemberReceiveAddressEntity memberReceiveAddress = memberReceiveAddressService.getById(id);

		return R.ok().put("memberReceiveAddress", memberReceiveAddress);
	}

	/**
     * 保存
     */
	@RequestMapping("/save")
	// @RequiresPermissions("member:memberreceiveaddress:save")
	public R save(@RequestBody MemberReceiveAddressEntity memberReceiveAddress) {
            memberReceiveAddressService.save(memberReceiveAddress);

		return R.ok();
	}

	/**
     * 修改
     */
	@RequestMapping("/update")
	// @RequiresPermissions("member:memberreceiveaddress:update")
	public R update(@RequestBody MemberReceiveAddressEntity memberReceiveAddress) {
            memberReceiveAddressService.updateById(memberReceiveAddress);

		return R.ok();
	}

	/**
     * 删除
     */
	@RequestMapping("/delete")
	// @RequiresPermissions("member:memberreceiveaddress:delete")
	public R delete(@RequestBody Long[] ids) {
            memberReceiveAddressService.removeByIds(Arrays.asList(ids));

		return R.ok();
	}

}
