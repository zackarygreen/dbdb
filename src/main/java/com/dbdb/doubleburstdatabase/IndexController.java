package com.dbdb.doubleburstdatabase;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String goToIndex(){
		return "forward:index.html";
	}

}
