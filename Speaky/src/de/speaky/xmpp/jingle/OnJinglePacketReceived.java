package de.speaky.xmpp.jingle;

import de.speaky.entities.Account;
import de.speaky.xmpp.PacketReceived;
import de.speaky.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	public void onJinglePacketReceived(Account account, JinglePacket packet);
}
