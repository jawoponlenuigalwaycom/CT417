package ct417.ct417;

import java.util.ArrayList;
import java.util.List;

public class Student {
		private String name;
		private int age;
		private int id;
		private String username;
		Course course;
		Module module;
		
		List<Module> modules = new ArrayList<Module>();
		List<Course> courses = new ArrayList<Course>();

	
	public Student(String name, int age, int id){
			this.name=name;
			this.age=age;
			this.id=id;
		}
	
	
	public String getUsername(){
		String username= name+age;
		return username;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getID() {
		return id;
	}
	
	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public Module getModule() {
		return module;
	}


	public void setModule(Module module) {
		this.module = module;
	}


	public String getName() {
		return name;
	}
	public String getStudent() {
		String person =  name+age+id;
		return person;
	}
	
	public String toString() {
		return String.format("Name"+ name +"Age: "+age+"ID: "+ id+ "Username"+ getUsername());
		
	}
	
}
