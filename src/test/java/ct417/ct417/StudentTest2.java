package ct417.ct417;

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
		Course cour = new Course("Science",null,null);
		studentObject.setCourse(cour);
		assertEquals(cour,studentObject.getCourse());
	}
}
