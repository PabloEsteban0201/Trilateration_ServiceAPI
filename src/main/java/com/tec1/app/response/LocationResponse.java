package com.tec1.app.response;

import com.tec1.app.model.Position;

public class LocationResponse {
	
	private Position position;
	
	private boolean isInDanger;

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public boolean isInDanger() {
		return isInDanger;
	}

	public void setInDanger(boolean isInDanger) {
		this.isInDanger = isInDanger;
	}

	public LocationResponse(Position position, boolean isInDanger) {
		super();
		this.position = position;
		this.isInDanger = isInDanger;
	}
	
	
	

}
