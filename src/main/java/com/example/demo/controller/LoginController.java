package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LoginService;
import com.example.demo.vo.BaseResponse;
import com.example.demo.vo.Menu;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController extends BaseController {

	@Resource
	private LoginService loginService;

	@RequestMapping(value = "/getMenu", method = RequestMethod.POST)
	public Map<String, Object> getMenu(@RequestParam String strEmpID) {
		Map<String, Object> map = new HashMap<>();
		List<Menu> body = loginService.getBody(strEmpID);
		map.put("rspCode", "0000");
		map.put("rspMsg", "登入成功");
		map.put("rspBody", body);
		return map;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public BaseResponse createAuthenticationToken() throws Exception {
		Map<String, Object> result = new HashMap<>();
		return getSuccessResponse(result, "登入成功");
	}
}
