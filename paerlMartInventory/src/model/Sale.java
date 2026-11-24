package model;

public class Sale {
	private String id;
	private String lines;
	private String status;
	public Sale() {
		
	}
	public Sale(String id, String lines, String status) {
		this.id = id;
		this.lines = lines;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLines() {
		return lines;
	}
	public void setLines(String lines) {
		this.lines = lines;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "SaleStatus item id: " + id + "\nlines: " + lines + "\nstatus: " + status;
	}
	 
	
}
