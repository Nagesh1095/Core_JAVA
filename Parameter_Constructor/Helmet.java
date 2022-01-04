
public class Helmet{
	
	 String type;
	 String brand;
	 int price ;
	 String colour ;



	 Helmet()
	 		{
	 			System.out.println("Helmet is effective in reducing head injuries");
	 		}

	 Helmet(String type,String colour,String brand,int price)
		    {
	
			  this.type=type;
	          this.brand=brand;
	          this.price=price;
	          this.colour=colour;

	        
	          System.out.println("Type of the Helmet :"+type);
			  System.out.println("Brand name :"+brand);
			  System.out.println("price of the Helmet :"+price);
			  System.out.println("colour of the Helmet :"+colour);
	       }


	}