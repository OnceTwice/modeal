package com.ff.modeal.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ff.modeal.vo.UserVo;

public class AdminInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		// 1. handler 종류
		if (handler instanceof HandlerMethod == false) {
			return true;
		}

		// 2. @Auth 가 붙혀 있는 없는지...
		Admin admin = ((HandlerMethod) handler).getMethodAnnotation(Admin.class);
		if (admin == null) { // 접근 제어가 필요 없는 Handler
			return true;
		}

		// 3. 접근 제어
		HttpSession session = request.getSession();

		if (session == null) {
			response.sendRedirect(request.getContextPath() + "/login");
			return false;
		}

		UserVo adminUser = (UserVo) session.getAttribute("adminUser");
		if (adminUser == null) {
			response.sendRedirect(request.getContextPath() + "/login");
			return false;
		}

		if (adminUser.getManagerIdentified() != 0) {
			return false;
		}

		// 4. 인증된 사용자
		return true;
	}

}
