package item;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemMain {

	public static void main(String[] args) throws IOException {
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
			itemDAO.save(item);
		}
		
		

		
		System.out.println("Current Shopping Cart");
		double total = 0;
		
		ArrayList<Item> readingItems = itemDAO.findALL();
		
		for(Item item : readingItems) {
			item.printItemInfo();
			total += item.getTotal();
		}
		System.out.println("Total Amount in Cart: " + "$" +total);
		
		System.out.print("Enter the product name to check sells:");
		String productName = sc.next();
		for(Item item : readingItems) {
			if(item.getName().equals(productName)) {
				System.out.println("Item sells: ");
				item.printItemInfo();
			}
		}
		
		
		sc.close();
	}
	
	
	
	
}
