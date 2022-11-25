
import org.junit.Test;
import org.junit.rules.Timeout;

import Part1.CriteriaFemale;
import Part1.CriteriaMale;
import Part1.FacadePatternUI;
import Part1.FactoryPatternUI;
import Part1.FilterPattern;
import Part1.Person;
import Part1.PersonStates;
import Part1.Shape;
import Part1.SingleTonPattern;

import org.junit.Rule;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
public class Assignment4_1_Tests {
    SingleTonPattern x;
    FacadePatternUI y;
    FactoryPatternUI z;
    @Rule
    public Timeout maxTime = Timeout.seconds(2);

    //---SingleTonPatternTests----
    @Test
    public void testGetName() {
        x = SingleTonPattern.getCompanyHead();
        assertEquals("\"Neil Valin\" equals getName", "Neil Valin", x.getName());
        
    }
    @Test
    public void testSetName() {
        x = SingleTonPattern.getCompanyHead();
        for (int i =0;i<50;i++) {
            x.setName(""+i);
            assertEquals(""+i, x.getName());
        }
    }
    @Test
    public void testGetPosition() {
        x = SingleTonPattern.getCompanyHead();
        assertEquals("CEO", x.getPosition());
    }
    @Test
    public void testSetPostion() {
        x = SingleTonPattern.getCompanyHead();
        for (int i =0; i<50;i++) {
            x.setPosition("Board seat "+i);
            assertEquals("Board seat "+i, x.getPosition());
        }
    }

    //-----------Facade Pattern Tests------------------
    @Test
    public void testDrawCircle() {
        y = new FacadePatternUI("(2,3)", "red");
        assertEquals("◯",y.drawCircle());
    }

    @Test
    public void testDrawTriangle() {
        y = new FacadePatternUI("(2,3)", "red");
        assertEquals("▲", y.drawTriangle());
    }
    @Test
    public void testDrawRectangle() {
        y = new FacadePatternUI("(2,3)", "red");
        assertEquals("☐", y.drawRectangle());
    }
    
    //-----------Factory Pattern Tests-------------------
    @Test
    public void testIncorrectInput() {
        z = new FactoryPatternUI();
        try {
            Shape z2 = z.getShape("wrong", "(2,3)", "red");

        }
        catch (IllegalArgumentException e) {
            assertEquals(1,1);
        }
    }
    @Test
    public void testDraw1() {
        z = new FactoryPatternUI();
        Shape z2 = z.getShape("circle", "(2,3)", "red");
        assertEquals("◯",z2.draw());
    }


    @Test
    public void testDraw2() {
        z = new FactoryPatternUI();
        Shape z2 = z.getShape("rectangle","(2,3)", "red");
        assertEquals("☐", z2.draw());
    }
    @Test
    public void testDraw3() {
        z = new FactoryPatternUI();
        Shape z2 = z.getShape("triangle","(2,3)", "red");
        assertEquals("▲", z2.draw());
    }
    
    //------------------Filter Pattern------------------------
    @Test
    public void testMaleFilter() {
        ArrayList<Person> people = new ArrayList<>();
        for (int i =1; i<=50; i++ ) {
            PersonStates x = i%2==0?PersonStates.MALE:PersonStates.FEMALE;
            people.add(new Person(""+i, x, (byte)12, PersonStates.MALE));
        }
        FilterPattern filter = new FilterPattern(people);
        List<Person> q = filter.filter(new CriteriaMale());
        assertEquals(25, q.size());
    }
    @Test
    public void testFemaleFilter() {
        ArrayList<Person> people = new ArrayList<>();
        for (int i =1; i<=50; i++ ) {
            PersonStates x = i%2==0?PersonStates.MALE:PersonStates.FEMALE;
            people.add(new Person(""+i, x, (byte)12, PersonStates.MALE));
        }
        FilterPattern filter = new FilterPattern(people);
        List<Person> q = filter.filter(new CriteriaFemale());
        assertEquals(25, q.size());
    }
}
