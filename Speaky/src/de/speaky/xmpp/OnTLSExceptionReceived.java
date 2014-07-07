package de.speaky.xmpp;

import de.speaky.entities.Account;

public interface OnTLSExceptionReceived {
	public void onTLSExceptionReceived(String fingerprint, Account account);
}
