package com.wildcodeschool.myProject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul>"
				+"<li><a href=/doctor/1>Doctor one</a></li>"
				+"<li><a href=/doctor/2>Doctor two</a></li>"
				+"<li><a href=/doctor/3>Doctor three</a></li>"
				+"<li><a href=/doctor/4>Doctor four</a></li>"
				+"</ul>";
	}


	@RequestMapping("/doctor/1")
	@ResponseBody
	public String firstDoc(){
		return "William Hartnell";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String secDoc(){
		return "Patrick Troughton";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String thirdDoc(){
		return "Jon Pertwee";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String forthDoc(){
		return "Tom Baker";
	}



}
