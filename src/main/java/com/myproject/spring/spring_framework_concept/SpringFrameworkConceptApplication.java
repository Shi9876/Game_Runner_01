package com.myproject.spring.spring_framework_concept;

import com.myproject.spring.spring_framework_concept.enterprise.example.web.MyWebController;
import com.myproject.spring.spring_framework_concept.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFrameworkConceptApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringFrameworkConceptApplication.class, args);//application context
         //MarioGame game = new MarioGame();         //for MarioGame
		//SuperContraGame game = new SuperContraGame();

		//GamingConsole game = new MarioGame();
		//GameRunner runner = new GameRunner(game); //passing game as constructor argument to the GameRunner class

		GameRunner runner = context.getBean(GameRunner.class);

		runner.run();    //to run the MarioGame, (GameRunner class calls)
		com.myproject.spring.spring_framework_concept.enterprise.example.web.MyWebController controller = context.getBean(MyWebController.class);//to get the instance of WebController
		System.out.println(controller.returnValueFromBusinessService());
	}

}



//Note 1: We can also write GamingConsole in place of PacMan. Now we can easily switch the game by just changing the name.

//Note 2: There are 2 steps in creating GameRunner class.
		//1. We need the implementation of GamingConsole i.e. PacMan (to create object)
		//2. then pass it as a constructor argument then create a GameRunner class ( to manage dependencies )

//Note 3: To create GameRunner class we need an instance of the GamingConsole therefore GamingConsole interface is a dependency of GameRunner class.

//Note 4. Ex- for an enterprise application we have 1000s of classes and each class a no. of dependencies so instead of creating their objects and managing their dependencies manually we give this responsibility to Spring Framework.

//Note 5. How can we tell Spring Framework to create these 2 instances ( by adding an @Component annotation)

//Note 6. Which is the instance of Gaming Console that we are creating as component it's the MarioGame and we would take it and Autowired it in the GameRunner class ny putting an annotation @Autowired

//Note 7. It says, when we are creating a GameRunner class we need to create a GamingConsole interface as well and then autowire in it.

//Note 8. Autowired the MarioGame into the GameRunner.

//Note 9. Now we want to launch up a Spring application context.

//Note 10. Now, we have org.springframework.boot.springapplication class imported in. And now I want to take this and assign statement to a new local variable. The springapplication.run creates an application context and return it back.Here, naming variable as context. So we are creating a spring context to manage all our beans. When we launch a Spring Application context Spring Framework creates an instance for all the components.

//Note 11. How can I get a specific bean from this spring framework - can do this by calling a method called context.getbean(). Now no need to create objects manually.

//Note 12. Any instance of any component that spring creates is called a bean.