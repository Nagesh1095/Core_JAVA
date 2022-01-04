class TestWorkshop{
 public static void main(String []args){
        
		byte n = 115;
		byte m = 24;
	Workshop Lab=new Workshop("ClgLAB",n,"Lathe",m);
	String res=Lab.printAll();
	System.out.println(res);
    }
}