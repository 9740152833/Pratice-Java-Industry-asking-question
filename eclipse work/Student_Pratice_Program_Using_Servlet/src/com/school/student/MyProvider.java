package com.school.student;

public interface MyProvider {
	public int insertRegisterInformation(int id, String name, String pass, String mobi);

	public Student getCustomer( int uid,String username, String pass);
	
	public int insertFacebookRegisterInformation(String userid);

}
