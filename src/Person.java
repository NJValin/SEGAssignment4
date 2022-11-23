/**
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 */
public class Person {
    private String name;
    private PersonStates gender;
    private byte age;
    private PersonStates maritalStatus;
    
    public Person(String name, PersonStates gender, byte age, PersonStates maritalStatus) {
        this.name = name; 
        this.gender = gender; 
        this.age = age>=0?age:0; 
        this.maritalStatus = maritalStatus; 
    }

    public String getName() {
        return name;
    }

    public PersonStates getGender() {
        return gender;
    }
    
    public byte getAge() {
        return age;
    }

    public PersonStates getMaritalStatus() {
        return maritalStatus;
    }
}
