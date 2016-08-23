package com.kpcard.jpa.product;

import java.util.Date;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.type.AccountType;
import com.kpcard.jpa.type.ProductLineStatus;

@Entity(name = "product_line_summary")
public class ProductLineSummary {

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	@Column(name = "brand_name")
	private String	brandName;
	
	@Column(name = "brand_logo_image")
	private String	brandLogoImage;
	
	@Column(name = "product_line_name")
	private String	productLineName;
	
	@Column(name = "product_line_status")
	@Enumerated(EnumType.STRING)
	private ProductLineStatus	productLineStatus;
	
	@Column(name = "account_type")
	@Enumerated(EnumType.STRING)
	private AccountType			accountType;
	
	@Column(name = "start_date")
	private Date	startDate;
	
	@Column(name = "end_date")
	private Date	endDate;
	
	@Column(name = "locale")
	private Locale	locale;
}
