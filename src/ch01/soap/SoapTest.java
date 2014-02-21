package ch01.soap;

import junit.framework.Assert;
import junit.framework.TestCase;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

public class SoapTest extends TestCase {
	private SOAPMessage message;
	
	public SoapTest() throws Exception{
		setSOAPMessage();
	}
	
	/*
	 *  SOAPMessage is an abstract class.
	 *  MessageFactory is a factory for creating SOAPMessage objects.
	 * 
	 */
	public void testSoapMessage() {
		Assert.assertTrue(message instanceof SOAPMessage);
	}
	/*
	 * SOAPEnvelope
	 * 
	 */
	public void testSoapEnvelope() throws SOAPException {
		SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
		Assert.assertTrue(envelope instanceof SOAPEnvelope);
	}

	private void setSOAPMessage() throws SOAPException {
			 message = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL)
								      .createMessage() ;
	}
}