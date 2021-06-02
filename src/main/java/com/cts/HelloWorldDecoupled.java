package com.cts;

import com.cts.message.MessageProvider;
import com.cts.message.MessageRenderer;
import com.cts.message.impl.HelloWorldMessageProvider;
import com.cts.message.impl.StandardOutMessageRenderer;

public class HelloWorldDecoupled {
	public static void main(String[] args) {
		MessageProvider provider = new HelloWorldMessageProvider();
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider);
		renderer.render();
	}
}
