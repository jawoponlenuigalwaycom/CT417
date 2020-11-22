package ct417.ct417;

import java.io.*; 
import java.lang.*; 
import java.util.*;

public class Module{
		private String name;
		private String id;
		Student student;
		Course course;
		
		List<Student> students = new ArrayList<Student>();
		List<Student> studc = new ArrayList<Student>();
		List<Course> crs = new ArrayList<Course>();
		
	public Module(String name, String id){
		this.name=name;
		this.id= id;
		}

	public List<Student> getStudent() {
		return students;
	}
	
	public void setStudent(Student student) {
		students.add(student);
		student.setModule(this);
		
	}

	public List getCourse() {
		return crs;
	}

	public void setCourse(Course course) {
		crs.add(course);
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}	
     public String toString() {
		return String.format("\n\t Module ID:"+ id+"\tModule name: "+ name+"\tRegistered Students: " + getStudent());
	}
	
	
	
}
