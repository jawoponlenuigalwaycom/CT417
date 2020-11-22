package ct417.ct417;

public class Main {
	Course course;
	Module module;
	Student student;
	
   // DateTime dt = new DateTime("2004-12-13T21:39:45.618-08:00");
	
   Main(){ }
	
	public static void main(String args[]) {
		
		 //List of courses
        Course cour = new Course("Science",null,null);
		Course cour1 = new Course("Engineering",null,null);

        //List of modules
        Module mod1 = new Module("maths","CT13");
		Module mod2 = new Module("Magnetics","CT56");
		Module mod3 = new Module ("communications","CT24");
        
        //List of Students
		Student students1 =  new Student("kelly",19,100);
		Student students2 =  new Student("lilly",20,300);
		Student students3 =  new Student("Adam",21,400);
        Student students4 =  new Student("Sean",20,350);
        Student students6 =  new Student("Ben",20,350);
        Student students7 =  new Student("George",20,350);

        //Adding students to modules
		mod1.setStudent(students1);
        mod1.setStudent(students2);
        mod1.setStudent(students3);
        mod1.setStudent(students4);

        mod2.setStudent(students1);
        mod2.setStudent(students2);

        mod3.setStudent(students6);
        mod3.setStudent(students7);
        mod3.setStudent(students3);


		//Adding modules to courses
		cour.setModule(mod1);
		cour.setModule(mod2);
        cour.setModule(mod3);
        
        cour1.setModule(mod1);
        cour1.setModule(mod3);

        //Print out results
        System.out.println(cour);
        System.out.println(cour.getModule());
       // System.out.println(cour.getModule().getStudents());


        
        System.out.println(cour1);
        System.out.println(cour1.getModule());

        
       // System.out.println(students1.getCourse());
        System.out.println("Student "+ students1+ "\tis registered to the following modules w/ associated students \n" + students1.getModule());
        System.out.println("Module "+ mod3.getName()+"is in the following courses\n\t" + mod3.getCourse());
        System.out.println("Module "+ mod3.getName()+" has the following students\n"+ mod3);



	}

	private static String mod3() {
		// TODO Auto-generated method stub
		return null;
	}

}
