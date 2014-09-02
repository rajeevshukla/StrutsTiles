package com.demo.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@Namespace("/")
@ResultPath("/")
@Result(name="success",location="commonLayout.jsp")
public class HelloWorldAction {

	public String execute(){
		
		 return "success";
	 }
}
