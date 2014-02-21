package com.util.sample;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
public class ClientTime {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://127.0.0.1:9876/ts?wsdl");
		QName qname = new QName("http://sample.util.com/", "TimeServiceImplService");
		
		Service server = Service.create(url, qname);
		TimeService eif = server.getPort(TimeService.class);
		
		System.out.println(eif.getTimeAsString());
	}
}
