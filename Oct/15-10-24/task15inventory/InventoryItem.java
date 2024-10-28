package com.task15inventory;

public class InventoryItem {
private String itemName;
private double pricePerUnit;
private int quantityInStock;

public InventoryItem(String itemName, double pricePerUnit, int quantityInStock) {
	super();
	if(itemName==null || itemName.length()==0) {
		System.err.println("Invalid Name.");
		System.exit(0);
	}
	else if(pricePerUnit<0){
		System.err.println("Invalid Price");
		System.exit(0);
	}
	else if(quantityInStock<0){
		System.err.println("Invalid Quantity");
		System.exit(0);
		}
	else{
	this.itemName = itemName;
	this.pricePerUnit = pricePerUnit;
	this.quantityInStock = quantityInStock;
	}
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public double getPricePerUnit() {
	return pricePerUnit;
}

public void setPricePerUnit(double pricePerUnit) {
	this.pricePerUnit = pricePerUnit;
}

public int getQuantityInStock() {
	return quantityInStock;
}

public void setQuantityInStock(int quantityInStock) {
	this.quantityInStock = quantityInStock;
}

public double calculateTotalValue(){
	double totalvalue = pricePerUnit * quantityInStock;
	System.out.println("Total Value of "+itemName+" in Stock : "+totalvalue);
	return totalvalue;
}

@Override
public String toString() {
	return "InventoryItem [itemName=" + itemName + ", pricePerUnit=" + pricePerUnit + ", quantityInStock="
			+ quantityInStock + "]";
}

}
