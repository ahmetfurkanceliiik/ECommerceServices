package nLayerExample.core.concretes;

import nLayerExample.core.absracts.EmailService;
import nLayerExample.jEmail.jEmailManager;

public class JEmailManagerAdapter implements EmailService{
	jEmailManager emailManager=new jEmailManager();

	@Override
	public void verificationMail(String message) {
		emailManager.sendMail(message);
		
	}

	@Override
	public void verificationLink(String message) {
		emailManager.verificationAddress(message);

		
	}

	
	

}
