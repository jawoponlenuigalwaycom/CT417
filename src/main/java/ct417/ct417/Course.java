package ct417.ct417;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

public class Course {
	private String courseName;
	private DateTime endDate = new DateTime();
	private DateTime startDate = new DateTime();
	Module module;
	Student student;

	
	List<Student> enrollStudents = new ArrayList<Student>();
	List<Module> modules = new ArrayList<Module>();
	
	
	public Course(String courseName, DateTime startDate, DateTime endDate){
		this.courseName = courseName;
		this.startDate= startDate;
		this.endDate = endDate;		
	}
	
	
	public List<Module> getModule() {
		return modules;
	}
	
	public void setModule(Module module) {
		modules.add(module);
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public DateTime getEndDate() {
		return endDate;
	}
	
	public DateTime getStartDate() {
		return startDate;
	}
	
	public String toString() {
			return String.format("Course Name: "+ courseName +  "  "+startDate +" - "+ endDate + " "+ getModule());
	}
		
}
