class TestFurnitures{

 public static void main(String []args){
 
 Furnitures fur= new Furnitures();
 System.out.println(fur.height);
 System.out.println(fur.typeOfWood);
 System.out.println(fur.length);
 System.out.println(fur.width);
 System.out.println(fur.quality);
  
  
 Furnitures.sofa();
 Furnitures.decor();
 fur.dining();
 fur.table();
 String res= fur.bed();
 System.out.println(res);
 
 
   }

}
