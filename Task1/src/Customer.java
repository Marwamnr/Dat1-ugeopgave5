//1a
public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;

    public Customer(String firstName, String lastName, String username, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = id;
    }

    //1b
    //@Override
    public String toString() {
        return "Customer full name is " + firstName + " " + lastName + ", " +
                "Customer information: " + " " +
                "Username" + " " + username + " " +
                "id: " + id;
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

    public int getId() {
        return id;
    }
}
