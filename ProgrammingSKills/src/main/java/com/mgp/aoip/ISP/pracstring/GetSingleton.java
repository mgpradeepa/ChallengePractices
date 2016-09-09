package com.mgp.aoip.ISP.pracstring;

public class GetSingleton {
public static void main(String[] args) {
	String inp = "hello world";
	Singleton s = Singleton.getSingleInstance();
	s.str = inp;
	System.out.println(s.str);
}
	
}

class Singleton {
	public static  Singleton INST = null;
	private Singleton(){}
	
	public String str;
	
	public static final Singleton getSingleInstance(){
		if(INST == null){
			INST  = new Singleton();
		}
		return INST;
		
	}
}