package spring_ioc.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RodJohnson {
	public static void main(String[] args) {
		//loading configuration file into container
ApplicationContext applicationContext = new AnnotationConfigApplicationContext (MyConfig.class);
Spotify s1=applicationContext.getBean(Spotify.class);
s1.play();

Spotify s2=applicationContext.getBean(Spotify.class);
System.out.println(s2==s1);
s2.play();
}
}