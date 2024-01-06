package com.ls.la.DockerJenkinGit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@GetMapping("/message")
	
	public  getMessage()
	{
		
		return "Hello. This is cool ";
	}

}
