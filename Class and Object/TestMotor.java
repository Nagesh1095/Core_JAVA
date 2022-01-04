class TestMotor{
 public static void main(String []args){
  Motor moto=new Motor();
  System.out.println(moto.name);
  System.out.println(moto.price);
  System.out.println(moto.voltage);
  System.out.println(moto.current);

  moto.rotates();
 int cap=moto.capacity();
 System.out.println(cap);
  }

}