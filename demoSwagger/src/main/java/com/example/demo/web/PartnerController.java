package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Partner;
import com.example.demo.service.impl.PartnerService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

//RestController：默认类中的方法都会以json的格式返回。
@RestController
@RequestMapping("/partner")
public class PartnerController {
	
	@Autowired
	PartnerService partnerService;
	
	//查询
    @ApiOperation(value="获取用户列表", notes="获取列表")
	@RequestMapping(value="/findPartner",method={RequestMethod.GET})
	public List<Partner> findPartner() {
		// TODO Auto-generated method stub
		return partnerService.findPartner();
	}
    @ApiOperation(value="获取单个用户信息", notes="获取用户")
	@RequestMapping(value="/findPartnerById",method={RequestMethod.GET})
	public Partner findPartnerById(@RequestParam(value = "partnerId", required = true)String partnerId) {
		// TODO Auto-generated method stub
		return partnerService.findPartnerById(partnerId);
	}

    @ApiOperation(value="增加用户信息", notes="增加用户")
	@RequestMapping(value="/insertPartner",method={RequestMethod.POST})
	public int insertPartner(@RequestBody Partner partner) {
		// TODO Auto-generated method stub
		return partnerService.insertPartner(partner);
	}

    @ApiOperation(value="更新用户信息", notes="更新用户")
    @ApiImplicitParam(name = "partner", value = "partner实体", required = true, dataType = "Partner")
	@RequestMapping(value="/updatePartner",method={RequestMethod.PUT})
	public int updatePartner(@RequestBody Partner partner) {
		// TODO Auto-generated method stub
		return partnerService.updatePartner(partner);
	}
    
    @ApiOperation(value="删除用户信息", notes="删除")
	@RequestMapping(value="/deletePartnerById",method={RequestMethod.DELETE})
	public int deletePartnerById(@RequestParam(value = "partnerId", required = true) String partnerId) {
		// TODO Auto-generated method stub
		return partnerService.deletePartnerById(partnerId);
	}


}
