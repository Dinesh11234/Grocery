package app;

import java.util.ArrayList;

public class UserDetails {
	String name;
	long mobileNo;
	int total;
	final int userId;
	ArrayList<String> list ;
	ArrayList<String> list2 ;
	String address;
	int amount;
	public UserDetails(String name, long mobileNo,String address,int userId) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.address=address;
		this.userId = userId;
		total = -1;
		amount = -1;
		list = new ArrayList<>();
		list2 = new ArrayList<>();
		address = " ";
	}
	UserDetails(){
		this.userId = 0;
		
	}
}
