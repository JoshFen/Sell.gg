public class Products {
	
	protected String itemName;
	protected String description;
	protected String seller;
	protected double price;
	
	/**
	 * Default Constructor
	 */
	public Products() {
		
	}
	
	/**
	 * @param itemName
	 * @param description
	 * @param seller
	 * @param price
	 */
	public Products(String itemName, String description, String seller, double price) {
		this.itemName = itemName;
		this.description = description;
		this.seller = seller;
		this.price = price;
	}
	
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @return the seller
	 */
	public String getSeller() {
		return seller;
	}
	
	/**
	 * @param seller the seller to set
	 */
	public void setSeller(String seller) {
		this.seller = seller;
	}
	
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
}

