public class User {

    private String id;
    private String firstName;
    private String lastName;
    private int age;

    public User() {

    }

    public User(int id, String firstName, String lastName, int age) {
        //this.id = firstName.substring(0,1)+lastName.substring(0,1)+age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getId() {
        this.id = firstName.substring(0, 1) + lastName.substring(0, 1) + age;
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
