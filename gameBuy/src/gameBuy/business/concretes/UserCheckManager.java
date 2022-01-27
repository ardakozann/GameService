package gameBuy.business.concretes;


import java.rmi.RemoteException;

import gameBuy.business.abstracts.UserCheckService;
import gameBuy.entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class UserCheckManager implements UserCheckService {
	@Override
	public boolean checkIfRealPerson(User user) {
		// TODO Auto-generated method stub
		KPSPublicSoap client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.valueOf(user.getIdentityNumber()).longValue(),user.getFirstName().toUpperCase(),user.getLastName().toUpperCase(),user.getDateOfBirth());
	
		}
		catch(NumberFormatException | RemoteException e){
			return false;
		}
	}
}
