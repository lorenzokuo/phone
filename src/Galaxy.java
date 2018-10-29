
public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    public String ring() {
//    	System.out.println("Galaxy S9 says ring ring ring!");
    	return "Galaxy "+getVersionNumber()+" says "+getRingTone();    
    }
    public String unlock() {
//        System.out.println("Unlocking via finger print"); 
    	return "Unlocking via finger print";
    }
    public void displayInfo() {
        System.out.println("Galaxy "+getVersionNumber()+" from "+getCarrier());        
    }
}
