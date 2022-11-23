import java.util.List;
/**
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 */
public class FilterPattern {
    private List<Person> people;
    /**
     * 
     * @param people
     */
    public FilterPattern(List<Person> people) {
        this.people = people;
    }

    /**
     * 
     * @param criteria
     * @return
     */
    public List<Person> filter(Criteria criteria) {
        return criteria.meetCriteria(people);
    }
    
}
