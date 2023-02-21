package com.dn.Maps;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args)
	{
		Map m=new HashMap();
		System.out.println(m.put("a", 20));
		System.out.println(m.put("b", 30));
		System.out.println(m.get("a"));
		System.out.println(m.containsKey("a"));
		System.out.println(m.isEmpty());
	}

}
