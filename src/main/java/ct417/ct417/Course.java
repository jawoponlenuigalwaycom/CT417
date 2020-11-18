package ct417.ct417;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

public class Course {
	private String courseName;
	DateTime endDate = new DateTime();
	DateTime startDate = new DateTime();

	
	List<Student> enrollStudents = new ArrayList<Student>();
	List<Module> modules = new ArrayList<Module>();
	
	
	Course(String cn, DateTime startDate, DateTime endDate){
		String courseName = cn;
		this.startDate= startDate;
		this.endDate = endDate;		
	}
	
	

}
