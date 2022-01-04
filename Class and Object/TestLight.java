class TestLight{
 public static void main(String []args){

 Light TL = new Light();
 System.out.println(TL.name);
 System.out.println(TL.voltage);
 System.out.println(TL.price);
 
 int res=TL.temperature();
 System.out.println(res);

 TL.illuminatingmaterial();
    }

}