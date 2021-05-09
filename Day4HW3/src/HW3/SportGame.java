package HW3;

public class SportGame extends MarketplaceManager implements GameProperties {
	
	//Sport-type game.
	
	String gameNameSport;
	double gamePriceSport;
	
	@Override
	public String gameName(String gameName) {
		this.gameNameSport = gameName;
		return gameNameSport;
	}

	@Override
	public double gamePrice(double gamePrice) {
		this.gamePriceSport = gamePrice;
		return gamePriceSport;
	}
	
}
