package com.nscorps.task.dtos;

public class TalukDTO {
	private String name;
	private StateDTO state;
	
	public String getName() {
		return name;
	}

  public void setName(String name) {
		this.name = name;
	}

  public StateDTO getState() {
		return state;
	}

  public void setState(StateDTO state) {
		this.state = state;
	}

    public String toString() {
		return "name=" + name + ", state=" + state;
	}
	
	
	

}
