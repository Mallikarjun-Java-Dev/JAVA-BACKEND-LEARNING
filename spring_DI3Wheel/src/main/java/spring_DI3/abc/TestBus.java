package spring_DI3.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBus {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);

	Bus b = context.getBean(Bus.class);
	b.test();
}
}
