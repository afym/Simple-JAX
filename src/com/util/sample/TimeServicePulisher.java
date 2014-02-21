package com.util.sample;

import javax.xml.ws.Endpoint;

public class TimeServicePulisher {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:9876/ts", new TimeServiceImpl());
	}
}
