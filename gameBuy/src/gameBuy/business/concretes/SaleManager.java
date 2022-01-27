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
			System.out.println(user.getUserName()+" isimli kullanýcý "+ game.getGameName()+" oyununu satýn aldý.");
			System.out.println("Kalan bakiye: "+user.getCash());
			this.saleDao.buy(user, game);
			return user;
		}
// geri gönderilen user nesnesi main classýnda userManager.update fonksiyonu kullanýlarak güncellenecek.
//Bu sayede oyunu satýn alan kullanýcýnýn oyunu koleksiyonda da tutulmuþ olacak.
		else {
			System.out.println("Kullanýcýnýn bakiyesi yetersiz.");
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
			System.out.println(user.getUserName()+" isimli kullanýcý "+ game.getGameName()+" oyununu satýn aldý.");
			System.out.println("Kalan bakiye: "+user.getCash());
			this.saleDao.buy(user, game, campaign);
			return user;
		}
		else {
			System.out.println("Kullanýcýnýn bakiyesi yetersiz.");
			return user;
		}
	}
	
}
