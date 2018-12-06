package com.aju.soapserviceemail.client;

import com.aju.soapserviceemail.bean.EmailData;
import com.aju.soapserviceemail.bean.EmailStatus;
import com.aju.soapserviceemail.service.EmailServiceImpl;
import com.aju.soapserviceemail.service.EmailServiceImplServiceLocator;

public class SoapClient {
	public static void main(String[] args) {
		EmailServiceImplServiceLocator locator = new EmailServiceImplServiceLocator();
		try {
			EmailServiceImpl emailServiceImpl = locator.getEmailServiceImpl();
			String body = "/* body of mail */";
			String from = "/* from mail id */";
			String subject = "/*subject of mail */";
			String to = "/* to mail id */";
			EmailData email = new EmailData(body,from,subject,to);
			EmailStatus status = emailServiceImpl.getEmailOperation(email);
			System.out.println(status.getStatus());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
