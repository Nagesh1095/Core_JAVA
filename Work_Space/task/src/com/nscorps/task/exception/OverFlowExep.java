package com.nscorps.task.exception;

class OverFlowExep{
	
	 public OverFlowExep(){
		 this();
	 }
	
}
class OverFlow extends OverFlowExep {
	 
	public  OverFlow() {
		super();
		System.out.println("birds main property is flying");
	}
	
	public static void main(String[] args) {
		OverFlow overflow =new OverFlow();
		
	}
	

}
