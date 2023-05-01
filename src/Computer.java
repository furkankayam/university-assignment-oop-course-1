public class Computer extends ElectronicDevice{

    //FIELDS
    private String operatingSystem;

    //CONSTRUCTOR
    public Computer(String make, double price, String operatingSystem) {
        super(make, price);
        this.operatingSystem = operatingSystem;
    }

    //UPDATE OPERATING SYSTEM
    public void updateOperatingSystem(String operatingSystem) {
        if (isOpen()) {
            System.out.println("The operating system is being updated...");
            System.out.println("The operating system has been update to " + operatingSystem);
        }else {
            System.out.println("You must first turn on the device to update the operating system.");
        }
    }

    //GETTER-SETTER
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
