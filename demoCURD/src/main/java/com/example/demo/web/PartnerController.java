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

//RestController：默认类中的方法都会以json的格式返回。
@RestController
@RequestMapping("/partner")
public class PartnerController {
	
	@Autowired
	PartnerService partnerService;
	
	@RequestMapping(value="/findPartner",method={RequestMethod.GET})
	public List<Partner> findPartner() {
		// TODO Auto-generated method stub
		return partnerService.findPartner();
	}

	@RequestMapping(value="/findPartnerById",method={RequestMethod.GET})
	public Partner findPartnerById(@RequestParam(value = "partnerId", required = true)String partnerId) {
		// TODO Auto-generated method stub
		return partnerService.findPartnerById(partnerId);
	}

	@RequestMapping(value="/insertPartner",method={RequestMethod.POST})
	public int insertPartner(@RequestBody Partner user) {
		// TODO Auto-generated method stub
		return partnerService.insertPartner(user);
	}

	@RequestMapping(value="/updatePartner",method={RequestMethod.PUT})
	public int updatePartner(@RequestBody Partner user) {
		// TODO Auto-generated method stub
		return partnerService.updatePartner(user);
	}

	@RequestMapping(value="/deletePartnerById",method={RequestMethod.DELETE})
	public int deletePartnerById(@RequestParam(value = "partnerId", required = true) String partnerId) {
		// TODO Auto-generated method stub
		return partnerService.deletePartnerById(partnerId);
	}


}
