package com.example.consumingrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("employees")
public class Controler {

	​@RequestMapping
	   ​public String handleEmployeeRequestByDept (@RequestParam("dept") String deptName,
	                                                                      ​Model map) {
	  map.addAttribute("msg", "employees request by dept: " + deptName);
	       ​return "my-page";
	   ​}

}
