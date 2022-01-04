
public class Remote{
	
	 String type;
	 String brand;
	 int price ;
	 String colour ;



	 Remote()
	 		{
	 			System.out.println("It is an electronic device used to operate another device from a distance, usually wirelessly");
	 		}

	 Remote(String type,String colour,String brand,int price)
		    {
	
			  this.type=type;
	          this.brand=brand;
	          this.price=price;
	          this.colour=colour;

	        
	          System.out.println("Type of the Remote :"+type);
			  System.out.println("Brand name :"+brand);
			  System.out.println("price of the Remote :"+price);
			  System.out.println("colour of the Remote :"+colour);
	       }


	}