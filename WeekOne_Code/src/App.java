
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//here is my first project. Here goes nothing: 
		
		double fernPrice = 16.25;
		double cactusPrice = 29.08;
	//	double fullPrice = fernPrice + cactusPrice;
		
		double francisWallet = 80.50;
		double finleysWallet = 77.43; 
		
		int yourFriends = 88;
		int myFriends = 62;
		
		int ageOne = 29; 
		int ageTwo = 33; 
		
				String franFirst = "Francis";
				String finnFirst = "Finley";
		
				char middleD = 'D';
				char middleL = 'L';
		
				String jacksonLast = "Jackson";
				String ennsLast = "Enns";
		
				String jackFullName = franFirst + " " + middleD + " " + jacksonLast;
				String ennsFullName = finnFirst + " " + middleL + " " + ennsLast; 
		
		Boolean theyHaveEnoughCash = true; 
		Boolean theyDontHaveEnough = false; 

		System.out.println("There are 43 Cacti and 27 Ferns ");
		System.out.println("Each fern costs $" + fernPrice);
		System.out.println("Each Cactus costs $" + cactusPrice);
		System.out.println(" ");
		System.out.println(franFirst + " " + middleD+" "+jacksonLast+" enters the store looking for Cacti.");
System.out.println( " ");
		System.out.println("So does " + jackFullName + "'s best friend; " + finnFirst+ " "+middleL+" "+jacksonLast+".");
System.out.println( " ");
		System.out.println(franFirst +" wants to buy 3 cacti and 4 ferns. Do they have enough?");
		System.out.println(franFirst +" has $"+francisWallet+" in their wallet.");
		
		int franWants = 3;
		
		double price = franWants*cactusPrice; 
		System.out.println(price);
		
		franWants += 1; 
		double price2 = franWants*fernPrice; 
		System.out.println(price2);
		
		double subtotal = price+price2; 
		System.out.println(subtotal);
		double friendsWallet = finleysWallet + francisWallet;
		
		boolean sheHaveEnough = (friendsWallet-finleysWallet) >= subtotal;
		System.out.println(sheHaveEnough);
System.out.println(" ");
		System.out.println("What if they combine their money?");
		System.out.println(ennsFullName+" has $"+ finleysWallet);

		 
		
		System.out.println("In total, the two frineds have $" + friendsWallet);
		System.out.println("Do they have enought?");
		boolean theyHaveEnough = friendsWallet >= subtotal;
		System.out.println(theyHaveEnough);
	
System.out.println(" ");
				
		System.out.println("If they make this purchase, how much money will they have remaining?");;
		double remaining = friendsWallet - subtotal; 
		System.out.println(remaining);
System.out.println(" ");

	System.out.println(finnFirst+" has "+ myFriends+ " friends");
	System.out.println(franFirst+" has "+ yourFriends+ "friends.");
System.out.println(" ");
	System.out.println(franFirst+ " is "+ageOne);
	System.out.println(finnFirst+ " is "+ageTwo);
	
	double finnAveFriends = myFriends/ageTwo;
	double franAveFriends = yourFriends/ageOne;
	System.out.println(finnFirst+ " average amount of friends per year is "+finnAveFriends);
	System.out.println(franFirst+ "' average amount of friends per year is "+franAveFriends);
		
		
		
	}

}
