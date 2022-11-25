package Part1;
import java.util.List;
/**
 * The main class that allows for a user to filter a list of people.
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 * @version 1.0
 */
public class FilterPattern {
    private List<Person> people;
    /**
     * A contructor for the FilterPattern class.
     * 
     * @param people A list of people.
     * @since 1.0
     */
    public FilterPattern(List<Person> people) {
        this.people = people;
    }

    /**
     * A method that given a <code>criteria</code>, filters the list of people.
     * 
     * @param criteria a criteria that will be used to filter the list of people.
     * @return The list of people that meet the criteria.
     */
    public List<Person> filter(Criteria criteria) {
        return criteria.meetCriteria(people);
    }
    
}
