class TestFuel
{

 public static void main(String []args){
 
 Fuel F= new Fuel ();
 System.out.println(F.state);
 System.out.println(F.thickness);
 System.out.println(F.density);
 System.out.println(F.meltingPoint);
 System.out.println(F.price);
 
  
 Fuel.types();
 F.uses();
 F.source();
 F.composition();
 
   }

}



