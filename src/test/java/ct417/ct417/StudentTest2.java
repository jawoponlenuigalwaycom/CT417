package ct417.ct417;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

public class StudentTest2 extends TestCase {
	
	@Test
	public void testUsername() {
		Student studentObject= new Student("jane", 18, 1234);
		assertEquals("jane18",studentObject.getUsername());
	}
	
	@Test
	public void testgetAge() {
		Student studentObject= new Student("jane", 18, 1234);
		assertEquals(18,studentObject.getAge());
	}
	@Test
	public void testgetID() {
		Student studentObject= new Student("jane", 18, 1234);
		assertEquals(1234,studentObject.getID());
	}
	@Test
	public void testgetName() {
		Student studentObject= new Student("jane", 18, 1234);
		assertEquals("jane",studentObject.getName());
	}@Test
	public void testgetStudent() {
		Student studentObject= new Student("jane", 18, 1234);
		assertEquals("jane181234",studentObject.getStudent());
	}
	@Test
	public void testgetCourse() {
		Student studentObject= new Student("jane", 18, 1234);
        Course obj = new Course("health science", null, null);
		HashSet<Course> courses = new HashSet<Course>();
		studentObject.setCourse(obj);
		courses.add(obj);
		assertEquals(courses,studentObject.getCourse());
	}
	@Test
	public void testgetModule() {
		Student studentObject= new Student("jane", 18, 1234);
        Module obj = new Module("maths","CT13");
		List<Module> modules = new ArrayList<Module>();
		studentObject.setModule(obj);
		modules.add(obj);
		assertEquals(modules,studentObject.getModule());
	}
}
