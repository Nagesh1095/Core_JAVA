class TestPlant{

 public static void main(String []args){

 Plant mp=new Plant();
 mp.grow();


 System.out.println(mp.name);
 System.out.println(mp.height);
 String response=mp.absorbco2();
  System.out.println(response);
 
 
 
}
}