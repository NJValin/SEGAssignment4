package Part2;

public class StoppedState implements BuggyStates{

    /**
     * 
     * @param action
     * @see Part2.BuggyStates#doAction(java.lang.String)
     */
    public void doAction(String action, BuggyContext buggy) {
        switch (action.toLowerCase()) {
            case "take key out":
                buggy.setState(new OffState()); 
                break;
            case "hold left pedal":
                buggy.setState(new AcceleratingBState());
                break;
            case "press left pedal once":
                buggy.setState(new AcceleratingFState());
                break;
            case "system failure":
                buggy.setState(new SystemDoneState());
                break;
            default: throw new IllegalArgumentException("Unknown action");
        }
    }

    

}
