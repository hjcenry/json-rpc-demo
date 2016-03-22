package com.hjc.demo;

public class DemoServiceImply implements DemoService {

	public DemoBean getDemo(String code, String msg) {
		DemoBean bean1 = new DemoBean();
		bean1.setCode(Integer.parseInt(code));
		bean1.setMsg(msg);
		return bean1;
	}

	public Integer getInt(Integer code) {
		return code;
	}

	public String getString(String msg) {
		return msg;
	}

	public void doSomething() {
		System.out.println("do something");
	}

}
