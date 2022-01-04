class Crackers{
  String name;
  String colour;
  short price;
  String material;
 
  Crackers(String n){
  name=n;
  }
 
 Crackers(String n,String c,short p,String m){
  name=n; colour=c; price=p; material=m;
  }
 
 String printall(){
  String res=name +"\t" +colour +"\t" +price +"\t" +material;
  return res;
 
   }

}