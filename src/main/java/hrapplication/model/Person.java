package hrapplication.model;


//import javax.persistence.*;

//@Entity
//@Table
public class Person {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Long id;
    private String lastName;
    private String firstName;
    private String color;

    public Person() {

    }

    public Person(String firstName, String lastName, String color) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.color = color;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //public Long getId() {

    //return id;
    //}

    //public void setId(Long id) {
        //this.id = id;
    //}

    @Override
    public String toString() {
        return "First Name: " + firstName + ", Last Name: " + lastName + ", Color: " + color;
    }

}
