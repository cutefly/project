package com.kpcard.jpa.person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.type.AddressType;

/**
 * 개인주소정보
 * @author happymoney
 *
 */
@Entity(name = "person_address")
public class PersonAddress {
	
	/**
	 * 주소아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 이름
	 */
	@Column(name = "name")
	private String	name;
	
	/**
	 * 거리명
	 */
	@Column(name = "street")
	private String	street;
	
	/**
	 * 도시명
	 */
	@Column(name = "city")
	private String	city;
	
	/**
	 * 주소1
	 */
	@Column(name = "address_line1")
	private String	addressLine1;
	
	/**
	 * 주소2
	 */
	@Column(name = "address_line2")
	private String	addressLine2;
	
	/**
	 * 주소3
	 */
	@Column(name = "address_line3")
	private String	addressLine3;
	
	/**
	 * 시도구분
	 */
	@Column(name = "county_or_district")
	private String	countyOrDistrict;
	
	/**
	 * 시도
	 */
	@Column(name = "state_or_province")
	private String	stateOrProvince;
	
	/**
	 * 국가
	 */
	@Column(name = "country")
	private String	country;
	
	/**
	 * 우편번호
	 */
	@Column(name = "postal_code")
	private String	postalCode;
	
	/**
	 * 주소유형
	 */
	@Column(name = "address_type")
	@Enumerated(EnumType.STRING)
	private AddressType	addressType;
	
	/**
	 * 기본정보여부
	 */
	@Column(name = "is_preferred")
	private Boolean	isPreferred;
	
	/**
	 * 인증여부
	 */
	@Column(name = "is_verified")
	private Boolean	isVerified;

	/**
	 * 회원상세정보(상위정보)
	 */
	@ManyToOne
	@JoinColumn(name = "person_details_id")
	private PersonDetails		personDetails;
}
