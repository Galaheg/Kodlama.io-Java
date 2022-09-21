package kodlamaio_day1;

public class Product {
	
	private String name;
	private double unitPrice;
	private double discount;
	private String imURL;
	private int unitsInStock;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getImURL() {
		return imURL;
	}
	public void setImURL(String imURL) {
		this.imURL = imURL;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
}
