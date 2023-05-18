package app;

import java.util.*;

public class Main {
	
	static ArrayList<String> al = new ArrayList<>();
	static ArrayList<String> al2 = new ArrayList<>();
	static ArrayList<String> al3 = new ArrayList<>();
	static int count;
	static int total ;
	static Scanner in = new Scanner(System.in);
static void addItems(int id) {
		
		String [] pro = {"Fruits","Vegetables","Cool Drinks","Dairy Product","Chips"};
		al = new ArrayList<>();
		al3 = new ArrayList<>();
		count = 0;
		total = 0;
		boolean is = true;
		while(is) {
		for(int i=0;i<pro.length;i++) {
			System.out.println(1+i+" : "+pro[i]);
		}
		
		System.out.println("enter 6 to exit");
		System.out.println("Enter your choice");
		int num = in.nextInt();
		if(num<=5) {
		for(int i=0;i<pro.length;) {
			if(num-1==0) {
				boolean ok = true;
				fruits(ok);
				break;
			}
			else if(num-1==1) {
				boolean fi = true;
				vegies(fi);
				break;
			}
			else if(num-1==2) {
				boolean li = true;
				coolDrinks(li);
				break;
			}
			else if(num-1==3) {
				boolean ki = true;
				dairy(ki);
				break;
			}
			else {
				boolean ji = true;
				chips(ji);
				break;
			}
		   }
		 }
		else {
			is=false;
		 }
		}
		
	
		System.out.println("total no of items is "+ count);
		System.out.println("Total amount "+total);
		GroceryList gl = new GroceryList();
		gl.addMore(id,count,total, al,al3);
		
	}
	static void addItems(UserDetails ud) {
		
		String [] pro = {"Fruits","Vegetables","Cool Drinks","Dairy Product","Chips"};
		
		boolean is = true;
		al = new ArrayList<>();
		al3 = new ArrayList<>();
		count = 0;
		total = 0;
		while(is) {
		for(int i=0;i<pro.length;i++) {
			System.out.println(1+i+" : "+pro[i]);
		}
		System.out.println();
		System.out.println("enter 6 to exit \n");
		System.out.println("Enter your choice");
		int num = in.nextInt();
		
		if(num<=5) {
		for(int i=0;i<pro.length;) {
			if(num-1==0) {
				boolean ok = true;
				fruits(ok);
				break;
			}
			else if(num-1==1) {
				boolean fi = true;
				vegies(fi);
				break;
			}
			else if(num-1==2) {
				boolean li = true;
				coolDrinks(li);
				break;
			}
			else if(num-1==3) {
				boolean ki = true;
				dairy(ki);
				break;
			}
			else {
				boolean ji = true;
				chips(ji);
				break;
			}
		   }
		 }
		else {
			is=false;
		 }
		}
		System.out.println();
		System.out.println("total no of items is "+ count);
		System.out.println("Total amount "+total);
		GroceryList gl = new GroceryList();
		gl.addUser(ud, count,total, al,al3);
		
		
	}
	static void fruits(boolean is) {
		String [] a = {"Apple - Rs:50","Orange - Rs:45","Banana - Rs:35","Mango - Rs:30","Grapes - Rs:40","jack Fruit - Rs:35","Goa - Rs:30"};
		while(is) {
			for(int i=0;i<a.length;i++) {
				System.out.println(1+i+" : "+a[i]);
			}
			System.out.println("enter 8 to exit");
			System.out.println("Enter your choice");
			int num = in.nextInt();
			if(num<=7) {
				for(int i=0;i<a.length;i++) {
					if(num-1==i) {
						total+=Integer.parseInt(a[i].substring(a[i].length()-2,a[i].length()));
						count++;
						al.add(a[i].substring(0,a[i].length()-8));
						al3.add(a[i]);
					}
				}
		}
			else {
				is = false;
			}
		}
		if(!is) {
			return;
		}
	}
	static void vegies(boolean is) {
		String [] b = {"tomato - Rs:30","potato - Rs:35","brinjal - Rs:25","carrot - Rs:20","beetroot - Rs:25","cabbage - Rs:15","drumstick - Rs:30"};
		
		while(is) {
			for(int i=0;i<b.length;i++) {
				System.out.println(1+i+" : "+b[i]);
			}
			System.out.println();
			System.out.println("enter 8 to exit \n");
			System.out.println("Enter your choice");
			int num = in.nextInt();
			if(num<=7) {
				for(int i=0;i<b.length;i++) {
					if(num-1==i) {
						total+=Integer.parseInt(b[i].substring(b[i].length()-2,b[i].length()));
						count++;
						al.add(b[i].substring(0,b[i].length()-8));
						al3.add(b[i]);
					}
				}
			
		}
			else 
				is = false;
		}
		if(!is) {
			return;
		}
	}
	static void coolDrinks(boolean is) {
		String [] c = {"sprit - Rs:35","coca cola - Rs:30","pepsi - Rs:30","maaza - Rs:40","slice - Rs:40","mirinda - Rs:35","7up - Rs:30"};
		while(is) {
			for(int i=0;i<c.length;i++) {
				System.out.println(1+i+" : "+c[i]);
			}
			System.out.println();
			System.out.println("enter 8 to exit \n");
			System.out.println("Enter your choice");
			int num = in.nextInt();
			if(num<=7) {
				for(int i=0;i<c.length;i++) {
					if(num-1==i) {
						total+=Integer.parseInt(c[i].substring(c[i].length()-2,c[i].length()));
						count++;
						al.add(c[i].substring(0,c[i].length()-8));
						al3.add(c[i]);
					}
				}
			
		}
			else 
				is = false;
		}
		if(!is) {
			return;
		}
	}
	static void dairy(boolean is) {
		String [] d = {"milk - Rs:25","curd - Rs:20","ghee - Rs:35","ice cream - Rs:30","chocolate - Rs:35","sweet - Rs:45","milk shake - Rs:50"};
		while(is) {
			for(int i=0;i<d.length;i++) {
				System.out.println(1+i+" : "+d[i]);
			}
			System.out.println();
			System.out.println("enter 8 to exit \n");
			System.out.println("Enter your choice");
			int num = in.nextInt();
			if(num<=7) {
				for(int i=0;i<d.length;i++) {
					if(num-1==i) {
						total+=Integer.parseInt(d[i].substring(d[i].length()-2,d[i].length()));
						count++;
						al.add(d[i].substring(0,d[i].length()-8));
						al3.add(d[i]);
					}
				}
			
		}
			else 
				is = false;
		}
		if(!is) {
			return;
		}
	}
	static void chips(boolean is) {
		String [] e = {"lays - Rs:20","pringles - Rs:100","bingo - Rs:25","kurkure - Rs:10","mixers - Rs:35","doritos - Rs:40","onion rings-20"};
		while(is) {
			for(int i=0;i<e.length;i++) {
				System.out.println(1+i+" : "+e[i]);
			}
			System.out.println();
			System.out.println("enter 8 to exit \n");
			System.out.println("Enter your choice");
			int num = in.nextInt();
			if(num<=7) {
				for(int i=0;i<e.length;i++) {
					if(num-1==i) {
						total+=Integer.parseInt(e[i].substring(e[i].length()-2,e[i].length()));
						count++;
						al.add(e[i].substring(0,e[i].length()-8));
						al3.add(e[i]);
					}
				}
			
		}
			else 
				is = false;
		}
		if(!is) {
			return;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean is = true;
		System.out.println();
		while(is) {
			System.out.println();
			System.out.println("Enter your choice \n");
			System.out.println("1.Add items");
			System.out.println("2.View items");
			System.out.println("3.Remove Items");
			System.out.println("4.Place order");
			System.out.println("5.Order History");
			System.out.println("6.Exit");
			int num = in.nextInt();
			GroceryList gl = new GroceryList();
			switch(num) {
			case 1:
			{
				System.out.println("Add items \n");
				System.out.println("1.New user");
				System.out.println("2.Exist user");
				int user = in.nextInt();
				if(user==1) {
				System.out.println("user details  new ID// Name  // Mobile No // Address");
				int id = in.nextInt();
				in.nextLine();
				String name = in.nextLine();
				long mobileNo = in.nextLong();
				in.nextLine();
				String add = in.nextLine();
				UserDetails us = new UserDetails(name,mobileNo,add,id);
				addItems(us);
				}
				else {
					System.out.println("Enter your ID");
					int id = in.nextInt();
					addItems(id);
				}
			}
			break;
			case 2:
			{
				System.out.println("view Items \n");
				gl.display();
			}
			break;
			case 3:
			{
				gl.remove();
			}
			break;
			case 4:
			{
				System.out.println("place order \n");
				gl.placeOrder();
			}
			break;
			case 5:{
				System.out.println("History \n");
				System.out.println("Enter ID");
				int no = in.nextInt();
				gl.history(no);
			}
			break;
			case 6:
				is=false;
				System.out.println(" Thank You :) ");
			default:
				break;
			}
		}
		in.close();
	}

}
