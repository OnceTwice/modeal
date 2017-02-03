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
public class JoinController {
	
	@Autowired
	JoinService userService;
	
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
	@RequestMapping("/userinput")		// default값이 get이더라도 get을 써주면 못받아옴
	public JSONResult InputUserString(@RequestParam(value="id", required=true, defaultValue="" ) String id,
										@RequestParam(value="password", required=true, defaultValue="" ) String password,
										@RequestParam(value="gender", required=true, defaultValue="" ) String gender,
										@RequestParam(value="location", required=true, defaultValue="" ) String location,
										@RequestParam(value="birth", required=true, defaultValue="" ) String birth) {
		System.out.println(id);
		System.out.println(password);
		System.out.println(gender);
		System.out.println(location);
		System.out.println(birth);
		
		return JSONResult.success(1);
	}
	
	@ResponseBody
	@RequestMapping("/ownerinput")
	public JSONResult InputOwnerString(@RequestBody UserVo userVo) {
		System.out.println("ㅅㅄㅄㅄㅄㅂ");
		System.out.println(userVo);
		
		return JSONResult.success(1);
	}
}
