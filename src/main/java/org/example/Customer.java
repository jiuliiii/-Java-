package org.example;

// 顾客类，用于计算购买的总价
class Customer {
	public double calculateTotalCost(int apples, int strawberries, int mangoes, boolean isStrawberryDiscount, boolean isFullDiscount) {
		// 定义商品价格
		Product apple = new Product("Apple", 8.0);
		Product strawberry = new Product("Strawberry", 13.0);
		Product mango = new Product("Mango", 20.0);
		
		// 计算各商品费用
		double appleCost = apples * apple.getPricePerKg();
		double strawberryCost = strawberries * strawberry.getPricePerKg();
		if (isStrawberryDiscount) {
			strawberryCost *= 0.8; // 打八折
		}
		double mangoCost = mangoes * mango.getPricePerKg();
		
		// 总价
		double total = appleCost + strawberryCost + mangoCost;
		
		// 满减活动
		if (isFullDiscount && total >= 100) {
			total -= 10;
		}
		
		return total;
	}
}

