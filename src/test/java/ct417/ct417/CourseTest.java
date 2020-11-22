package ct417.ct417;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.Test;

import junit.framework.TestCase;

public class CourseTest extends TestCase {
	
	@Test
	public void testName() {
    Course cour = new Course("Science",null,null);
    assertEquals("Science",cour.getCourseName());
    }
	@Test
	public void testgetEndDate() {
	DateTime date1 = new DateTime("2020-12-07");
    Course cour = new Course("Science",null,date1);
    assertEquals(date1,cour.getEndDate());
    }
	@Test
	public void testgetStartDate() {
	DateTime date1 = new DateTime("2020-12-07");
    Course cour = new Course("Science",date1,null);
    assertEquals(date1,cour.getStartDate());
    }
	public void testGetandSetCourse() {
        Module obj = new Module("maths","CT13");
        Course e = new Course("health science", null, null);
        e.setModule(obj);
		List<Module> crs = new ArrayList<Module>();
		crs.add(obj);
        assertEquals(crs,e.getModule());
	}


}
