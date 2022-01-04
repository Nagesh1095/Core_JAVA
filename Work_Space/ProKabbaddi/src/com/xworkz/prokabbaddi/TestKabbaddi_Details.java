package com.xworkz.prokabbaddi;

import com.xworkz.prokabbaddi.Team_Details.Team_Details;

public class TestKabbaddi_Details {
	public static void main(String []args) {
		
		String teams[]= {"bengaluruBulls","patnapirates","Umumba","bengalwarriors","telugutitans","dabangdelhi","jaipurpanthers"};
		com.xworkz.prokabbaddi.Team_Details.Team_Details team1 =new com.xworkz.prokabbaddi.Team_Details.Team_Details(teams);
		com.xworkz.prokabbaddi.Team_Details.Team_Details team2 =new com.xworkz.prokabbaddi.Team_Details.Team_Details("Bengalurubulls");
		com.xworkz.prokabbaddi.Team_Details.Team_Details team3 =new com.xworkz.prokabbaddi.Team_Details.Team_Details((byte)7,"Benglaore");
		com.xworkz.prokabbaddi.Team_Details.Team_Details team4 =new com.xworkz.prokabbaddi.Team_Details.Team_Details("bengalore","rohitkumar","randhirsingh");
		com.xworkz.prokabbaddi.Team_Details.Team_Details team5 =new com.xworkz.prokabbaddi.Team_Details.Team_Details("red","pawansharavath");
		
	    Team_Details team6 =new Team_Details("Bengalurubulls",(byte)7,"Benglaore","rohitkumar","randhirsingh","red","pawansharavath",teams);
		Team_Details team7 =new Team_Details("patnapirates",(byte)7,"patna","pradeepnarwal","ram","green","narwal",teams);
		Team_Details team8 =new Team_Details("umumba",(byte)7,"mumbai","Fazal","mazandarai","orange","subramanian",teams);
		Team_Details team9 =new Team_Details("bengalwarriors",(byte)7,"bengal","manindersingth","kishore","orangeblack","akshaykumar",teams);
		Team_Details team10 =new Team_Details("telugutitans",(byte)7,"hyderabad","rahulchowdri","jagadishkumble","yellow","rahulchowdry",teams);
		Team_Details team11 =new Team_Details("jaipurpanthers",(byte)7,"jaipur","deepakhooda","srinivasreddy","pink","deepakhooda",teams);
		
		System.out.println(team1.show());
		System.out.println(team2.show());
		System.out.println(team3.show());
		System.out.println(team4.show());
		System.out.println(team5.show());
		System.out.println(team6.show());
		System.out.println(team7.show());
		System.out.println(team8.show());
		System.out.println(team9.show());
		System.out.println(team10.show());
		System.out.println(team11.show());
		
	}

}
