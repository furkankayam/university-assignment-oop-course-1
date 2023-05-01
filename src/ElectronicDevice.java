public class ElectronicDevice {

    //FIELDS
    protected String make;
    protected double price;
    private boolean status = false;

    //CONSTRUCTOR
    public ElectronicDevice(String make, double price) {
        this.make = make;
        this.price = price;
    }

    //OPEN
    public void open() {
        if (!status) {
            status = true;
            System.out.println(getMake() + " device turned on.");
        }else {
            System.out.println(getMake() + " is already on.");
        }
    }

    public boolean isOpen() {
        return status;
    }

    //CLOSE
    public void close() {
        if (!status) {
            System.out.println(getMake() + " is already off.");
        }else {
            System.out.println(getMake() + " is turning off.");
            status = false;
        }
    }

    //GETTER-SETTER
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
