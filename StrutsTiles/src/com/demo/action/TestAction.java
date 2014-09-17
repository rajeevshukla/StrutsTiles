package com.demo.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@Namespace("/")
@ResultPath("/")
public class TestAction {

	private List<AucPojo> aucList;
	private PersonalDataPojo dataPojo;
	private List<String> nameList;
	private Map<Integer, String> idNameMap;
	
	
	@Action(value="test",results={@Result(name="success",location="welcome.jsp")})
	public String execute(){
	 
		idNameMap=new HashMap<Integer, String>();
        idNameMap.put(100, "Map1");
        idNameMap.put(101, "Map2");
        idNameMap.put(103, "Map3");
        idNameMap.put(102, "Map4");
        idNameMap.put(104, "Map5");
        idNameMap.put(105, "Map6");
        
		ArrayList<String> cityList=new ArrayList<String>();
		cityList.add("Delhi");
		cityList.add("Basti");
		aucList=new ArrayList<AucPojo>();

		AucPojo aucPojo=new AucPojo();
		aucPojo.setAucValue(12);
		aucPojo.setCities(cityList);

		AucPojo aucPojo1=new AucPojo();
		aucPojo1.setAucValue(12);
		aucPojo1.setCities(cityList);
		aucList.add(aucPojo1);
		aucList.add(aucPojo);
		System.out.println("auc list added. ");
		nameList=new ArrayList<String>();

		nameList.add("rajeev");
		nameList.add("rajeev");
		nameList.add("rajeev");
		nameList.add("rajeev");
		nameList.add("rajeev");

		dataPojo=new PersonalDataPojo();
		dataPojo.setName("Rajeev");
		dataPojo.setAddress("Delhi");
		dataPojo.setAge(12);

		System.out.println("data pojo set.");


		return com.opensymphony.xwork2.Action.SUCCESS;
	}

	public List<AucPojo> getAucList() {
		return aucList;
	}

	public PersonalDataPojo getDataPojo() {
		return dataPojo;
	}

	public void setAucList(List<AucPojo> aucList) {
		this.aucList = aucList;
	}

	public void setDataPojo(PersonalDataPojo dataPojo) {
		this.dataPojo = dataPojo;
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public Map<Integer, String> getIdNameMap() {
		return idNameMap;
	}

	public void setIdNameMap(Map<Integer, String> idNameMap) {
		this.idNameMap = idNameMap;
	}

	





}
