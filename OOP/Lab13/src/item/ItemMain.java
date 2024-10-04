package item;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemMain {

	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("Enter the name of the item: ");
			String currentItemName = sc.next();
			System.out.print("Enter the unit price: ");
			Double currentPrice = sc.nextDouble();
			System.out.print("Enter the quantity: ");
			int currentQuantity = sc.nextInt();
			
			items.add(new Item(currentItemName,currentPrice,currentQuantity));
			
			System.out.print("Continue shopping (y/n) ");
			String input = sc.next();
			if(input.equals("n")) {
				break;
			}else if(input.equals("y")) continue;
			
		}


		ItemDAO itemDAO = new ItemDAO();
		for(Item item : items) {
			itemDAO.save;
		}
		




		
		System.out.println("Final Shopping Cart totals");
		double total = 0;
		for(Item item : items) {
			item.printItemInfo();
			total += item.getTotal();
		}
		System.out.println("Total Amount in Cart: " + "$" +total);
		
	}

}
