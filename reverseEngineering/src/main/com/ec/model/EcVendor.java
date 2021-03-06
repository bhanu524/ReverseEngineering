package com.ec.model;
// Generated Nov 12, 2020 9:57:01 AM by Hibernate Tools 5.2.11.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * EcVendor generated by hbm2java
 */
@Entity
@Table(name = "ec_vendor", catalog = "enablecommerce")
public class EcVendor implements java.io.Serializable {

	private long id;
	private String name;
	private String legalName;
	private String description;
	private Set ecVendorProducts = new HashSet(0);

	public EcVendor() {
	}

	public EcVendor(long id, String name, String legalName) {
		this.id = id;
		this.name = name;
		this.legalName = legalName;
	}

	public EcVendor(long id, String name, String legalName, String description, Set ecVendorProducts) {
		this.id = id;
		this.name = name;
		this.legalName = legalName;
		this.description = description;
		this.ecVendorProducts = ecVendorProducts;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "Name", nullable = false, length = 250)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "LegalName", nullable = false, length = 250)
	public String getLegalName() {
		return this.legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	@Column(name = "Description", length = 250)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ecVendor")
	public Set getEcVendorProducts() {
		return this.ecVendorProducts;
	}

	public void setEcVendorProducts(Set ecVendorProducts) {
		this.ecVendorProducts = ecVendorProducts;
	}

}
