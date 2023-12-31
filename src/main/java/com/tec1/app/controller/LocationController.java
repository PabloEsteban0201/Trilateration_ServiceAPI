package com.tec1.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tec1.app.model.Position;
import com.tec1.app.model.Satellite;
import com.tec1.app.request.SatellitesRequest;
import com.tec1.app.response.LocationResponse;
import com.tec1.app.service.LocationService;

@RestController
@RequestMapping("/tracking")
public class LocationController {

	@Autowired
	private LocationService locationService;

	@PostMapping
	public ResponseEntity<?> getLocation(@RequestBody SatellitesRequest satellites) {

		double d1 = 0;
		double d2 = 0;
		double d3 = 0;
		

		for (int i = 0; i < satellites.getSatellites().size(); i++) {

			Satellite sat = satellites.getSatellites().get(i);

			switch (sat.getName()) {
			case "Sputnik":

				d1 = sat.getDistance();

				break;

			case "Explorer":

				d2 = sat.getDistance();

				break;

			case "Asterix":

				d3 = sat.getDistance();

				break;

			default:
				break;
			}
		}
		
		double[] distances = {d1,d2,d3};
		
		if(locationService.getLocation(distances)==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		double[] position = locationService.getLocation(distances);
		
		LocationResponse locationRes = new LocationResponse(new Position(position[0], position[1]), true);

		return ResponseEntity.status(HttpStatus.OK).body(locationRes);

	}

}
