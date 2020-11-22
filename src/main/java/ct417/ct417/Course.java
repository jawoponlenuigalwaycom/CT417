package ct417.ct417;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.joda.time.DateTime;

public class Course {
	private String courseName;
	private DateTime endDate = new DateTime();
	private DateTime startDate = new DateTime();
	Module module;
	Student student;

	HashSet<Student> set = new HashSet<Student>(); 
	List<Module> modules = new ArrayList<Module>();
	List<Student> st = new ArrayList<Student>();

	
	
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
		module.setCourse(this);
		// implementing null pointer exception if module is added without students first
		try {
		st = module.getStudent();
		for (int i=0; i< st.size(); i++)
			
		student = st.get(i);
		student.setCourse(this);
		}
		catch (NullPointerException e) {
	         System.out.println("Exception thrown  :" + e);
	      }
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
			return String.format("Course Name: "+ courseName +  "  "+startDate +" - "+ endDate);
	}
		
}
