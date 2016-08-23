package com.kpcard.jpa.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "product_line")
public class ProductLine {

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String	id;

	@OneToOne
    @JoinColumn(name = "product_line_summary_id")
	private ProductLineSummary	productLineSummary;

	@OneToOne
    @JoinColumn(name = "product_line_details_id")
	private ProductLineDetails	productLineDetails;
	
}
