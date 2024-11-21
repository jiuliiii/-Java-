package org.example;

public class Supermarket {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// 1. 顾客 A
		double totalA = customer.calculateTotalCost(2, 3, 0, false, false);
		System.out.println("顾客 A 的总价: " + totalA); // 示例：16 + 39 = 55
		
		// 2. 顾客 B
		double totalB = customer.calculateTotalCost(2, 3, 1, false, false);
		System.out.println("顾客 B 的总价: " + totalB); // 示例：16 + 39 + 20 = 75
		
		// 3. 顾客 C
		double totalC = customer.calculateTotalCost(2, 3, 1, true, false);
		System.out.println("顾客 C 的总价: " + totalC); // 示例：16 + 31.2 + 20 = 67.2
		
		// 4. 顾客 D
		double totalD = customer.calculateTotalCost(5, 4, 3, true, true);
		System.out.println("顾客 D 的总价: " + totalD); // 示例：40 + 41.6 + 60 - 10 = 131.6
	}
}