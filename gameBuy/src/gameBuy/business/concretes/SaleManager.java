package gameBuy.business.concretes;


import gameBuy.business.abstracts.SaleService;
import gameBuy.dataAccess.abstracts.SaleDao;
import gameBuy.entities.concretes.Campaign;
import gameBuy.entities.concretes.Game;
import gameBuy.entities.concretes.User;

public class SaleManager implements SaleService {
	SaleDao saleDao;
	public SaleManager(SaleDao saleDao) {
		super();
		this.saleDao = saleDao;
	}

	@Override
	public User buy(User user, Game game) {
		// TODO Auto-generated method stub
		if(user.getCash()>=game.getGamePrice()&&!user.getGames().contains(game)) {
			user.getGames().add(game);
			user.setCash(user.getCash()-game.getGamePrice());
			System.out.println(user.getUserName()+" isimli kullan�c� "+ game.getGameName()+" oyununu sat�n ald�.");
			System.out.println("Kalan bakiye: "+user.getCash());
			this.saleDao.buy(user, game);
			return user;
		}
// geri g�nderilen user nesnesi main class�nda userManager.update fonksiyonu kullan�larak g�ncellenecek.
//Bu sayede oyunu sat�n alan kullan�c�n�n oyunu koleksiyonda da tutulmu� olacak.
		else {
			System.out.println("Kullan�c�n�n bakiyesi yetersiz.");
			return user;
		}
	}

	@Override
	public User buy(User user, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		campaign.setCampaignDiscount(1-campaign.getCampaignDiscount());
		game.setGamePrice(game.getGamePrice()*campaign.getCampaignDiscount());
		if(user.getCash()>=game.getGamePrice()&&game.getGamePrice()>0) {
			user.getGames().add(game);
			user.setCash(user.getCash()-game.getGamePrice());
			System.out.println(user.getUserName()+" isimli kullan�c� "+ game.getGameName()+" oyununu sat�n ald�.");
			System.out.println("Kalan bakiye: "+user.getCash());
			this.saleDao.buy(user, game, campaign);
			return user;
		}
		else {
			System.out.println("Kullan�c�n�n bakiyesi yetersiz.");
			return user;
		}
	}
	
}
