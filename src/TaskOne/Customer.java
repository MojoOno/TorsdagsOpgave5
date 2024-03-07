package TaskOne;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = this.counter;
        this.counter = this.counter + 1;
    }

    @Override
    public String toString() {
        return "Customer ID: " + (id + 1) + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Username: " + username + "\n" +
                "\n ";
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }
}
