package de.speaky.xmpp.jingle;

public interface OnFileTransmissionStatusChanged {
	public void onFileTransmitted(JingleFile file);
	public void onFileTransferAborted();
}
