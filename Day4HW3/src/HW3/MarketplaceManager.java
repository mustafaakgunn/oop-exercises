package HW3;

public class MarketplaceManager implements MarketplaceDeals{
	
	//This class manages the interactions in shop system.
	
	
	String gameName;
	double gamePrice;
	
	public MarketplaceManager() {
		
	}
	
	public MarketplaceManager(MarketplaceManager gamename, String gameName, double gamePrice) {
		
		gamename.gameName(gameName);
		gamename.gamePrice(gamePrice);
		
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	
	}
	
	public void buyGame(Users user,MarketplaceManager gamename) {
		System.out.println("Name Surname: " + user.getName() + " " + user.getSurname() + "  User ID:" + user.getUserId() +"   purschased game name: " + gameName + " price: " + gamePrice);
		
	}

	
	@Override
	public void xPercentDiscount(MarketplaceManager gamename, double xDiscount) {
		
		System.out.println("Discount is successful! "+ gameName +"'s Old Price is:" + gamePrice);
		gamePrice = gamePrice - ((gamePrice/100)*xDiscount);
		System.out.println("New Price is:" + gamePrice + ", (Discount rate is:"+ xDiscount +"%)");
		
	}

	@Override
	public void freeGame(MarketplaceManager gamename) {
		System.out.println("FULL-Discount is successful! "+ gameName +"'s Old Price is:" + gamePrice);
		gamePrice = 0 * gamePrice;
		System.out.println("New Price is:" + gamePrice + ", (Discount rate is:100%)");
		
	}
	
	private void gamePrice(double gameprice) {
		// TODO Auto-generated method stub
		
	}

	private void gameName(String gameName) {
		// TODO Auto-generated method stub
		
	}


	
}
