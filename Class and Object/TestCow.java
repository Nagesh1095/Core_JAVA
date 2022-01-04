class TestCow{
	public static void main(String []args){
 
	Cow C= new Cow();
	System.out.println(C.name);
	System.out.println(C.gender);
	System.out.println(C.colour);
	System.out.println(C.weight);
	System.out.println(C.height);
 
	Cow.eatGreen();
	Cow.givesMilk();
	String res= C.walks();
	System.out.println(res);
	C.reproduce();
	C.smell();
  
   }

}

