package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.RailwayDto;
import com.app.entitites.Railway;
import com.app.service.RailawayService;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@RestController
@RequestMapping("/railways")
public class RailwayController {
	@Autowired
private RailawayService railSer;
	
	@GetMapping
	public List<Railway> getAllRailways(){
		return railSer.getAllRailways();
	}
	@PostMapping
	public String addRailway(@RequestBody RailwayDto rdt) {
		railSer.addrailway(rdt);
		return "INDIAN RAILWAY"
;		
	}
}
