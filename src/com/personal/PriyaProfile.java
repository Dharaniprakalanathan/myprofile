package com.personal;

public class PriyaProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+"Anikasri");
		System.out.println(ProfileConstants.LAST_NAME+"S");
		System.out.println("Age : 1");
		
	}

	@Override
	public void myHobbies() {
		System.out.println("My Hobby is typing coding");
		
	}
	

}
