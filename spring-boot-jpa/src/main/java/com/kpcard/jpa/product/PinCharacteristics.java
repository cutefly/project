package com.kpcard.jpa.product;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.type.Location;
import com.kpcard.jpa.type.PinType;

/**
 * 핀 속성
 * @author happymoney
 *
 */
@Data
@Entity(name = "pin_characteristics")
public class PinCharacteristics {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	@Column(name = "pin_label")
	private String	pinLabel;
	
	@Column(name = "pin_location")
	@Enumerated(EnumType.STRING)
	private Location	pinLocation;
	
	@Column(name = "pin_type")
	@Enumerated(EnumType.STRING)
	private PinType	pinType;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_line_details_id")
	private ProductLineDetails		productLineDetails;
}
