package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.vo.BaseResponse;
import com.example.demo.vo.Page;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@CrossOrigin(origins = "*")
public class BaseController {
	
	/**
	 * 取得page物件
	 * @param page  頁數
	 * @param per_page  每頁顯示筆數
	 * @return
	 */
	protected Page getPageObject(String page, String per_page) {
		Integer pageInt = Integer.parseInt(page);
		Integer showNum = Integer.parseInt(per_page);
		
		return new Page((pageInt - 1) * showNum, showNum);
	}

	/**
	 * 
	 * @param result 回應物件
	 * @param msg 回應訊息
	 * @return
	 */
	protected BaseResponse getSuccessResponse(Object result, String msg) {
		BaseResponse rsp = new BaseResponse();
		rsp.setRspCode("0000");
		rsp.setRspMsg(msg);
		rsp.setRspBody(result);
		
		return rsp;
	}
	
	@ExceptionHandler({ Exception.class })
	public BaseResponse handleException(Exception e) {
		e.printStackTrace();
		BaseResponse vo = new BaseResponse();
		vo.setRspCode("E9999");
		vo.setRspMsg("系統異常");
		
		return vo;
	}

	protected static String toJson(Object src) {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();
		Gson gson = gsonBuilder.create();
		return gson.toJson(src);
	}
}
