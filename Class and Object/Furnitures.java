class Furnitures
{
byte height=25;
int length=30;
short width=10;
String quality="fine";
String typeOfWood="oak";

 static void decor(){
 System.out.println("furnitures are used for decorating interiors");
 }
 
 static void sofa(){
	System.out.println("sofas are used for laying and sitting"); 
	 
 }

 void dining(){
	 System.out.println("dining tables are used for eating");
 }
 
 void table(){
	 System.out.println(" tables are used for keeping things");
 }

 String bed(){
	 System.out.println("beds are used for sleeping and relaxing");
	 return "1";
 }
}


