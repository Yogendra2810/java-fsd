package com.ecommerce;

import java.math.BigDecimal;
import java.util.*;

public class EProduct {

	private long ID;
	private String name;
	private BigDecimal price;
	private Date dateAdded;
	
	//Component object
		private ProductParts parts;
		
		
		public ProductParts getParts() {
			return parts;
		}

		public void setParts(ProductParts parts) {
			this.parts = parts;
		}
		
		// Aggregation object
	private List<Color> colors;
    private Collection<ScreenSizes> screenSizes;
    private Set<OS> os;
    private Map finance ;

	public EProduct() {

	}

	public EProduct(long id, String name, BigDecimal price, Date dateAdded) {
		this.ID = id;
		this.name = name;
		this.price = price;
		this.dateAdded = dateAdded;
	}
public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public List<Color> getColors() {
		return colors;
	}
public void setColors(List<Color> colors) {
		this.colors = colors;
	}

	public Collection<ScreenSizes> getScreenSizes() {
		return screenSizes;
	}

	public void setScreenSizes(Collection<ScreenSizes> screenSizes) {
		this.screenSizes = screenSizes;
	}

	public Set<OS> getOs() {
		return os;
	}

	public void setOs(Set<OS> os) {
		this.os = os;
	}

	public Map getFinance() {
		return finance;
	}

	public void setFinance(Map finance) {
		this.finance = finance;
	}
	
	

}