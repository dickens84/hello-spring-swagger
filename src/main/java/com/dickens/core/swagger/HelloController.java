package com.dickens.core.swagger;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(value = "hello")
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE }, value="helloWorld")
	@ApiOperation(httpMethod = "GET", value = "Hello Worlds", response = HashMap.class)
	public @ResponseBody Map<String, String> samplePoc() {
		Map<String, String> response = new HashMap<String,String>();
		response.put("status", "success");
		response.put("message", "Hello Worlds");
		 return response;
	}
	
	

}
