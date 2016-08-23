package com.kpcard.jpa.product;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.User;
import com.kpcard.jpa.type.*;

@Entity(name = "product_line_details")
public class ProductLineDetails {

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String	id;
	
//	User	creator;
//	User	updator;
	
	@Column(name = "notes")
	private String	notes;
	
	@Column(name = "created_timestamp")
	private Date	createdTimestamp;
	
	@Column(name = "updated_timestamp")
	private Date	updatedTimestamp;
	
	@Column(name = "product_line_description")
	private String	productLineDescription;
	
	@Column(name = "customer_service_phone_number")
	private String	customerServicePhoneNumber;
	
	@Column(name = "customer_service_website")
	private String	customerServiceWebsite;

//	@OneToMany(mappedBy = "productLineDetails")
	@Transient
	private Set<TermsAndConditions>	termsAndConditions;
	
	@Column(name = "card_number_label")
	private String	cardNumberLabel;
	
	@Column(name = "default_product_id")
	private String	defaultProductId;
	
	@Column(name = "default_currency")
	private String	defaultCurrency;

	private String[]	bankIdentificationNumbers;
		
	@Column(name = "pin_required")
	private Boolean	pinRequired;
	
	@Transient
	private Set<SupportedFeatures>	supportedFeatures;
		
	@Column(name = "activation_type")
	@Enumerated(EnumType.STRING)
	private ActivationType	activationType;

	@OneToOne(mappedBy = "productLineDetails")
	private PinCharacteristics	pinCharacteristics;
	
	@OneToOne(mappedBy = "productLineDetails")
	private ExchangeCharacteristics	exchangeCharacteristics;
	
	@OneToOne
    @JoinColumn(name = "redemption_characteristics_id")
	private RedemptionCharacteristics	defaultRedemptionCharacteristics;
	
	@OneToOne
    @JoinColumn(name = "reload_characteristics_id")
	private ReloadCharacteristics	defaultReloadCharacteristics;
	
	@OneToMany(mappedBy = "productLineDetails")
	private List<ProductAffiliation>	productAffiliation;
	
	@Transient
	@OneToMany(mappedBy = "productLineDetails")
	private List<ProductFee>	defaultProductFees;
	
	@Transient
	@OneToMany(mappedBy = "productLineDetails")
	private Set<ProductImage>	defaultProductImages;
	
	@Transient
	@OneToMany(mappedBy = "productLineDetails")
	private List<FulfillmentCharacteristics>	defaultFulfillmentCharacterstics;
	
	@OneToOne(mappedBy = "productLineDetails")
	private BalanceCharacteristics	balanceCharacteristics;
	
	@OneToOne(mappedBy = "productLineDetails")
	private LostStolenCharacteristics	lostStolenCharacteristics;
	
}
