package Reimbursement;

public class UploadReimbursementRequest {
	private int id;
	private int employee_id;
	private int  manangement_id;
	private String manangement_Approval;
	private String title;
	private String description;
	private double amount;
	private byte[] reciept;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getManangement_id() {
		return manangement_id;
	}
	public void setManangement_id(int manangement_id) {
		this.manangement_id = manangement_id;
	}
	public String getManangement_Approval() {
		return manangement_Approval;
	}
	public void setManangement_Approval(String manangement_Approval) {
		this.manangement_Approval = manangement_Approval;
	}
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
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public byte[] getReciept() {
		return reciept;
	}
	public void setReciept(byte[] reciept) {
		this.reciept = reciept;
	}
	
	
	
	
	 
	
	
	
}
