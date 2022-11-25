package Part2;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;

import static org.junit.Assert.*;

public class Assignmetn4_2_test {
    @Rule
    public Timeout maxTime =Timeout.seconds(1);

    @Test
    public void testRun1() {
        BuggyContext x  =new BuggyContext();
        assertEquals(OffState.class, x.getState().getClass());

        x.doAction("turn key");
        assertEquals(StoppedState.class, x.getState().getClass());

        x.doAction("press left pedal once");
        assertEquals(AcceleratingFState.class, x.getState().getClass());

        x.doAction("wrong input");
        assertEquals(AcceleratingFState.class, x.getState().getClass());

        x.doAction("press right pedal twice");
        assertEquals(DeceleratingState.class, x.getState().getClass());

        x.doAction("come to stop");
        assertEquals(StoppedState.class, x.getState().getClass());

        x.doAction("system failure");
        assertEquals(SystemDoneState.class, x.getState().getClass());
        
        x.doAction("press left pedal once");
        assertEquals(SystemDoneState.class, x.getState().getClass());
    }

    @Test
    public void testRun2() {
        BuggyContext x = new BuggyContext();
        x.doAction("turn key");
        assertEquals(StoppedState.class, x.getState().getClass());
        
        x.doAction("hold left pedal");
        assertEquals(AcceleratingBState.class, x.getState().getClass());

        x.doAction("go max speed");
        assertEquals(ConstantSpeedState.class, x.getState().getClass());

        x.doAction("press right pedal twice");
        assertEquals(DeceleratingState.class, x.getState().getClass());

        x.doAction("come to stop");
        assertEquals(StoppedState.class, x.getState().getClass());

        x.doAction("take key out");
        assertEquals(OffState.class, x.getState().getClass());

        x.doAction("no keys");
        assertEquals(SystemDoneState.class, x.getState().getClass());
    }
}
