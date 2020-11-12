package com.ec.reverseEngineering;
// Generated Nov 7, 2020 12:27:59 PM by Hibernate Tools 5.3.6.Final

import java.util.HashSet;
import java.util.Set;

/**
 * EcProduct generated by hbm2java
 */
public class EcProduct implements java.io.Serializable {

	private Long id;
	private EcCategory ecCategory;
	private String name;
	private String description;
	private Long vendorId;
	private Set ecVendorProducts = new HashSet(0);
	private Set ecProductProperties = new HashSet(0);

	public EcProduct() {
	}

	public EcProduct(String name) {
		this.name = name;
	}

	public EcProduct(EcCategory ecCategory, String name, String description, Long vendorId, Set ecVendorProducts,
			Set ecProductProperties) {
		this.ecCategory = ecCategory;
		this.name = name;
		this.description = description;
		this.vendorId = vendorId;
		this.ecVendorProducts = ecVendorProducts;
		this.ecProductProperties = ecProductProperties;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EcCategory getEcCategory() {
		return this.ecCategory;
	}

	public void setEcCategory(EcCategory ecCategory) {
		this.ecCategory = ecCategory;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}

	public Set getEcVendorProducts() {
		return this.ecVendorProducts;
	}

	public void setEcVendorProducts(Set ecVendorProducts) {
		this.ecVendorProducts = ecVendorProducts;
	}

	public Set getEcProductProperties() {
		return this.ecProductProperties;
	}

	public void setEcProductProperties(Set ecProductProperties) {
		this.ecProductProperties = ecProductProperties;
	}

}
