package ct417.ct417;


import java.util.*;
import org.junit.Test;
import junit.framework.TestCase;

public class ModuleTest extends TestCase {
	
	@Test
	public void testName() {
        Module mod1 = new Module("maths","CT13");
        assertEquals("maths",mod1.getName());
	}
	
	@Test
	public void testID() {
        Module mod2= new Module("maths","CT13");
        assertEquals("CT13",mod2.getId());
       }
	
	@Test
	public void testGetandSetCourse() {
        Module mod1 = new Module("maths","CT13");
        Course obj = new Course("health science", null, null);
        mod1.setCourse(obj);
		List<Course> crs = new ArrayList<Course>();
		crs.add(obj);
        assertEquals(crs,mod1.getCourse());
	}
	@Test
	public void testGetandSetStudent() {
		Student obj =  new Student("kelly",19,100);
        Module mod1 = new Module("maths","CT13");
        mod1.setStudent(obj);
		List<Student> crs = new ArrayList<Student>();
		crs.add(obj);
        assertEquals(crs,mod1.getStudent());
	}


}

