package com.example.demo.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.vo.Menu;


@Service
public class LoginService extends BaseService {

    public List<Menu> getBody(String strEmpID) {
        List<Map<String, String>> functlist = custFunction.getLoginFunctionList();
        Map<String, String> titleMap = new LinkedHashMap<String, String>();
        for (Object data : functlist) {
            Map<?, ?> map = (Map<?, ?>) data;
            String title = map.get("GROUPNAME").toString();
            titleMap.put(title, title);
        }
        
        Map<String, String> iconMap = new LinkedHashMap<String, String>();
		for (int i = 0; i < functlist.size(); i++) {
			iconMap.put(functlist.get(i).get("GROUPNAME"), functlist.get(i).get("ICONTYPE"));
		}
		
        List<Menu> menuList = new ArrayList<Menu>();
        for (String title : titleMap.keySet()) {
        	String iconString = "";
            Map<String, String> subMap = new LinkedHashMap<String, String>();
            for (int i = 0; i < functlist.size(); i++) {
                Map<?, ?> map = (Map<?, ?>) functlist.get(i);
                if (map.get("GROUPNAME").equals(title)) {
                    String key = map.get("FN_DESC").toString();
                    String val = map.get("FN_PATH").toString();
                    subMap.put(key, val);
                    iconString = iconMap.get(title);
                }
            }
            menuList.add(new Menu(title, subMap, iconString));
        }
        return menuList;
    }

}
