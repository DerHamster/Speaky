package de.speaky.xmpp.jingle.stanzas;

import de.speaky.xml.Element;

public class Reason extends Element {
	private Reason(String name) {
		super(name);
	}
	
	public Reason() {
		super("reason");
	}
}
