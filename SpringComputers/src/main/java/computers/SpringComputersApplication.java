package computers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import computers.beans.Computers;
import computers.controller.BeanConfiguration;
import computers.repository.ComputersRepository;

@SpringBootApplication
public class SpringComputersApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringComputersApplication.class,args);
	}
	
	@Autowired
	ComputersRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
	//Using an existing bean
	Computers c = appContext.getBean("computers", Computers.class);
	c.setGhz(3.4);
	repo.save(c);
	
	//Creating a bean to use – not managed by Spring
	Computers d = new Computers("Lenovo", 3.2, 125448, "AMD");
	repo.save(d);
	
	List<Computers> allMyComputers = repo.findAll();
		for(Computers list: allMyComputers) {
			System.out.println(list.toString());
	
		}
	((AbstractApplicationContext) appContext).close();
	}
}



