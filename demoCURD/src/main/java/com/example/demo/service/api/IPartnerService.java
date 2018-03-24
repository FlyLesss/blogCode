package com.example.demo.service.api;

import java.util.List;

import com.example.demo.bean.Partner;

public interface IPartnerService {
	
	List<Partner> findPartner();
	Partner findPartnerById( String partnerId);
	int insertPartner(Partner user);
	int updatePartner(Partner user);
	int deletePartnerById(String partnerId);
}
