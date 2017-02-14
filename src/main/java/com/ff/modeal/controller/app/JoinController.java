package com.ff.modeal.controller.app;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.ff.modeal.dto.*;
import com.ff.modeal.service.app.*;
import com.ff.modeal.vo.app.*;

@Controller
@RequestMapping("user/app")
public class JoinController {
	
	@Autowired
	private JoinService joinService;
	
	/************ 회원 가입 ************/
	@ResponseBody						// InputUserString 메소드는 데이터를 저장해주는 메소드이므로 리턴값이 어떤것이 들어오든 무관
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
		
//		System.out.println(userVo + "123");
//		List<UserVo> data = new ArrayList<UserVo>();
//		data.add(userVo);
		
//		System.out.println("사용자 Controller 실행 전 =====" + joinService.joinUser(userVo));
		
		joinService.joinUser(userVo);

//		System.out.println("사용자 Controller 실행 후 =====" + joinService.joinUser(userVo));
		
		return JSONResult.success(1);
	}
	
	@ResponseBody
	@RequestMapping("/ownerinput")
	public JSONResult InputOwnerString(@RequestBody Map<String, Object> map) {/*@RequestBody UserVo userVo*/ 
//		System.out.println("ㅅㅄㅄㅄㅄㅂ");
//		System.out.println(userVo);
		
//		System.out.println("사업자 Controller 실행 전 ===== " + joinService.joinOwner(userVo));

/*
		List<UserVo> data = new ArrayList<UserVo>();
		data.add(userVo);
		
		joinService.joinOwner(userVo);
*/
		System.out.println("Controller에서========" + map);
//		System.out.println(map.get("user"));
//		System.out.println(map.get("shop"));
		
		joinService.joinOwnerMarket(map);			// 사업자 점포 등록 후
		joinService.joinOwnerUser(map);				// 점포 번호와 shopno를 일치시킴
		
		
//		System.out.println("사업자 Controller 실행 후 ===== " + joinService.joinOwner(userVo));
		
		return JSONResult.success(1);
	}

	/************ 회원 정보 수정 ************/
	@ResponseBody
	@RequestMapping("/usermodify")
	public JSONResult UserModify(UserVo userVo,	@RequestParam(value="no", required=true, defaultValue="" ) Long no,
												@RequestParam(value="password", required=true, defaultValue="" ) String password,
												@RequestParam(value="gender", required=true, defaultValue="" ) String gender,
												@RequestParam(value="location", required=true, defaultValue="" ) String location,
												@RequestParam(value="birth", required=true, defaultValue="" ) String birth) {
		userVo.setNo(no);
		userVo.setPassword(password);
		userVo.setGender(gender);
		userVo.setLocation(location);
		userVo.setBirth(birth);
		
		joinService.modifyUser(userVo);
		
		return JSONResult.success(1);
	}
	
	@ResponseBody
	@RequestMapping("/ownermodify")
	public JSONResult OwnerModify(@RequestBody Map<String, Object> map) {
		joinService.modifyOwnerMarket(map);					// 사업자 매장 수정
		joinService.modifyOwnerUser(map);					// 사업자 개인정보 수정
		
		return JSONResult.success(1);
	}

	/********** 회원 탈퇴 ************/
	@ResponseBody
	@RequestMapping(value="/userleave", method=RequestMethod.POST)
	public void deleteUser(
			@RequestParam(value = "no", required = true, defaultValue = "") Long no
			) {
		System.out.println("dfasfdfadfdfdfa"+no);
		joinService.deleteUser(no);

	}
}
