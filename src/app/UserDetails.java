package app;

import java.util.ArrayList;

public class UserDetails {
	static int id = 1;
	String name;
	long mobileNo;
	int total;
	final int userId;
	ArrayList<String> list ;
	String address;
	int amount;
	public UserDetails(String name, long mobileNo,String address) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.address=address;
		this.userId = id++;
		total = -1;
		amount = -1;
		list = new ArrayList<>();
		address = " ";
	}
	UserDetails(){
		this.userId = 0;
		
	}
}
