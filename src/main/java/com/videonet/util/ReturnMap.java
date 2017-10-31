package com.videonet.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年10月27日 下午9:59:27
 */
public class ReturnMap extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public ReturnMap() {
		put("code", 200);
	}
	
	public static ReturnMap error() {
		return error(500, "未知异常，请联系管理员");
	}
	
	public static ReturnMap error(String msg) {
		return error(500, msg);
	}
	
	public static ReturnMap error(int code, String msg) {
		ReturnMap r = new ReturnMap();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static ReturnMap ok(String msg) {
		ReturnMap r = new ReturnMap();
		r.put("msg", msg);
		return r;
	}
	
	public static ReturnMap ok(Map<String, Object> map) {
		ReturnMap r = new ReturnMap();
		r.putAll(map);
		return r;
	}
	
	public static ReturnMap ok() {
		return new ReturnMap();
	}

	public ReturnMap put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
