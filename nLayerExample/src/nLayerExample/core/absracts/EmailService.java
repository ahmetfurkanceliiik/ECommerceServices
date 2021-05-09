package nLayerExample.core.absracts;

public interface EmailService {
	void verificationMail(String message);
	void verificationLink(String message);
}
