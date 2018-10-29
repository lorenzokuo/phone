
public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    public String ring() {
//        System.out.println("iphone X says Zing!");
        return "iphone "+getVersionNumber()+" says "+getRingTone();
    }
    public String unlock() {
//        System.out.println("Unlocking via facial recognition");
    	return "Unlocking via facial recognition";
    }
    public void displayInfo() {
        System.out.println("iphone "+getVersionNumber()+" from "+getCarrier());        
    }
}

