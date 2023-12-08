package com.tec1.app.request;

import java.util.List;

import com.tec1.app.model.Satellite;

public class SatellitesRequest {
	
	private List<Satellite> satellites;

	public List<Satellite> getSatellites() {
		return satellites;
	}

	public void setSatellites(List<Satellite> satellites) {
		this.satellites = satellites;
	}

	public SatellitesRequest(List<Satellite> satellites) {
		this.satellites = satellites;
	}
	
	
	public SatellitesRequest() {
		
	}
	
	

}
