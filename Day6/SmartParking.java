class SmartParking {
    String vehicleNumber;
    int hoursParked;
    String vehicleType;
    double parkingFee;
    SmartParking(String vehicleNumber, int hoursParked, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.hoursParked = hoursParked;
        this.vehicleType = vehicleType;

        if (vehicleType.equals("Bike")) {
            parkingFee = hoursParked * 10;
        } else if (vehicleType.equals("Car")) {
            parkingFee = hoursParked * 30;
        } else if (vehicleType.equals("Bus")) {
            parkingFee = hoursParked * 50;
        } else {
            parkingFee = 0;
            System.out.println("Unknown vehicle type.");
        }
    }
    void display() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Hours Parked   : " + hoursParked);
        System.out.println("Parking Fee    : " + parkingFee+"/-");
        System.out.println("---------------------");
    }
    public static void main(String[] args) {
        SmartParking s1 = new SmartParking("OD01AB1234", 3, "Bike");
        s1.display();

        SmartParking s2 = new SmartParking("OD05XY9999", 2, "Car");
        s2.display();

        SmartParking s3 = new SmartParking("OD09ZZ0001", 5, "Bus");
        s3.display();
    }
}