package HW3;

public class Main {

	public static void main(String[] args) {
		
		//User created in constructor.
		Users mustafa = new Users(1,"12345678901","Mustafa","Akgun",2021);
		
		//Validation check from UserValidation class.
		mustafa.validator(mustafa);
		
		//Game-type is created in MarketplaceManager's constructor. Thus, add-delete operations will be easier in future because of independency.
		MarketplaceManager marketplaceManager = new MarketplaceManager(new RacingGame(),"Racing", 100);
		marketplaceManager.buyGame(mustafa, marketplaceManager);
		
		//Function that comes from MarketplaceDeals interface.
		marketplaceManager.xPercentDiscount(new RacingGame(), 25);
		
		
		/*
		 OUTPUT:
		 
		 User validation is successful!
		 Name Surname: Mustafa Akgun  User ID:1   purschased game name: Racing price: 100.0
		 Discount is successful! Racing's Old Price is:100.0
		 New Price is:75.0, (Discount rate is:25.0%)


		 */

	}

}
