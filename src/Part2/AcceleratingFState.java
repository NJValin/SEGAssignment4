package Part2;

public class AcceleratingFState implements BuggyStates {

    /**
     * 
     * @param action 
     * @see Part2.BuggyStates#doAction(java.lang.String)
     */
    @Override
    public void doAction(String action, BuggyContext buggy) {
        switch(action.toLowerCase()) {
            case "hold right pedal":
                buggy.setState(new ConstantSpeedState());
                break;
            case "go max speed":
                buggy.setState(new ConstantSpeedState());
                break;
            case "press right pedal twice":
                buggy.setState(new DeceleratingState());
                break;
            default: return;
        }
        
    }

}
