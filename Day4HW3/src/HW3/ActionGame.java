package HW3;

public class ActionGame extends MarketplaceManager implements GameProperties {
	
	//Action-type game.

	String gameNameAction;
	double gamePriceAction;
		
	@Override
	public String gameName(String gameName) {
		this.gameNameAction = gameName;
		return gameNameAction;
	}

	@Override
	public double gamePrice(double gamePrice) {
		this.gamePriceAction = gamePrice;
		return gamePriceAction;
	}

}
