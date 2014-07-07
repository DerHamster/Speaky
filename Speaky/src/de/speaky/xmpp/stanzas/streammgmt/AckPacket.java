package de.speaky.xmpp.stanzas.streammgmt;

import de.speaky.xmpp.stanzas.AbstractStanza;

public class AckPacket extends AbstractStanza {

	public AckPacket(int sequence, int smVersion) {
		super("a");
		this.setAttribute("xmlns","urn:xmpp:sm:"+smVersion);
		this.setAttribute("h", ""+sequence);
	}

}
