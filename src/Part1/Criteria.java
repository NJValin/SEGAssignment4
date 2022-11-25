package Part1;
/**
 * An interface that generalizes a filter. Given a list, {@link Part1.Criteria#meetCriteria(java.util.List)} filters for based on a
 * criteria, and returns a list of elements that meet the criteria.
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 * @version 1.0
 */
public interface Criteria  {
    /**
     * A method that filters a list based on some criteria.
     * 
     * @param people a list of the people.
     * @return a list of <b>people</b> that meet the criteria.
     */
    public java.util.List<Person> meetCriteria(java.util.List<Person> people);
}