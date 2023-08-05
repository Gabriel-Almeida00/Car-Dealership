package car_dealership;

public class Dealership {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Tom");
        customer.setAddress("123 anything St. ");
        customer.setCashOnHand(25000);

        Vehicle vehicle = new Vehicle("Honda", "Accord", 15000);

        Employee employee = new Employee();
        customer.purchaseCar(vehicle,employee,false);
    }
}
