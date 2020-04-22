
public class SoldProducts extends MyProducts {

	private String buyer;
	private String orderNumber;
	private String sellDate;
	
	/**
	 * 
	 */
	public SoldProducts() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param buyer
	 * @param ordernumber
	 * @param sellDate
	 */
	public SoldProducts(String buyer, String orderNumber, String sellDate) {
		super();
		this.buyer = buyer;
		this.orderNumber = orderNumber;
		this.sellDate = sellDate;
	}

	/**
	 * @return the buyer
	 */
	public String getBuyer() {
		return buyer;
	}

	/**
	 * @param buyer the buyer to set
	 */
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	/**
	 * @return the orderNumber
	 */
	public String getOrdernumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrdernumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @return the sellDate
	 */
	public String getSellDate() {
		return sellDate;
	}

	/**
	 * @param sellDate the sellDate to set
	 */
	public void setSellDate(String sellDate) {
		this.sellDate = sellDate;
	}

	/**
	 * @return the item was sold
	 */
	public boolean isSold() {
		
		boolean sold = true;
		
		return sold;
	}
	
	
	
	
	
}
