public class Phone extends ElectronicDevice{

    //FIELDS
    private String phoneNumber;

    //CONSTRUCTOR
    public Phone(String make, double price, String phoneNumber) {
        super(make, price);
        this.phoneNumber = phoneNumber;
    }

    //CALL
    public void call(String phoneNumber) {
        if (isOpen()) {
            System.out.println("Phone number +1(425)555-1212 is calling number " + getPhoneNumber() + "...");
        }else {
            System.out.println("You must first turn on the device to make a call.");
        }
    }

    //GETTER-SETTER
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
