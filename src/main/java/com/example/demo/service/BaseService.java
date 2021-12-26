package com.example.demo.service;

import com.example.demo.dao.cust.CustFunction;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import oracle.sql.ROWID;
import oracle.sql.TIMESTAMP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class BaseService {

	@Resource
    protected CustFunction custFunction;
	
	protected Logger logger = LoggerFactory.getLogger(getClass());

	protected SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyy/MM/dd");

	private SimpleDateFormat yyyyMMddHHmmssSSS = new SimpleDateFormat("yyyyMMddHHmmssSSS");

	/**
	 * 獲取打api的ip位址
	 *
	 * @return
	 */
	public static String getRequestIp() {
		HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes()))
				.getRequest();
		return request.getRemoteAddr();
	}

	public String getGuId() {
		String timeStr = yyyyMMddHHmmssSSS.format(new Date());
		String uuidStr = getUUIDStr(12);
		return timeStr + "DEMO" + uuidStr;
	}

	public static Date addMinute(Date d, int minutes) {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.MINUTE, minutes);
		return c.getTime();
	}

	protected static Date addDay(Date d, int days) {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DATE, days);
		return c.getTime();
	}

	protected static Date addSeconds(Date d, int seconds) {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.SECOND, seconds);
		return c.getTime();
	}

//	public LiMappingCode getLiMappingCode(String codeType, String codeNo) {
//		LiMappingCodeKey key = new LiMappingCodeKey();
//		key.setCodeType(codeType);
//		key.setCodeNo(codeNo);
//		return liMappingCodeMapper.selectByPrimaryKey(key);
//	}

	/**
	 * 獲取LiMappingCodeList
	 *
	 * @param codeType
	 * @param codeTag
	 * @param codeNoArr
	 * @return
	 */
//	public List<LiMappingCode> getLiMappingCodeList(String codeType, String codeTag, String[] codeNoArr) {
//		LiMappingCodeExample liMappingCodeExample = new LiMappingCodeExample();
//		LiMappingCodeExample.Criteria criteria = liMappingCodeExample.createCriteria().andCodeTypeEqualTo(codeType)
//				.andCodeTagEqualTo(codeTag);
//		if (codeNoArr != null && codeNoArr.length > 0) {
//			List<String> codeNoList = Arrays.asList(codeNoArr);
//			criteria.andCodeNoIn(codeNoList);
//		}
//
//		return liMappingCodeMapper.selectByExample(liMappingCodeExample);
//	}


	/**
	 * 將json格式字串轉為類
	 *
	 * @param json
	 * @param cls
	 * @param <T>
	 * @return
	 */
	public static <T> T parseJson2(String json, Class<T> cls) {
		return new Gson().fromJson(json, cls);
	}

	/**
	 * 物件轉json(值為空一樣做轉換並序列化)
	 *
	 * @param object
	 * @return
	 */
	protected static String toJsonWithNull(Object object) {
		Gson gson = new GsonBuilder().serializeNulls().create();
		return gson.toJson(object);
	}

	/**
	 * 物件轉json(不包含空值)
	 *
	 * @param src
	 * @return
	 */
	protected static String toJson(Object src) {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();
		Gson gson = gsonBuilder.create();
		return gson.toJson(src);
	}

	/**
	 * 比較兩個json的不一致部分, 傳入的參數一定要是json格式(可用物件轉json方法)
	 *
	 * @param oldJson
	 * @param newJson
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> compareDiffBy2Json(String oldJson, String newJson) {
		Map<String, Object> oldMap = parseJson2(oldJson, Map.class);
		Map<String, Object> newMap = parseJson2(newJson, Map.class);

		Map<String, Object> resultMap = new LinkedHashMap<>();
		Map<String, Object> oldMap2 = new LinkedHashMap<>();
		Map<String, Object> newMap2 = new LinkedHashMap<>();

		for (Map.Entry<String, Object> entry : oldMap.entrySet()) {
			String key = entry.getKey();
			if (oldMap.get(key) == null && newMap.get(key) == null) {
				continue;
			} else {
				if (oldMap.get(key) != null && newMap.get(key) != null) {
					if (oldMap.get(key).equals(newMap.get(key))) {
						continue;
					}
				}
			}
			oldMap2.put(entry.getKey(), entry.getValue());
			newMap2.put(entry.getKey(), newMap.get(entry.getKey()));
		}

		resultMap.put("old", oldMap2);
		resultMap.put("new", newMap2);
		return resultMap;
	}

	protected String getUUIDStr(int size) {
		UUID uuid = UUID.randomUUID();
		String uuidAsString = uuid.toString().toUpperCase().replace("-", "");
		return uuidAsString.substring(0, size);
	}

	/**
	 * 獲取該日的zeroTime->20210928 00:00:00
	 *
	 * @return
	 */
	public static Date getDayZeroTime(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	protected void transTypeByOracleType(List<Map<String, Object>> list) {
		for (Map<String, Object> map : list) {
			for (String key : map.keySet()) {
				Object o = map.get(key);
				if (o instanceof TIMESTAMP) {
					map.put(key, o.toString());
				} else if (o instanceof ROWID) {
					map.put(key, o.toString());
				}
			}
		}
	}

}
