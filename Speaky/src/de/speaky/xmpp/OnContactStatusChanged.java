package de.speaky.xmpp;

import de.speaky.entities.Contact;

public interface OnContactStatusChanged {
	public void onContactStatusChanged(Contact contact, boolean online);
}
