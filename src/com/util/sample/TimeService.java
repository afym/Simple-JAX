package com.util.sample;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface TimeService
{
	@WebMethod String getTimeAsString();
	@WebMethod long getTimeAsElapsed();
}