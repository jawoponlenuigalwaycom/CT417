package ct417.ct417;

import junit.framework.TestCase;

public class ModuleTest extends TestCase {
	
	public void test() {
		
		Module mod1 = new Module("maths","CT13");
		Module mod2 = new Module("Magnetics","CT56");
		Module mod3 = new Module ("communications","CT24");
		
		Student students1 =  new Student("kelly",19,100);
		Student students2 =  new Student("lilly",20,300);

		mod1.setStudent(students1);
		mod1.setStudent(students2);
		
		//Course core = new Course("Science",(2001,10,01,12,0,0,0) ,(2002,12,12,12,0,0,0));
		Course cour = new Course("Science",null,null);
		Course core1 = new Course("Health",null,null);
		cour.setModule(mod1);
		cour.setModule(mod2);
		cour.setModule(mod3);


	
		

	//	System.out.println(mod1);
		System.out.println(cour);
		
	}

}
