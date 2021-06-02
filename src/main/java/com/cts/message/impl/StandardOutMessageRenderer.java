package com.cts.message.impl;

import com.cts.message.MessageProvider;
import com.cts.message.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer {
	private MessageProvider messageProvider;

	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException("Set the MessageProvider of class" + StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;

	}

	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
