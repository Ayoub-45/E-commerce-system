class Administrator extends User {
    private String[] privileges;

    public Administrator(int userId, String name, String email, String[] privileges) {
        super(userId, name, email);
        this.privileges = privileges;
    }

    public String[] getPrivileges() {
        return privileges;
    }

    @Override
    public void login() {
        System.out.println("Welcome, Administrator " + name + "! You have the following privileges: ");
        for (String privilege : privileges) {
            System.out.println("- " + privilege);
        }
    }
}
