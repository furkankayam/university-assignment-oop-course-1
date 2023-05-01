public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Asus", 600, "Windows 10");
        Phone phone = new Phone("Apple", 1000, "+1(425)555-1212");
        computer.open();
        phone.open();
        System.out.println("\nDevices initially defined are accessed through defined objects:");
        System.out.println("Brand: " + computer.getMake()
                + ", Price: " + computer.getPrice()
                + ", OS: " + computer.getOperatingSystem());
        System.out.println("Brand: " + phone.getMake()
                + ", Price: " + phone.getPrice()
                + ", Phone Number: " + phone.getPhoneNumber());
        System.out.println();
        computer.updateOperatingSystem("Windows 11");
        phone.call("+1(206)555-2345");
        computer.close();
        phone.close();
    }
}