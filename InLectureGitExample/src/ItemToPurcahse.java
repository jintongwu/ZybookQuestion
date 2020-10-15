
public class ItemToPurcahse {
	String itemName;
	int itemPrice;
	int itemQuality;
	
	ItemToPurcahse(String name, int price, int quality){
		this.itemName = name;
		this.itemPrice = price;
		this.itemQuality = quality;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemQuality() {
		return itemQuality;
	}

	public void setItemQuality(int itemQuality) {
		this.itemQuality = itemQuality;
	}
	
	
}
