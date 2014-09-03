package com.demo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

@Namespace("/")
@ParentPackage("tiles-default")
public class RegisterStudentAction {

	
	@Action(value="Register" ,results={@Result(name="success",type="tiles",location="student.register")})
	public String execute(){
		
		
		return "success";
	}
}
