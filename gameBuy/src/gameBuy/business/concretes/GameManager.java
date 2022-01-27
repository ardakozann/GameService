package gameBuy.business.concretes;

import java.util.ArrayList;

import gameBuy.business.abstracts.GameService;
import gameBuy.dataAccess.abstracts.GameDao;
import gameBuy.entities.concretes.Game;

public class GameManager implements GameService {
	private ArrayList<Game> games = new ArrayList<Game>();
	private GameDao gameDao;

	public GameManager() {
		super();
	}

	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	public GameManager(ArrayList<Game> games, GameDao gameDao) {
		super();
		this.games = games;
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		this.games.add(game);
		System.out.println(game.getGameName()+" isimli oyun kayýt edildi.");
		this.gameDao.add(game);
	}

	public ArrayList<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
	
	
}
