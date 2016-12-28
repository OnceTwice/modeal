package com.ff.modeal.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ff.modeal.service.UserService;
import com.ff.modeal.vo.UserVo;

public class AdminLoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String id = request.getParameter("id");
		String password = request.getParameter("password");

		// Web Application Context 받아오기
		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());

		// Container 안에 있는 UsersService Bean(객체) 받아오기
		UserService usersService = ac.getBean(UserService.class);

		// 데이터베이스에서 해당 UsersVo 받아오기
		UserVo adminVo = usersService.login(id, password);

		// 이메일과 패쓰워드가 일치하지 않는 경우
		if (adminVo == null) {
			response.sendRedirect(request.getContextPath() + "/login?result=fail");
			return false;
		}

		if (adminVo.getManagerIdentified() != 0) {
			return false;
		}

		// 인증 처리
		HttpSession session = request.getSession(true);
		session.setAttribute("adminUser", adminVo);
		response.sendRedirect(request.getContextPath() + "/loginsuccess");

		return false;
	}

}
