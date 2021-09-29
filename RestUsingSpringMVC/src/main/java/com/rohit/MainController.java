package com.rohit;
import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/add")
	public @ResponseBody ModelAndView add(@RequestParam("a") int a, @RequestParam("b") int b) {
		ModelAndView mv = new ModelAndView();
		int k = a + b;
		System.out.println(k);
		mv.addObject("result", k);
		mv.setViewName("result.jsp");
		return mv;
		
	}
	@RequestMapping(value = "/getEmployee/",method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Employee> getEmployee(){
		EmployeeRepository empR = new EmployeeRepository();
		return empR.getEmployee(); 
	}
}
