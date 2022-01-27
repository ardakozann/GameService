package gameBuy.dataAccess.concretes;

import gameBuy.dataAccess.abstracts.SaleDao;
import gameBuy.entities.concretes.Campaign;
import gameBuy.entities.concretes.Game;
import gameBuy.entities.concretes.User;

public class SaleOracleDao implements SaleDao{

	@Override
	public void buy(User user,Game game) {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName()+" isimli kullanýcýnýn aldýðý "+ game.getGameName()+" oyun Oracle veritabanýna kayýt edildi.");
	}

	@Override
	public void buy(User user, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName()+" isimli kullanýcýnýn "+campaign.getCampaignName()+" kampanyasýný kullanarak aldýðý "+ game.getGameName()+" oyun Oracle veritabanýna kayýt edildi.");
	}

}
