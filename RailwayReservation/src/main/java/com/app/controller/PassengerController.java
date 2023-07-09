package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.PassengerDto;
import com.app.entitites.Passaenger;
import com.app.service.PassengerService;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@RestController
@RequestMapping("/passengers")
public class PassengerController {
	@Autowired
private PassengerService passSer;
	
	@GetMapping
  public List<Passaenger> getAllPassenger(){
	  return passSer.getAllPassenger();
  }
	@PostMapping
	public String addPassenger(@RequestBody  PassengerDto dt) {
		passSer.addPassenger(dt);
		return "Passenger Added";
		
	}
	
	@DeleteMapping("/{id}")
	public String deletePassenger(@PathVariable Long id) {
		passSer.deletePAssenger(id);
		return "Passenger Deleted";
		
	}
	@GetMapping("/{id}")
	public PassengerDto getPassenger(@PathVariable Long id) {
		PassengerDto p=new PassengerDto();
		passSer.getPassenger(id);
		return p;
	}
}
