package com.anil.controller;
import com.anil.pojo.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Controller
public class HelloController {
	
	@RequestMapping(value= "/index", method=RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView model=new ModelAndView("hello");
		model.addObject("message", "Welcome to Spring WEB MVC");
		return model;
	}
}




//public class HelloController {
//	private HelloWorld helloWorld; 
//   public static void main(String[] args) {
//	   
//      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//      obj.getMessage();
//      
//   }
//}
