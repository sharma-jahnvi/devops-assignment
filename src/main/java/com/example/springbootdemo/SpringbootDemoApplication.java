package com.example.springbootdemo;

import com.example.springbootdemo.model.Employee;
import com.example.springbootdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);

	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee= new Employee();
		employee.setFirstName("Jahn vi");
		employee.setLastName("Sharma");
		employee.setEmail("jahnvi123@gmail.com");
		employeeRepository.save(employee);


		Employee employee1= new Employee();
		employee1.setFirstName("Sonal");
		employee1.setLastName("Sharma");
		employee1.setEmail("sonal123@gmail.com");
		employeeRepository.save(employee1);


		Employee employee2= new Employee();
		employee2.setFirstName("Tush ar");
		employee2.setLastName("Sharma");
		employee2.setEmail("tushar123@gmail.com");
		employeeRepository.save(employee2);
	}

}

