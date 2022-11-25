package Part2;
/**
 * 
 * 
 * @author <a href="https://github.com/NJValin">NeilValin</a>-300236063
 * @version 1.0
 */
public class BuggyContext  {
    private BuggyStates state;

    public BuggyContext() {
        state=new OffState();
    }

    public void setState(BuggyStates state) {
        this.state = state;
    }
    /**
     * 
     * @return
     */
    public BuggyStates getState() {
        return state;
    }
    
    public void doAction(String action) {
        this.state.doAction(action, this);
    }
    

}
