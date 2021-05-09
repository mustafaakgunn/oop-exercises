package HW3;

public class RacingGame extends MarketplaceManager implements GameProperties {

	//Racing-type game.

	String gameNameRacing;
	double gamePriceRacing;
	
	@Override
	public String gameName(String gameName) {
		this.gameNameRacing = gameName;
		return gameNameRacing;
	}

	@Override
	public double gamePrice(double gamePrice) {
		this.gamePriceRacing = gamePrice;
		return gamePriceRacing;
	}
	
	

}
