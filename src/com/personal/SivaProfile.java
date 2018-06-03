package com.personal;

public class SivaProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+"Dharani");
		System.out.println(ProfileConstants.LAST_NAME+ "P");
		System.out.println("Age : 20");
	}

	@Override
	public void myHobbies() {
		System.out.println("My Hobby is Reading Books");
		
		
	}

}
