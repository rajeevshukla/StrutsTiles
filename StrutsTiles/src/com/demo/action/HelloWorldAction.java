package com.demo.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@Namespace("/")
@ResultPath("/")
//@ParentPackage("com")
@Result(name="success",type="tiles", location="student.home")
public class HelloWorldAction {
  
	public String execute(){
		 return "success";
	 }
}
