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

import com.kpcard.jpa.type.RedemptionTextType;

@Entity(name = "redemption_text")
public class RedemptionText {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	@Column(name = "text")
	private String	text;
	
	@Column(name = "redemption_text_type")
	@Enumerated(EnumType.STRING)
	private RedemptionTextType	redemptionTextType;
	
	@ManyToOne
	@JoinColumn(name = "redemption_characteristics_id")
	private RedemptionCharacteristics		redemptionCharacteristics;
}
