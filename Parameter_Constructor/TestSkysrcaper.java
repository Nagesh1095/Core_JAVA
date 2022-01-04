class TestSkysrcaper{
 public static void main(String []args){
         short yoc =2010;
         float h = 829.8f;
		 short f = 164;
   Skysrcaper sky=new Skysrcaper("Burj Kalifa","Dubai",yoc ,h,f);
   String res=sky.printAll();
  System.out.println(res);
    }
}