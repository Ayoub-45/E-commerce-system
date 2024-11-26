class UserTest {
    public static void performLogin(User user) {
        user.login();
    }

    public static void main(String[] args) {
        // Create instances
        Customer customer = new Customer(1, "Alice", "alice@example.com", 150);
        Administrator admin = new Administrator(2, "Bob", "bob@example.com", new String[]{"Manage Users", "View Reports"});

        // Demonstrate polymorphism
        System.out.println("Polymorphism demonstration:");
        performLogin(customer); // Calls Customer's login
        performLogin(admin);    // Calls Administrator's login

        // Demonstrate upcasting
        System.out.println("\nUpcasting demonstration:");
        User upcastedCustomer = customer; // Upcast
        upcastedCustomer.login(); // Still calls Customer's login due to dynamic dispatch

        // Demonstrate downcasting
        System.out.println("\nDowncasting demonstration:");
        if (upcastedCustomer instanceof Customer) {
            Customer downcastedCustomer = (Customer) upcastedCustomer; // Downcast
            System.out.println("Loyalty points: " + downcastedCustomer.getLoyaltyPoints());
        }

        // Demonstrate equals method
        System.out.println("\nEquals method demonstration:");
        Customer anotherCustomer = new Customer(1, "Alice", "alice@example.com", 200);
        System.out.println("Are the customers equal? " + customer.equals(anotherCustomer)); // Should be true based on userId
    }
}
