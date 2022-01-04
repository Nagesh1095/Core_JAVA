class Skysrcaper{
	String name;
	String location;
	short yoc;
	float height;
	short floors;
  
	Skysrcaper (String n ,String l,short y,float h,short f){
	name=n ;location=l ; yoc=y ;height=h;floors=f;
	}
  
	String printAll(){
  
	String display = name +"\t" +location +"\t" +yoc +"\t" +height+"\t" +floors;
	System.out.println(display);
    return display;
    }

 }