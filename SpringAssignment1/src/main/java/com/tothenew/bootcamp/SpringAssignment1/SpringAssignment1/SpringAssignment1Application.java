package com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1;

import com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques3.Manager3;
import com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques4.Manager4;
import com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques5.Manager5;
import com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques6.Manager6;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAssignment1Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext3 = SpringApplication.run(SpringAssignment1Application.class, args);

//		Ques3
//		Manager3 manager3 = applicationContext3.getBean(Manager3.class);
//		manager3.managework();


		//Ques4
//		Manager4 manager4 = applicationContext3.getBean(Manager4.class);
//		manager4.managework();


		//Ques5
//		Manager5 manager5 = applicationContext3.getBean(Manager5.class);
//		manager5.managework();

		//Ques6
		Manager6 manager6 = applicationContext3.getBean(Manager6.class);
		manager6.managework();


	}
}
