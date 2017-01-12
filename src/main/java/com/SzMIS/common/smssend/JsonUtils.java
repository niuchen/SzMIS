package com.SzMIS.common.smssend;

 

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JsonUtils {

	private static Gson gson = null;

	/**
	 * 通过单例获取gson
	 * 
	 * @return
	 */
	public static Gson getGson() {
		if (gson == null) {
			return new Gson();
		}
		return gson;
	}

	/**
	 * 把java对象转换为JSON
	 * 
	 * @param obj
	 *            要转换的对象
	 * @return
	 * @throws IOException
	 */
	public static String toJson(Object obj) {
		return getGson().toJson(obj);
	}
	
	/**
	 * 将json字符串转换为hashmap
	 * 
	 * @param jsonstr
	 * @return
	 */
	public static HashMap<String, Object> parseHashMap(String jsonstr) {
		GsonBuilder gb = new GsonBuilder();
		Gson g = gb.create();
		HashMap<String, Object> map = g.fromJson(jsonstr,
													new TypeToken<Map<String, String>>() {}.getType());
		return map;
	}

}
