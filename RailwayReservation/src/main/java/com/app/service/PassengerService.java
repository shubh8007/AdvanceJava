package com.app.service;

import java.util.List;

import com.app.dto.PassengerDto;
import com.app.entitites.Passaenger;

public interface PassengerService {
	List<Passaenger> getAllPassenger();
      String addPassenger(PassengerDto pt);
      String deletePAssenger(Long id);
      PassengerDto getPassenger(Long id);
}
