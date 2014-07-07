package de.speaky.xmpp;

import de.speaky.entities.Account;
import de.speaky.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	public void onIqPacketReceived(Account account, IqPacket packet);
}
