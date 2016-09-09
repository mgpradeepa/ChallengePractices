package com.mgp.aoip.ISP.pracstring;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class GetThroughReflections {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> student = Class.forName("com.mgp.aoip.ISP.pracstring.Student");// Student.class;
		Method[] methods = student.getDeclaredMethods();

		ArrayList<String> methodList = new ArrayList<>();
		for (Method m1 : methods) {
			methodList.add(m1.getName());
		}
		Collections.sort(methodList);
		for (String name : methodList) {
			System.out.println(name);
		}
	}

}

class Student {
	private String name;
	private String id;
	private String email;

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
