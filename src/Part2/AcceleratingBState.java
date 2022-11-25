package Part2;

public class AcceleratingBState implements BuggyStates {
    /**
     * 
     * @param action
     * @see Part2.BuggyStates#doAction(java.lang.String)
     */
    public void doAction(String action, BuggyContext buggy) {
        switch (action.toLowerCase()) {
            case "press left pedal once":
                buggy.setState(new AcceleratingFState());
                break;
            case "press right pedal twice":
                buggy.setState(new DeceleratingState());
                break;
            case "go max speed":
                buggy.setState(new ConstantSpeedState());
                break;
            default: return;
        }
    }

}
