package com.util.sample;

import java.util.Date;
import javax.jws.WebService;

@WebService(endpointInterface = "com.util.sample.TimeService")
public class TimeServiceImpl implements TimeService{
	public String getTimeAsString() {
		return new Date().toString();
	}

	public long getTimeAsElapsed() {
		return new Date().getTime();
	}
}
