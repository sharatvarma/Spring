import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("applicationContext.xml");  
		ApplicationContext newcontext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	      
	    Student student=(Student)context.getBean("studentbean");  
	    Student student1=(Student)newcontext.getBean("studentbean");
	    student.displayInfo();  
	    student1.displayInfo();

	}

}
