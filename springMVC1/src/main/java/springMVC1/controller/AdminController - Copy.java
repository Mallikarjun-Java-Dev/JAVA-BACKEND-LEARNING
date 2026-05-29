package springMVC1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

	@RequestMapping("/insert")
	@ResponseBody
	public String insertAdmin() {
		System.err.println("data data inserted successfully..");
		return "inserted";
	}

	@RequestMapping("/delete")    //it is used to map the url with the method and it is used to handle the request and response
	@ResponseBody                 //it is used to return the response to the client and it is used to convert the response to the desired format
	public String deleteAdmin() {
		System.out.println("Admin data deleted!!");
		return "deleted";
	}

}
