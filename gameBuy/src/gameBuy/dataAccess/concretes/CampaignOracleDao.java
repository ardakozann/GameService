package gameBuy.dataAccess.concretes;

import gameBuy.dataAccess.abstracts.CampaignDao;
import gameBuy.entities.concretes.Campaign;

public class CampaignOracleDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " isimli kampanya Oracle veritabanına eklendi.");
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " isimli kampanya Oracle veritabanında güncellendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " isimli kampanya Oracle veritabanından silindi.");
	}

}
