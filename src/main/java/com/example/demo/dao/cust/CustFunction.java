package com.example.demo.dao.cust;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustFunction {

	List<Map<String, String>> getLoginFunctionList();

	List<Map<String, Object>> getUserColComments(Map<String, Object> map);

	List<Map<String, Object>> getColumnList(Map<String, Object> map);
}
