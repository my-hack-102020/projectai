package com.svb.hackathon.dto;

public class ClientsFinancial {

	private String id;
	private String client_id;
	private String funds_data;
	private Cost costs;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getFunds_data() {
		return funds_data;
	}
	public void setFunds_data(String funds_data) {
		this.funds_data = funds_data;
	}
	public Cost getCosts() {
		return costs;
	}
	public void setCosts(Cost costs) {
		this.costs = costs;
	}
	
	
}
