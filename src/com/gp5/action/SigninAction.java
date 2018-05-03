package com.gp5.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class SigninAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String gender;
	private String[] courses;
	private List<String> books;

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String excute() {
		String[] c = new String[]{"JAVA", "PHP", "Node"};
		setCourses(c);
		
		List<String> list = new ArrayList<String>();
		
		list.add("JS");
		list.add("CSS");
		list.add("HTML");
		
		setBooks(list);
		
		return "success";
	}
}
