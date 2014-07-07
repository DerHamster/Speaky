package de.speaky.xmpp;

import de.speaky.entities.Account;
import de.speaky.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	public void onPresencePacketReceived(Account account, PresencePacket packet);
}
