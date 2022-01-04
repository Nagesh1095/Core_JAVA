
public class MusicInstrument{
	 String name;
	 String type;
	 String brand;
	 int price ;
	 String colour ;



	 MusicInstrument()
	 		{
	 			System.out.println("A musical instrument is a device created or adapted to make musical sounds");
	 		}

	 MusicInstrument(String name,String type,String colour,String brand,int price)
		    {
		      this.name=name;
			  this.type=type;
	          this.brand=brand;
	          this.price=price;
	          this.colour=colour;

	          System.out.println("Name of the MusicInstrument :"+name);
	          System.out.println("Type of the MusicInstrument :"+type);
			  System.out.println("Brand name :"+brand);
			  System.out.println("price of the MusicInstrument :"+price);
			  System.out.println("colour of the MusicInstrument :"+colour);
	       }


	}