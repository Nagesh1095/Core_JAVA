class TestTrekking{
 public static void main(String []args){
        float h = 98.3f;
		int d = 201121;
		byte m = 24;
   Trekking Trek=new Trekking("Savandurga",d,h,m);
   String res=Trek.printAll();
  System.out.println(res);
    }
}