package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Uppgift1Controller { 
	
	@RequestMapping("/")
	public String index() {
		
		return "<h2>Välj ett av följande URL: </h2> \n" + "<h4>/add?num1=10&num2=30</h4> \n"+ "<h4>/subtract?num1=20&num2=10</h4> \n"+ "<h4>/multiply?num1=10&num2=5</h4> \n"+ "<h4>/divide?num1=10&num2=2</h4> \n";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/add")
	public int add(int num1,int num2) {
		int sum = num1 + num2 ;
		return sum;
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/subtract")
	public int subtract(int num1,int num2) {
		int sum = num1 - num2 ;
		return sum;
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/multiply")
	public int multiply(int num1,int num2) {
		int sum = num1 * num2 ;
		return sum;
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/divide")
	public double divide(int num1,int num2) {
		double sum = num1 / num2 ;
		return sum;
	}

}
