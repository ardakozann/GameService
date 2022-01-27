package gameBuy.business.abstracts;

import gameBuy.entities.concretes.Campaign;
import gameBuy.entities.concretes.Game;
import gameBuy.entities.concretes.User;

public interface SaleService {
	User buy(User user,Game game);
	User buy(User user,Game game,Campaign campaign);
}
