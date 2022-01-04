class Trekking{
	String location;
	int date;
	float height;
	byte members;
  
	Trekking (String l,int d,float h,byte m){
	location=l ; date=d ;height=h;members=m;
	}
  
	String printAll(){
  
	String display = location +"\t" +date +"\t" +height+"\t" +members;
	System.out.println(display);
    return display;
    }

 }