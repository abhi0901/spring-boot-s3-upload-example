package abhi.s3.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class S3Controller {
	
	@RequestMapping(value="/",method= RequestMethod.GET)
	public String showUploadPage(){
		return "index";
	}

}
