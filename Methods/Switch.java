class Switch{
 static int onoff(String []args){
  for(byte no=0; no<args.length ;no++){
  System.out.println(args[no]);
       }
    return 2; 
 }
  
  static void onoff(String []types ,String []args){
  System.out.println("two types of switches");
   for(byte no=0; no<args.length ;no++){
  System.out.println(args[no] +"\t" +types);
   }
 }

  static int onoff(int voltage ,String []types ,String []args){
   System.out.println("Switch can withstand some voltages");
   for(byte no=0; no<args.length ;no++){
  System.out.println(args[no] +"\t" +types);
     }
  return 23;
  }

}