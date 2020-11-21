package ct417.ct417;

import junit.framework.TestCase;

public class StudentTest2 extends TestCase {
	

	public void test() {
		Student studentObject= new Student("jane", 18, 1234);
		assertEquals("jane18",studentObject.getUsername());

	}
}
