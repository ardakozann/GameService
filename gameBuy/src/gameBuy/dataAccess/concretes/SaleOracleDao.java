package gameBuy.dataAccess.concretes;

import gameBuy.dataAccess.abstracts.SaleDao;
import gameBuy.entities.concretes.Campaign;
import gameBuy.entities.concretes.Game;
import gameBuy.entities.concretes.User;

public class SaleOracleDao implements SaleDao{

	@Override
	public void buy(User user,Game game) {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName()+" isimli kullan�c�n�n ald��� "+ game.getGameName()+" oyun Oracle veritaban�na kay�t edildi.");
	}

	@Override
	public void buy(User user, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName()+" isimli kullan�c�n�n "+campaign.getCampaignName()+" kampanyas�n� kullanarak ald��� "+ game.getGameName()+" oyun Oracle veritaban�na kay�t edildi.");
	}

}
