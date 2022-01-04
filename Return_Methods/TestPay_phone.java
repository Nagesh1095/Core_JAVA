class TestPay_phone {
 public static void main(String []args){
 
 Pay_phone.ring();
 
 boolean res=Pay_phone.tone();
  System.out.println(res);
 
 
 Pay_phone call=new Pay_phone();
 int result = call.battery();
 System.out.println(result);
 
   }

 }
 