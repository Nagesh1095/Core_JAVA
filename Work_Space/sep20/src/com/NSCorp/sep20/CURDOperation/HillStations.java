package com.NSCorp.sep20.CURDOperation;

public class HillStations {
	
	String []args=new String[10];
	int index=0;
	
	public void add(String name) {
		if(index<args.length) {
		args[index]=name;
		index++;
		}
	}
  
	public void printAll() {
		for(int index=0;index<args.length;index++) {
			System.out.println(args[index]);
		}
	}

   public String update(String oldname,String newname) {
	   
	   for(int index=0;index<args.length;index++) {
	
		   if(args[index]==oldname) {
			   args[index]=newname;
			  return "value updated";
		   }
	   
	   }
         return "value not updated";
	   
	   		
   }
  public String delete() {
	  for(int index=0;index<args.length;index++) {
		  if(args[index].equals("Shanu")){
			  args[index]=null;
		  return "value deleted";
		  }
	  }
  
return "value not deleted"; 
}
}
