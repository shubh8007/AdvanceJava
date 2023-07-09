package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.PassengerHandlingException;
import com.app.dto.RailwayDto;
import com.app.entitites.Railway;
import com.app.repository.RailwayRepository;
@Service
@Transactional
public class RailwayServiceImpl implements RailawayService
{
	@Autowired
private RailwayRepository railrepo;
	@Autowired
	private ModelMapper maps;
	@Override
	public List<Railway> getAllRailways() {
		// TODO Auto-generated method stub
		return railrepo.findAll();
	}
	@Override
	public String addrailway(RailwayDto dt) {
		Railway r1=maps.map(dt, Railway.class);
		Railway r=railrepo.save(r1);
		if(r==null) {
			throw new PassengerHandlingException("railway not added");
		}
		return "Railway Added";
	}

}
