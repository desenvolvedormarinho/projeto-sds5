package com.devsuperior.dsvendas.dto;

import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

public class SaleDTO {
	
	private Integer Id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SellerDTO seller;
	
	public SaleDTO() {	
	}

	public SaleDTO(Integer id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
		Id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	public SaleDTO(Sale entity) {
		Id = entity.getId();
		visited = entity.getId();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		seller =new SellerDTO( entity.getSeller());
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}
	
}
