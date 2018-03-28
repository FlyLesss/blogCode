package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.Partner;


@Mapper
public interface PartnerMapper {
	
	//注意下命名规范
	List<Partner> findPartner();
	Partner findPartnerById( String partnerId);
	int insertPartner(Partner user);
	int updatePartner(Partner user);
	int deletePartnerById(String partnerId);
}
