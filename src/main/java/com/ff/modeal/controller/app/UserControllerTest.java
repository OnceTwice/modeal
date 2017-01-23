package com.ff.modeal.controller.app;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.ff.modeal.dto.*;
import com.ff.modeal.service.app.*;
import com.ff.modeal.vo.*;

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
	@RequestMapping("/list")
	public Object list() {
		List<UserVo> list = userService.getAllUsers();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "success");
		map.put("data", list);
		
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/input")
	public JSONResult InputString(@RequestParam(value="id", required=true, defaultValue="" ) String id,
									@RequestParam(value="password", required=true, defaultValue="" ) String password,
									@RequestParam(value="gender", required=true, defaultValue="" ) String gender,
									@RequestParam(value="location", required=true, defaultValue="" ) String location,
									@RequestParam(value="birth", required=true, defaultValue="" ) String birth,
									@RequestParam(value="managerIdentified", required=true, defaultValue="1") String managerIdentified,
									@RequestParam(value="mkName", required=true, defaultValue="") String mkName,
									@RequestParam(value="mkAddress", required=true, defaultValue="") String mkAddress,
									@RequestParam(value="mkPhoneN", required=true, defaultValue="") String mkPhoneN,
									@RequestParam(value="mkIntro", required=true, defaultValue="") String mkIntro) {
		System.out.println(id);
		System.out.println(password);
		System.out.println(gender);
		System.out.println(location);
		System.out.println(birth);
		System.out.println(managerIdentified);
		
		System.out.println(mkName);
		System.out.println(mkAddress);
		System.out.println(mkPhoneN);
		System.out.println(mkIntro);
		
		return JSONResult.success(1);
	}
}
