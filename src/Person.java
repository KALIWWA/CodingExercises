public class Person {
    private String firstName;
    private String lastName;
    private int age = 0;

    public String getFirstName() {
        return firstName;
    }

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public String getFullName() {
        String fullName = firstName + " " + lastName;
        if (firstName.isEmpty() && lastName.isEmpty()) {
            fullName = "";
        } else if (firstName.isEmpty()) {
            fullName = lastName;
        } else if (lastName.isEmpty()) {
            fullName = firstName;
        }
        return fullName;
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
        if (age >= 0 && age <= 100) {
            this.age = age;
        }
    }
}
