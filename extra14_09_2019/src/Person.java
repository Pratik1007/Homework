public class Person {
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("Person");
        System.out.println("Full Name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen(10));
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("Full Name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen(18));
        person.setLastName("Smith");
        System.out.print("Full Name :  " + person.getFullName());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen(int age) {
        if (age > 12 && age < 20) {
            return true;
        } else return false;
    }
    public String getFullName() {
        if (firstName.isEmpty()) {
            return firstName + lastName;
        }
        else if (lastName.isEmpty()) {
                return firstName + lastName;
            }
        else if ((firstName+lastName).isEmpty()) {
            return " ";
        } else return firstName + lastName;
    }
}