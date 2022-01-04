class TestSpectacle{
 public static void main(String []args){
 
  Spectacle.see();

   float res=Spectacle.power();
   System.out.println(res);
 
  
   Spectacle specs = new Spectacle();
   int result= specs.price();
    System.out.println(result);
 
 
     }
 
 }