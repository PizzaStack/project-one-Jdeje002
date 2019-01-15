package Employee;

public class UploadReimbursementRequest {

	private String title;
	private String description;
	private double amount;
	private byte[] receipt;
	private int Id;
	 
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public byte[] getRecipet() {
		return receipt;
	}
	public void setRecipet(byte[] receipt) {
		this.receipt = receipt;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
}
