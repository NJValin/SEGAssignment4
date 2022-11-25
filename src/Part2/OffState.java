package Part2;

public class OffState implements BuggyStates {

    
    /**
     * @see Part2.BuggyStates#doAction(java.lang.String)
     */
    public void doAction(String action, BuggyContext buggy) {
        if (action.equalsIgnoreCase("turn key")) {
            buggy.setState(new StoppedState());
        }
        else if (action.equalsIgnoreCase("no keys")) {
            buggy.setState(new SystemDoneState());
        }
        
    }
    
}
