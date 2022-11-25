package Part1;
/**
 * A class that represents a person.
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 * @version 1.0
 */
public class Person {
    private String name;
    private PersonStates gender;
    private byte age;
    private PersonStates maritalStatus;
    
    /**
     * The contructor that initializes a person object.
     * 
     * @param name - the name of the person
     * @param gender - the gender of the person, see {@link Part1.PersonStates}.
     * @param age - the age of the person
     * @param maritalStatus - the marital status of the person, see {@link Part1.PersonStates}.
     * @since 1.0
     */
    public Person(String name, PersonStates gender, byte age, PersonStates maritalStatus) {
        this.name = name; 
        this.gender = gender; 
        this.age = age>=0?age:0; 
        this.maritalStatus = maritalStatus; 
    }
    /**
     * A getter method that gets the name of the person.
     * 
     * @return the name of the person
     * @since 1.0
     */
    public String getName() {
        return name;
    }

    /**
     * A getter method that gets the gender of the person
     * @return the genderof the person, see {@link Part1.PersonStates}
     * @since 1.0
     */
    public PersonStates getGender() {
        return gender;
    }
    
    /**
     * A getter method that gets the age of the person
     * @return the of the person
     * @since 1.0
     */
    public byte getAge() {
        return age;
    }

    /**
     * A getter method that gets the marital status of the person
     * 
     * @return the marital status of the person, see {@link Part1.PersonStates}
     * @since 1.0
     */
    public PersonStates getMaritalStatus() {
        return maritalStatus;
    }
}
