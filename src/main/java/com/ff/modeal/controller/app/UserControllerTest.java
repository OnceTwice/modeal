package com.ff.modeal.controller.app;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.ff.modeal.dto.*;
import com.ff.modeal.service.app.*;

@Controller
@RequestMapping("user/app")
public class UserControllerTest {
	
	@Autowired
	UserServiceTest userService;
	
	@ResponseBody
	@RequestMapping("/main")
	public String main() {
		return "asdf";
	}
	
	@ResponseBody
	@RequestMapping("/input")
	public JSONResult InputString(@RequestParam(value="name", required=true, defaultValue="" ) String name,
									@RequestParam(value="id", required=true, defaultValue="" ) String id,
									@RequestParam(value="password", required=true, defaultValue="" ) String password ) {
		System.out.println(name);
		System.out.println(id);
		System.out.println(password);
		
		return JSONResult.success(1);
	}
}
