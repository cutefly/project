package com.kpcard.jpa.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "lost_stolen_characteristics")
public class LostStolenCharacteristics {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	@Column(name = "lost_stolen_policy_text")
	private String	lostStolenPolicyText;
	
	@Column(name = "lost_stolen_contact_phone")
	private String	lostStolenContactPhone;

	@Column(name = "is_lost_stolen_policy_automated")
	private Boolean	isLostStolenPolicyAutomated;
	
	@OneToOne
	@JoinColumn(name = "product_line_detals_id")
	private ProductLineDetails		productLineDetails;
}
