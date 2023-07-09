package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.PassengerHandlingException;
import com.app.dto.PassengerDto;
import com.app.entitites.Passaenger;
import com.app.entitites.Railway;
import com.app.repository.PassengerRepository;
import com.app.repository.RailwayRepository;
@Service
@Transactional
public class PassengerServiceImpl  implements PassengerService{
	@Autowired
private PassengerRepository passRepo;
	@Autowired
	private RailwayRepository railRepo;
	
	@Autowired
	private ModelMapper maps;
	@Override
	public List<Passaenger> getAllPassenger() {
	
		return passRepo.findAll();
	}
	@Override
	public String addPassenger(PassengerDto pt) {
		//System.out.println(pt.getTrainid());
		Railway rail=railRepo.findById(pt.getTrainid()).orElseThrow();
		Passaenger p=maps.map(pt,Passaenger.class);
		rail.addPassenger(p);
		passRepo.save(p);
		return "Passenger Added";
	}
	@Override
	public String deletePAssenger(Long id) {
		Passaenger p=new Passaenger();
		if(passRepo.existsById(id)) {
			passRepo.deleteById(id);
		}
		return "passenger deleted";
	}
	@Override
	public PassengerDto getPassenger(Long id) {
		PassengerDto p=new PassengerDto();
		passRepo.findById(id).orElseThrow(()-> new PassengerHandlingException("passenger not found"));
		return p;
	}

}
