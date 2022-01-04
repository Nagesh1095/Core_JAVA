class Butterfly{
	static void fly(){
		System.out.println("Butterfly can fly");
	}

	static void fly( float height ){
		System.out.println("Butterfly can fly" + height);
	}

	static void fly( byte age , float height ){
		System.out.println("Butterfly can fly"+"\t"+ age +"\t"+ height);
	}

	static void fly(float height , byte age  ){
		System.out.println("Butterfly can fly"+"\t"+ height"\t"+ age);
	}
	

	
}