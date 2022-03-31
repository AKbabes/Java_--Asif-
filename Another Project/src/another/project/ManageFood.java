package another.project;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageFood{
	ArrayList<AddFoodForMenu> foodlist = new ArrayList<>();
	ArrayList<CustomerOrder> order = new ArrayList<>();
	int i;

	public int selectfood;


	Scanner input=new Scanner(System.in);
	
	public void add() {
		System.out.println();
		for ( i = 0; i < 35; i++)
		{
			System.out.print("=");
		}

		System.out.print(" ADD FOOD ");

		for ( i = 0; i < 35; i++)
		{
			System.out.print("=");
		}
		System.out.println("\n");
		System.out.print("Enter The Number of Food to Add in FoodMenu: ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			AddFoodForMenu food = new AddFoodForMenu();
			food. CreateMenu();
			foodlist.add(food); 
		}
	}

	public  void Print() {
		for ( i = 0; i < 81; i++)
		{
			System.out.print("-");
		}

		System.out.println();
		for ( i = 0; i < 35; i++)
		{
			System.out.print(" ");
		}
		System.out.print(" FOOD MENU");

		for ( i = 0; i < 35; i++)
		{
			System.out.print(" ");
		}
		System.out.println();

		System.out.print("\t\t\t\t\t\t\tSl");
		System.out.print("\t\t");
		System.out.print("Name");
		System.out.print("\t\t");
		System.out.print("Price");
		System.out.println();
		for (int i = 0; i < foodlist.size(); i++) {
			System.out.print("\t\t\t\t\t\t\t");
			System.out.print(foodlist.get(i).getSerial());
			System.out.print("\t\t");
			System.out.print(foodlist.get(i).getName());
			System.out.print("\t\t");
			System.out.print(foodlist.get(i).getPrice());
			System.out.println();
		}
		for ( i = 0; i < 81; i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}


	public void EditFood() {
		for ( i = 0; i < 35; i++)
		{
			System.out.print("=");
		}

		System.out.print(" EDIT FOOD ");

		for ( i = 0; i < 35; i++)
		{
			System.out.print("=");
		}
		String foodname;
		int flag = 0;
		Scanner input=new Scanner(System.in);
		System.out.println();
		System.out.print("Enter The Name of FoodItem to Edit: ");
		foodname = input.nextLine();

		for (int i = 0; i < foodlist.size(); i++) {
			if (foodlist.get(i).getName().equals(foodname)) {
				flag++;
				foodlist.get(i).setName(EditName());
				foodlist.get(i).setPrice(EditPrice());
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Not Available At Food Menu: " + foodname);
			System.out.println("Please Enter Correct Food Name");
		}
	}

	public String EditName() {
		System.out.print("Add New Food Name: ");
		input.nextLine();
		String newfood = input.nextLine();
		return newfood;
	}
	public float EditPrice() {
		System.out.print("Enter New Price: ");
		float newprice = input.nextFloat();
		return newprice;
	}


	public void DeleteFood() {
		System.out.println();
		for ( i = 0; i < 34; i++)
		{
			System.out.print("=");
		}

		System.out.print(" DELETE FOOD ");

		for ( i = 0; i < 34; i++)
		{
			System.out.print("=");
		}
		String deletefood;
		int flag = 0;
		System.out.println();
		input.nextLine();
		System.out.print("Enter Name of FoodItem to Delete: ");
		deletefood = input.nextLine();
		for (int i = 0; i < foodlist.size(); i++) {
			if (foodlist.get(i).getName().equals(deletefood)) {
				flag++;
				foodlist.remove(i);
				System.out.println("Remove Food Item Successfully...");
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Not Available At Food Menu: " + deletefood);
			System.out.println("Please Enter Correct Food Name");
		}
	}

	public void Price() {
		float foodprice=0;
		float Totalpayment=0;
		int n, quantity;

		CustomerOrder customer = new CustomerOrder();

		customer.input();
		order.add(customer);

		System.out.print("How Many Items You Have to Order: ");
		n= input.nextInt();
		for (int i = 0; i < n; i++) {
		System.out.print("Enter Food Serial No that You Want to Order: ");
		selectfood = input.nextInt();

		System.out.print("Enter The Quantity: ");
		quantity=input.nextInt();
		AddFoodForMenu food = foodlist.get(selectfood-1);
		customer.setEatList(food);
		foodprice = food.price * quantity;

		Totalpayment =Totalpayment + foodprice;
		customer.setTotalpayment(Totalpayment);
		System.out.println("Order Finish Successfully...");
		System.out.println("Total Payment is: "+ Totalpayment);
		}
	}


	public void PrintOrder() {
		System.out.println();
		for ( i = 0; i < 30; i++)
		{
			System.out.print("=");
		}

		System.out.print(" ORDER INFORMATION ");

		for ( i = 0; i < 30; i++)
		{
			System.out.print("=");
		}
		System.out.println();
		for (int i = 0; i < order.size(); i++) {
			order.get(i).print();
		}
	}

	public void Search() {
		System.out.println();
		for ( i = 0; i < 28; i++)
		{
			System.out.print("=");
		}

		System.out.print(" TOTAL BILL FOR TABLE ");

		for ( i = 0; i < 28; i++)
		{
			System.out.print("=");
		}
		System.out.println();
		Scanner input=new Scanner(System.in);
		String tablecode;
		int i, flag=0;
		System.out.print("Enter Table Code(Ex: Table-1) to Know Total Bill: ");
		tablecode = input.nextLine();

		for ( i = 0; i < order.size(); i++) {
			if (order.get(i).getTablecode().equalsIgnoreCase(tablecode)) {
				order.get(i).print();
				flag++;
			}
		}
		if (flag==0) {
			System.out.println("No Table Availabe."+tablecode);
		}
	}


}

