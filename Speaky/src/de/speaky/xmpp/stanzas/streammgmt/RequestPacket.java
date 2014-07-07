package de.speaky.xmpp.stanzas.streammgmt;

import de.speaky.xmpp.stanzas.AbstractStanza;

public class RequestPacket extends AbstractStanza {

	public RequestPacket(int smVersion) {
		super("r");
		this.setAttribute("xmlns","urn:xmpp:sm:"+smVersion);
	}

}
