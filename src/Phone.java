
public abstract class Phone {
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	public String getVersionNumber() {
		return this.versionNumber;
	}
	public String getCarrier() {
		return this.carrier;
	}
	public String getRingTone() {
		return this.ringTone;
	}
	public abstract void displayInfo();
}
