class Customer extends User {
    private int loyaltyPoints;

    public Customer(int userId, String name, String email, int loyaltyPoints) {
        super(userId, name, email);
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    @Override
    public void login() {
        System.out.println("Welcome, Customer " + name + "! You have " + loyaltyPoints + " loyalty points.");
    }
}
