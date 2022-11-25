package Part2;
import java.io.Console;
public class Buggy {
    static State currentState=State.Off;
    private enum State {
        Stopped, Accelerating_Forward, Accelerating_Backward, Moving_At_Constant_Speed, Decelerating,Off
    }
    public static void main(String[] args) {
        boolean x = true;
        System.out.println("List of actions: ");
        System.out.println("                  (L/R)n time - n is the number of presses and time is the amount of time its pressed. EX L1 5 is left pedal pressed for 5sec");
        System.out.println("                     s        - Start/Stop rover");
        System.out.println("                     b        - rover breaks");
        System.out.println("                     0        - Come to a complete stop when decelerating");
        System.out.println("                     12       - reach the maximum speed");
        Console i = System.console();
        while (x) {
            System.out.println();
            System.out.println("Current state: "+currentState);
            System.out.println();
            System.out.print("Please enter your next event: ");
            String n = i.readLine();
            String[] s = n.split(" ");
            if (currentState==State.Stopped) {
                if (s.length>1 && s[1].equals("5") && s[0].equals("L1")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Accelerating_Backward;
                    System.out.println("Action: left pedal held for 5 seconds");
                    
                }
                else if (n.equals("L1")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Accelerating_Forward;
                    System.out.println("Action: left pedal pressed once");
                    
                }
                else if (n.equals("s")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Off;
                    System.out.println("Action: take the key out of the ignition");
                }
                else if (n.equals("b")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Off;
                    System.out.println("Action: The rover has broken");
                    
                    x=false;
                }
                else {
                    System.out.println("Not a valid action");
                }
            }
            else if (currentState==State.Accelerating_Forward) {
                if (n.equals("R2")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Decelerating;
                    System.out.println("Action: right pedal pressed twice");
                    
                }
                else if (s.length>1 && s[0].equals("R1") && s[1].equals("5")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Moving_At_Constant_Speed;
                    System.out.println("Action: right pedal held for 5 seconds");
                    
                }
                else if (n.equals("12")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Accelerating_Forward;
                    System.out.println("Action: accelerated to max speed");

                }
                else {
                    System.out.println("Not a valid action");
                }
            }
            else if (currentState==State.Accelerating_Backward) {
                if (n.equals("L1")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Moving_At_Constant_Speed;
                    System.out.println("Action: left pedal pressed once");
                    
                }
                else if (n.equals("R2")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Decelerating;
                    System.out.println("Action: right pedal pressed twice");
                    
                }
                else if (n.equals("12")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Moving_At_Constant_Speed;
                    System.out.println("Action: accelerated to max speed");

                }
                else {
                    System.out.println("Not a valid action");
                }
            }
            else if (currentState==State.Moving_At_Constant_Speed) {
                if (n.equals("L1")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Accelerating_Forward;
                    System.out.println("Action: left pedal pressed once");
                    
                }
                else if (n.equals("R2")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Decelerating;
                    System.out.println("Action: right pedal pressed twice");
                    
                }
                else {
                    System.out.println("Not a valid action");
                }
            }
            else if (currentState==State.Decelerating) {
                if (n.equals("L1")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Accelerating_Forward;
                    System.out.println("Action: left pedal pressed once");
                    
                }
                else if (n.equals("0")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Stopped;
                    System.out.println("Action: The rover comes to a complete stop");
                    
                }
                else {
                    System.out.println("Not a valid action");
                }
            }
            else if (currentState==State.Off) {
                if (n.equals("s")) {
                    System.out.println("Previous state: "+currentState);
                    currentState = State.Stopped;
                    System.out.println("Action: put keys into the ignition and turned");
                    
                }
                else if (n.equals("done")){
                    x=false;
                }
                else {
                    System.out.println("Not a valid action. enter 'done' to stop.");
                }
            }
        }
    }
}