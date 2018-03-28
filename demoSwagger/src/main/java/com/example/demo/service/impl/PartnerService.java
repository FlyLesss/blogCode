package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Partner;
import com.example.demo.mapper.PartnerMapper;
import com.example.demo.service.api.IPartnerService;

@Service
public class PartnerService implements IPartnerService {

	@Autowired
	PartnerMapper partnerMapper;
	@Override
	public List<Partner> findPartner() {
		// TODO Auto-generated method stub
		return partnerMapper.findPartner();
	}

	@Override
	public Partner findPartnerById(String partnerId) {
		// TODO Auto-generated method stub
		return partnerMapper.findPartnerById(partnerId);
	}

	@Override
	public int insertPartner(Partner user) {
		// TODO Auto-generated method stub
		return partnerMapper.insertPartner(user);
	}

	@Override
	public int updatePartner(Partner user) {
		// TODO Auto-generated method stub
		return partnerMapper.updatePartner(user);
	}

	@Override
	public int deletePartnerById(String partnerId) {
		// TODO Auto-generated method stub
		return partnerMapper.deletePartnerById(partnerId);
	}

}
