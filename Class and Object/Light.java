class Light{
 String name ="Tube_Light";
 short voltage =240;
 float current =2.5f;
 int price = 400;
 String material = "Argon,Xenon,Neon,Krypton";

 void illuminatelight(){
 System.out.println("Lights are start illuminate while providing power");
  }

 static int temperature(){
 System.out.println("Lights while illuminating increases their temperature");
  return 37;
   }
 
 void illuminatingmaterial(){
 System.out.println("Lights are illuminate due to neon gas get reacted b/w two metal electrodes");
    }

}
  