package com.kpcard.jpa.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.type.AffiliationType;

@Entity(name = "product_affiliation")
public class ProductAffiliation {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	@Column(name = "company_id")
	private String	companyId;
	
	@Column(name = "affiliation_type")
	@Enumerated(EnumType.STRING)
	private AffiliationType	affiliationType;
	
	@ManyToOne
	@JoinColumn(name = "product_line_details_id")
	private ProductLineDetails		productLineDetails;
}
