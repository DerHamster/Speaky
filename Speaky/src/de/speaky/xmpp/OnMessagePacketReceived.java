package de.speaky.xmpp;

import de.speaky.entities.Account;
import de.speaky.xmpp.stanzas.MessagePacket;

public interface OnMessagePacketReceived extends PacketReceived {
	public void onMessagePacketReceived(Account account, MessagePacket packet);
}
