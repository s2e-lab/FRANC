import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DefaultBroadcaster{
	/** 
	 * Invoke the  {@link BroadcastFilter}
	 * @param msg
	 * @return
	 */
	
	protected Object filter(Object msg){
			// define your logic for filtering the message in this method
// return the filtered message
		return msg;
	}
}

class EmailBroadcaster extends DefaultBroadcaster{
	/**
	 * Sends an email message to the recipients
	 * 
	 * @param msg
	 * @param recipients
	 * @param sender
	 */
	public void sendEmail(Object msg, List<String> recipients, String sender){
		//filter the message
		Object filteredMsg = filter(msg);
		
		//prepare the email content
		StringBuilder emailContent = new StringBuilder();
		emailContent.append("From: ").append(sender).append("\n");
		emailContent.append("To: ");
		for(String recipient: recipients){
			emailContent.append(recipient).append(",");
		}
		emailContent = emailContent.deleteCharAt(emailContent.length() - 1);
		emailContent.append("\n");
		emailContent.append("Message: ").append(filteredMsg);

		//call the email service to send email
		EmailService.sendEmail(emailContent.toString());
	}
}

class SMSBroadcaster extends DefaultBroadcaster{
	/**
	 * Sends an SMS message to the recipients
	 * 
	 * @param msg
	 * @param recipients
	 */
	public void sendSMS(Object msg, List<String> recipients){
		//filter the message
		Object filteredMsg = filter(msg);
		
		//prepare the SMS content
		StringBuilder smsContent = new StringBuilder();
		smsContent.append("Message: ").append(filteredMsg);

		//call the SMS service to send SMS
		SMSService.sendSMS(smsContent.toString(), recipients);
	}
}
