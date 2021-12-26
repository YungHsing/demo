
package com.example.demo.vo;

import java.util.Map;

public class Menu {

	public Menu() {
		
	}
	
	public Menu(String title, Map<String, String> dataMap, String icon) {
		this.title = title;
		this.dataMap = dataMap;
		this.icon = icon;
	}
	
	private String title = "";

	private Map<String, String> dataMap = null;
	
	private String icon = "";

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Map<String, String> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, String> dataMap) {
		this.dataMap = dataMap;
	}
	
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
}
