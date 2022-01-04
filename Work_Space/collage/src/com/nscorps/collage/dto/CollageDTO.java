package com.nscorps.collage.dto;

public class CollageDTO {
	private String cName;
	private byte noOfCourses;
	private short noOfStudents;
	private short noOfFaculties;
	private boolean isGovernmentCollege;
	private boolean isAutonomousCollege;
	private AddressDTO Address;
	
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public byte getNoOfCourses() {
		return noOfCourses;
	}
	public void setNoOfCourses(byte noOfCourses) {
		this.noOfCourses = noOfCourses;
	}
	public short getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(short noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public short getNoOfFaculties() {
		return noOfFaculties;
	}
	public void setNoOfFaculties(short noOfFaculties) {
		this.noOfFaculties = noOfFaculties;
	}
	public boolean isGovernmentCollege() {
		return isGovernmentCollege;
	}
	public void setGovernmentCollege(boolean isGovernmentCollege) {
		this.isGovernmentCollege = isGovernmentCollege;
	}
	public boolean isAutonomousCollege() {
		return isAutonomousCollege;
	}
	public void setAutonomousCollege(boolean isAutonomousCollege) {
		this.isAutonomousCollege = isAutonomousCollege;
	}
	public AddressDTO getAddress() {
		return Address;
	}
	public void setAddress(AddressDTO address) {
		Address = address;
	}
	public String toString() {
		return "cName=" + cName + ", noOfCourses=" + noOfCourses + ", noOfStudents=" + noOfStudents
				+ ", noOfFaculties=" + noOfFaculties + ", isGovernmentCollege=" + isGovernmentCollege
				+ ", isAutonomousCollege=" + isAutonomousCollege + ", Address=" + Address ;
	}
	
	


}
