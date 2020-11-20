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
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}	
     public String toString() {
		return String.format(id+" "+ name+" "+ getStudent());
	}
	
	
	
}
