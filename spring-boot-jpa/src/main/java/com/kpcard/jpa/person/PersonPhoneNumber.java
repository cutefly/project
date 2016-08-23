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

import com.kpcard.jpa.type.PhoneNumberType;

/**
 * 개인전화번호 정보
 * @author happymoney
 *
 */
@Entity(name = "person_phone_number")
public class PersonPhoneNumber {
	/**
	 * 전화번호 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 전화번호
	 */
	@Column(name = "phone_number")
	private String	phoneNumber;
	
	/**
	 * 전화번호 유형
	 */
	@Column(name = "phone_number_type")
	@Enumerated(EnumType.STRING)
	private PhoneNumberType	phoneNumberType;
	
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
