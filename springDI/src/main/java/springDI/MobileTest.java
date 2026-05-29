package springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileTest {
	public static void main(String[] args) {
		
	
ApplicationContext context=new AnnotationConfigApplicationContext(Myconfig.class);
Mobile m=context.getBean(Mobile.class);
m.insert();
}
}