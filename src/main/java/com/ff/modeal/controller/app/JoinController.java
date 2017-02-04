package com.ff.modeal.controller.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.JSONResult;
import com.ff.modeal.service.app.JoinService;
import com.ff.modeal.vo.app.UserVo;

@Controller
@RequestMapping("user/app")
public class JoinController {
	
	@Autowired
	private JoinService joinService;
	
	@ResponseBody
	@RequestMapping("/main")
	public String main() {
		return "asdf";
	}
	
	@ResponseBody
	@RequestMapping("/list")
	public Object list() {
		List<UserVo> list = joinService.getAllUsers();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "success");
		map.put("data", list);
		
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/userinput")		// default값이 get이더라도 get을 써주면 못받아옴
	public JSONResult InputUserString(UserVo userVo,
										@RequestParam(value="id", required=true, defaultValue="" ) String id,
										@RequestParam(value="password", required=true, defaultValue="" ) String password,
										@RequestParam(value="gender", required=true, defaultValue="" ) String gender,
										@RequestParam(value="location", required=true, defaultValue="" ) String location,
										@RequestParam(value="birth", required=true, defaultValue="" ) String birth) {
//		System.out.println(id);
//		System.out.println(password);
//		System.out.println(gender);
//		System.out.println(location);
//		System.out.println(birth);
		
		userVo.setId(id);
		userVo.setPassword(password);
		userVo.setGender(gender);
		userVo.setLocation(location);
		userVo.setBirth(birth);
		userVo.setManagerIdentified(1L);
		
//		System.out.println(userVo);
		
//		System.out.println("사용자 Controller 실행 전 =====" + joinService.joinUser(userVo));
		
		joinService.joinUser(userVo);

//		System.out.println("사용자 Controller 실행 후 =====" + joinService.joinUser(userVo));
		
		return JSONResult.success(1);
	}
	
	@ResponseBody
	@RequestMapping("/ownerinput")
	public JSONResult InputOwnerString(@RequestBody UserVo userVo) {
//		System.out.println("ㅅㅄㅄㅄㅄㅂ");
//		System.out.println(userVo);
		
//		System.out.println("사업자 Controller 실행 전 ===== " + joinService.joinOwner(userVo));
		
		joinService.joinOwner(userVo);

//		System.out.println("사업자 Controller 실행 후 ===== " + joinService.joinOwner(userVo));
		
		return JSONResult.success(1);
	}
}
