package Part2;

public class DeceleratingState implements BuggyStates {

    /**
     * 
     * @param action 
     * @see Part2.BuggyStates#doAction(java.lang.String)
     */
    @Override
    public void doAction(String action, BuggyContext buggy) {
        switch(action.toLowerCase()) {
            case "press left pedal once":
                buggy.setState(new AcceleratingFState());
                break;
            case "come to stop":
                buggy.setState(new StoppedState());
                break;
            default: return;
        }
        
    }

}
