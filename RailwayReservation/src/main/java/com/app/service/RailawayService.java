package com.app.service;

import java.util.List;

import com.app.dto.RailwayDto;
import com.app.entitites.Passaenger;
import com.app.entitites.Railway;

public interface RailawayService {
List<Railway> getAllRailways();
String addrailway(RailwayDto dt);
}
