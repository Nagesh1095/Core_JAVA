
public class Headphone{
	
	 String type;
	 String brand;
	 int price ;
	 String colour ;



	 Headphone()
	 		{
	 			System.out.println("Used for listening to sound from a computer, music player, or other such electronic device.");
	 		}

	 Headphone(String type,String colour,String brand,int price)
		    {
	
			  this.type=type;
	          this.brand=brand;
	          this.price=price;
	          this.colour=colour;

	        
	          System.out.println("Type of the Headphone :"+type);
			  System.out.println("Brand name :"+brand);
			  System.out.println("price of the Headphone :"+price);
			  System.out.println("colour of the Headphone :"+colour);
	       }


	}