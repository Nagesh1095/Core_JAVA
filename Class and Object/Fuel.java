class Fuel
{
String state="liquid";
byte thickness=4;
double density=0.934;
short meltingPoint=135;
int price=111;

static void types(){
System.out.println("petrol,diesel,kerosene");
}

 void uses(){
System.out.println("fuels are used to run vehicles,and conduct heat");
}

 void source(){
System.out.println("The main sources of fuel are coal and naturalgas");
}
 void composition(){
 System.out.println("fuel contains 13% of benzens,47% of alkanes,33%of cyclo-alkanes");
 }
 
 }
