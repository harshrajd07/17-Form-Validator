package com.task15inventory;

public class Inventorydemo {

	public static void main(String[] args) {
		InventoryItem I1 = new InventoryItem("Bananas",8.0,10);
		I1.calculateTotalValue();
		System.out.println(I1);
	}

}
