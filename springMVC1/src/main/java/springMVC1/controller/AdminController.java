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

	@RequestMapping("/delete")
	@ResponseBody                      //
	public String deleteAdmin() {
		System.out.println("Admin data deleted!!");
		return "deleted";
	}

}
