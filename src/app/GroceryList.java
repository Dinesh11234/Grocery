package app;

import java.util.*;

public class GroceryList {
	static Scanner in = new Scanner(System.in);
	static Map<Integer, UserDetails> map = new HashMap<>();
	void addUser(UserDetails ud,int tot,int amount,ArrayList<String> al,ArrayList<String> al2) {
		ud.total = tot;
		ud.list = al;
		ud.list2 = al2;
		ud.amount = amount;
		map.put(ud.userId, ud);
	}
	void display() {
		System.out.println("Enter your ID");
		int id = in.nextInt();
		for(Map.Entry<Integer, UserDetails> entry:map.entrySet()) {
			if(entry.getKey()==id) {
			System.out.println("No of Items selected "+entry.getValue().total+"\n");
			System.out.println("Items in your List ");
			for(int i=0;i<entry.getValue().list.size();i++) {
				System.out.println(1+i+". "+entry.getValue().list.get(i));
			}
			System.out.println();
		}
		}
	}
	void addMore(int id,int items, int amount, ArrayList<String> al,ArrayList<String> al2) {
		System.out.println();
		for(Map.Entry<Integer, UserDetails> entry:map.entrySet()) {
			if(entry.getKey()==id) {
				entry.getValue().amount+=amount;
				entry.getValue().total+=items;
				entry.getValue().list.addAll(al);
				entry.getValue().list2.addAll(al2);
				System.out.println("Items Added to your cart");
			}
		}
	
	}
	void remove() {
		System.out.println("Enter your ID");
		int id = in.nextInt();
		for(Map.Entry<Integer, UserDetails> entry:map.entrySet()) {
			if(entry.getKey()==id) {
				entry.getValue().total--;
				System.out.println("Items in your List ");
				for(int i=0;i<entry.getValue().list.size();i++) {
					System.out.println(1+i+". "+entry.getValue().list.get(i));
				}
				System.out.println("enter the product no");
				int no = in.nextInt();
				if(no<=entry.getValue().list.size()) {
					entry.getValue().list.remove(no-1);
				String amo = entry.getValue().list2.get(no-1);
				entry.getValue().amount-=Integer.parseInt(amo.substring(amo.length()-2, amo.length()));
				System.out.println("Items removed from your cart");
				}
				}
			}
		
		}
	void placeOrder() {
		System.out.println("Enter your ID");
		int id = in.nextInt();
		for(Map.Entry<Integer, UserDetails> entry:map.entrySet()) {
			if(entry.getKey()==id) {
				System.out.println();
		System.out.println("User ID "+entry.getValue().userId);
		System.out.println("Name "+entry.getValue().name);
		System.out.println("Mobile "+entry.getValue().mobileNo);
		System.out.println("Address "+entry.getValue().address);
		System.out.println("Total Price Amount "+entry.getValue().amount);
		int amo = entry.getValue().amount;
		if(amo >=500) {
		System.out.println(entry.getValue().amount-100+" : Actual price");
		}
		payment(amo,id);
		
		}
		}
	}
	static void payment(int amo,int id) {
		System.out.println();
		System.out.println("Payment Choices \n");
		System.out.println("1 : Credit Card / Debit Card");
		System.out.println("2 : Online Payments");
		System.out.println("3 : Cash On Delivery");
		int choice = in.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter Amount to pay");
			int a = in.nextInt();
			if(a==amo) {
				System.out.println("Payment Sucessful \n");
				System.out.println("Your Order will be delivered soon");
				for(Map.Entry<Integer, UserDetails> entry:map.entrySet()) {
					if(entry.getKey()==id) {
						entry.getValue().list.clear();
						entry.getValue().list2.clear();
						entry.getValue().amount = 0;
						entry.getValue().total = 0;
					}
				}
			}
			else {
				System.out.println("Insufficient fund ");
			}
			break;
		case 2:
			System.out.println("Enter Amount to pay");
			int b = in.nextInt();
			if(b==amo) {
				System.out.println("Payment Sucessful \n");
				System.out.println("Your Order will be delivered soon");
				for(Map.Entry<Integer, UserDetails> entry:map.entrySet()) {
					if(entry.getKey()==id) {
						entry.getValue().list.clear();
						entry.getValue().list2.clear();
						entry.getValue().amount = 0;
						entry.getValue().total = 0;
					}
				}
			}
			else {
				System.out.println("Insufficient fund ");
			}
			break;
		case 3:
			System.out.println("Enter Amount to pay");
			int c = in.nextInt();
			if(c==amo) {
				System.out.println("Payment Sucessful \n");
				System.out.println("Your Order will be delivered soon");
				for(Map.Entry<Integer, UserDetails> entry:map.entrySet()) {
					if(entry.getKey()==id) {
						entry.getValue().list.clear();
						entry.getValue().list2.clear();
						entry.getValue().amount = 0;
						entry.getValue().total = 0;
					}
				}
			}
			else {
				System.out.println("Insufficient fund ");
			}
			break;
		default:
			System.out.println("Enter the crt choice");
			break;
		}
		
		
	}
	void history(int id) {
		for(Map.Entry<Integer, UserDetails> entry:map.entrySet()) {
			if(entry.getKey()==id) {
				System.out.println();
				System.out.println("User ID "+entry.getValue().userId);
				System.out.println("Name "+entry.getValue().name);
				System.out.println("Mobile "+entry.getValue().mobileNo);
				System.out.println("Address "+entry.getValue().address);
				System.out.println("No of Items selected "+entry.getValue().total);
				System.out.print("Total Price Amount ");
				if(entry.getValue().amount>=500) {
					System.out.println(entry.getValue().amount-100);
				}
				else {
					System.out.println(entry.getValue().amount);
				}
				System.out.println();
				System.out.println("Items in your List ");
				System.out.println();
				for(int i=0;i<entry.getValue().list.size();i++) {
					System.out.println(1+i+". "+entry.getValue().list.get(i));
				}
				}
			
			}
		}
	}
