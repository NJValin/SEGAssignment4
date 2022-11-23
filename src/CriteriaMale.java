import java.util.List;
/**
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 */
public class CriteriaMale implements Criteria{
    /**
     * 
     * @param people
     * @return 
     */
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> result = new java.util.ArrayList<Person>();
        for (Person e:people) {
            if (e.getGender()==PersonStates.MALE) {
                result.add(e);
            }
        }
        return result;
    }
    
}
