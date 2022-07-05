package com.bilgeadam_05thJuly2022.Array_List_Example3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
	String product[] = { "Chips", "Cola", "Sugar", "Oil", "Flour", "Bread", "Tea", "Egg", "Yogurt", "Milk" };
	List<String> cartList = new ArrayList<String>();

	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.menu();
	}

	public void menu() {
		int input = 0;
		do {
			System.out.println("-----MENU-----");
			System.out.println("1-)Show Product List.");
			System.out.println("2-)Add Product.");
			System.out.println("3-)Show Cart.");
			System.out.println("0-) Exit");
			System.out.println("---------------");
			Scanner scanner = new Scanner(System.in);
			System.out.print("Please select an option from the menu: ");
			input = scanner.nextInt();
			scanner.nextLine();
			switch (input) {
			case 1:
				showProducts(product);
				break;
			case 2:
				System.out.print("Please select the number of the Product you want to add: ");
				int index = scanner.nextInt();
				addProduct(index);
				break;
			case 3:
				showCart();

			case 0:
				break;
			default:
				System.out.println("Please enter a valid number.");
			}
			scanner.close();
		} while (input != 0);

	}

	private void showProducts(String[] Products) {
		for (int i = 0; i < Products.length; i++) {
			System.out.println(i + 1 + "-) " + Products[i]);
		}
	}

	private List<String> addProduct(int index) {
		cartList.add(product[index - 1]);
		return cartList;
	}

	private void showCart() {
		System.out.println("The products on your cart are as follows: ");
		for (String string : cartList) {
			System.out.println(string);
		}
	}

}
