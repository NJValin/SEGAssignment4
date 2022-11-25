package Part2;

public class ConstantSpeedState implements BuggyStates {

    /**
     * 
     * @param action 
     * @see Part2.BuggyStates#doAction(java.lang.String)
     */
    @Override
    public void doAction(String action, BuggyContext buggy) {
        switch (action.toLowerCase()) {
            case "press left pedal once":
                buggy.setState(new AcceleratingFState());
            break;
            case "press right pedal twice":
                buggy.setState(new DeceleratingState());
                break;
            default: return;
        }
    }

}
