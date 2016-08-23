package com.kpcard.jpa.product;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

/**
 * 마그네틱 속성
 * @author happymoney
 *
 */
@Entity(name = "magentic_stripe_characteristics")
public class MagenticStripeCharacteristics {

	/**
	 * 속성 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String	id;
		
	/**
	 * 리뎀션 트랙
	 */
	@Transient
	private Set<Integer>	redemptionTracks;
	
	/**
	 * 트랙1 포맷
	 */
	@Column(name = "track1_format")
	private String	track1Foramt;
	
	/**
	 * 트랙2 포맷
	 */
	@Column(name = "track2_format")
	private String	track2Foramt;
	
	/**
	 * 트랙3 포맷
	 */
	@Column(name = "track3_format")
	private String	track3Foramt;

	/**
	 * 리뎀션 속성(상위정보)
	 */
	@OneToOne
	@JoinColumn(name = "redemption_characteristics_id")
	private RedemptionCharacteristics		redemptionCharacteristics;
}
