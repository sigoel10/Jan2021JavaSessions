package OOP_Encapsulation;

public class Company {
	
	private String name;
	private int sharePrice;
	private String policy;
	//setter:
	public void setName(String name) {
		this.name = name;
	}
	//getter:
	public String getName() {
		return name;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
}
