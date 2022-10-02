package field_attribute;

public class Product {
	// attribute or field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _colour;
	private String _code;

	/* either we can use constructor to get values
	 public Product(int id, String name, String description, double price, int stockAmount, String colour, String code) {
		_id = id;
		_name = name;
		_description = description;
		_price = price;
		_stockAmount = stockAmount;
		_colour = colour;
		_code = code;
	}*/

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		if (id > 0)
			_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		if (price >= 0)
			_price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		if (stockAmount >= 0)
			_stockAmount = stockAmount;
	}

	public String getColour() {
		return _colour;
	}

	public void setColour(String colour) {
		_colour = colour;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

}
