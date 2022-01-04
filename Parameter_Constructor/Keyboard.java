
public class Keyboard{
	 String type;
	 String brand;
	 short price ;
	 String colour ;
	 
	 

	 		Keyboard()
	 		{
	 			System.out.println("Keyboard is an input device");
	 		}

	        Keyboard(String type,String colour,String brand,short price)
		    {
			  this.type=type;
	          this.brand=brand;
	          this.price=price;
	          this.colour=colour;
			  
	          System.out.println("Type of the Keyboard :"+type);
			  System.out.println("Brand name :"+brand);
			  System.out.println("price of the Keyboard :"+price);
			  System.out.println("colour of the Keyboard :"+colour);
	       }


	}