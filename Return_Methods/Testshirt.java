class TestShirts{
public static void main(String []a){
Shirt.casual();

Shirt shir=new Shirt();
char result=Shirt.casual();
System.out.println(result);

Shirt sh=new Shirt();
boolean res=shir.semi();
System.out.println(res);
}
}