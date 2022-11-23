import org.junit.AfterClass;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;

import static org.junit.Assert.*;
public class Assignment4Tests {
    @Rule
    public Timeout maxTime = Timeout.seconds(2);

    //---SingleTonPatternTests----
    @Test
    public void testGetName() {
        SingleTonPattern x = SingleTonPattern.getCompanyHead();
        assertEquals("\"Neil Valin\" equals getName", "Neil Valin", x.getName());
        
    }
    @Test
    public void testSetName() {
        SingleTonPattern x = SingleTonPattern.getCompanyHead();
        for (int i =0;i<50;i++) {
            x.setName(""+i);
            assertEquals(""+i, x.getName());
        }
    }
    @Test
    public void testGetPosition() {
        SingleTonPattern x = SingleTonPattern.getCompanyHead();
        assertEquals("CEO", x.getPosition());
    }
    @Test
    public void testSetPostion() {
        SingleTonPattern x = SingleTonPattern.getCompanyHead();
        for (int i =0; i<50;i++) {
            x.setPosition("Board seat "+i);
            assertEquals("Board seat "+i, x.getPosition());
        }
    }

    //-----------Facade Pattern Tests------------------
    
}
