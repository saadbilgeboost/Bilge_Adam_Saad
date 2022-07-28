package com.bilgeadam_21stJuly2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Cart {

	EProduct productE[] = EProduct.values();
	Map<String, Integer> cartMap = new HashMap<String, Integer>();
	List<Product> products = new ArrayList<Product>();
	Map<String, Double> productMap = new HashMap<String, Double>();

	public Cart() {
		createProduct();
		createProductPriceMap();
	}

	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.menu();
//	        sepet.urunOlustur();
//	        sepet.urunfiyatMapOlustur();

	}// main

	public void menu() {
		int input = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("----------------");
			System.out.println("1-Show Product List");
			System.out.println("2-Add Product");
			System.out.println("3-Show Cart");
			System.out.println("4- Products with price greater than 50");
			System.out.println("----------------");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				ListProducts();
				break;
			case 2:
				addProduct();
				break;
			case 3:
				showCart();
				break;
			case 4:
				priceGreaterThan50();
				break;
			default:
				break;
			}

		} while (input != 0);

	}

	public void ListProducts() {

		products.forEach(System.out::println);

	}

	public void total() {

		List<Double> prices = cartMap.entrySet().stream().map(s -> {

			return productMap.get(s.getKey()) * s.getValue();

		}).collect(Collectors.toList());

		Double total = prices.stream().reduce((s1, s2) -> s1 + s2).get();
		System.out.println("Cart Total= " + total);

	}

	public void createProduct() {

		Arrays.asList(productE).stream().forEach((t) -> products.add(new Product(t.name(), t.price)));
//	        products = Arrays.asList(product).stream().map(s -> new Product(s.name(), s.fiyat)).collect(Collectors.toList());
//	        products.forEach(s -> System.out.println(s.getName()));
	}

	public void createProductPriceMap() {
		productMap = products.stream().collect(Collectors.toMap(s -> s.getName(), t -> t.getPrice()));

//	        productMap.entrySet().forEach(System.out::println);

	}

	public void showCart() {
		cartMap.entrySet().forEach(s -> System.out.println(s));

		total();
		double average = cartMap.entrySet().stream().collect(Collectors.averagingDouble(s -> s.getValue()));
		System.out.println(average);
	}

	public void addProduct() {
		Scanner scanner = new Scanner(System.in);
		String product = scanner.nextLine();

		if (cartMap.containsKey(product)) {

			cartMap.replace(product, cartMap.get(product) + 1);
			System.out.println(product + " Added to the cart.");

		} else {
			if (productMap.containsKey(product)) {
				cartMap.put(product, 1);
				System.out.println(product + " Added to the cart.");
			} else {
				System.out.println("Product not found.");
			}
		}

	}

	public void priceGreaterThan50() {
		List<Product> liste = products.stream().filter(s -> s.getPrice() > 50).collect(Collectors.toList());
		// double avg =
		// liste.stream().collect(Collectors.averagingDouble(Product::getPrice));
		double avg = liste.stream().collect(Collectors.averagingDouble(s -> s.getPrice()));
		System.out.println(avg);
	}

}
