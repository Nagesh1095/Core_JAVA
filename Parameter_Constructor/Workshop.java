class Workshop{
	String location;
	byte noOfmachines;
	String machinetype;
	byte membersinlab;
  
	Workshop (String l,byte n,String m,byte mm){
	location=l ; noOfmachines=n ;machinetype=m;membersinlab=mm;
	}
  
	String printAll(){
  
	String display = location +"\t" +noOfmachines +"\t" +machinetype+"\t" +membersinlab;
	System.out.println(display);
    return display;
    }

 }