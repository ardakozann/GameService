package gameBuy.business.abstracts;

import gameBuy.entities.concretes.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void update(int campaignId,String toUpdateCampaignName,double toUpdateCampaignDiscount);
	void delete(int toDeleteCampaignId);
	void getAll();
}
