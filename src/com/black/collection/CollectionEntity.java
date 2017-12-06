package com.black.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionEntity {
	private List sectionList;
	private Set countrySet;
	private Properties schoolPro;
	private Map<String, String> bookMap;
	public List getSectionList() {
		return sectionList;
	}
	public void setSectionList(List sectionList) {
		this.sectionList = sectionList;
	}
	public Set getCountrySet() {
		return countrySet;
	}
	public void setCountrySet(Set countrySet) {
		this.countrySet = countrySet;
	}
	public Properties getSchoolPro() {
		return schoolPro;
	}
	public void setSchoolPro(Properties schoolPro) {
		this.schoolPro = schoolPro;
	}
	public Map<String, String> getBookMap() {
		return bookMap;
	}
	public void setBookMap(Map<String, String> bookMap) {
		this.bookMap = bookMap;
	}
	@Override
	public String toString() {
		return "CollectionEntity [sectionList=" + sectionList + ", countrySet=" + countrySet + ", schoolPro="
				+ schoolPro + ", bookMap=" + bookMap + "]";
	}
	
	
	

}
