public class Agent {

    private final String firstName;
    private final String lastName;

    public Agent(String initialFirstName, String initialLastName) {
        this.firstName = initialFirstName;
        this.lastName = initialLastName;
    }

    /**
     * Delete this method
     */
    public void print() {
        System.out.println("My name is " + lastName + ", " + firstName + " " + lastName);
    }

   // Write the method here
}
