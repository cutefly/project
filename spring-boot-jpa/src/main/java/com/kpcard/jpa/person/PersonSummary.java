package com.kpcard.jpa.person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * 회원 요약정보
 * @author happymoney
 *
 */
@Entity(name = "person_summary")
public class PersonSummary {

	/**
	 * 회원 요약정보 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 이름
	 */
	@Column(name = "first_name")
	private String	firstName;
		
	/**
	 * 이름(중간)
	 */
	@Column(name = "middle_name")
	private String	middleName;
	
	/**
	 * 이름(성)
	 */
	@Column(name = "last_name")
	private String	lastName;
	
	/**
	 * 전자우편주소
	 */
	@Column(name = "email_address")
	private String	emailAddress;
	
	/**
	 * 전화번호
	 */
	@Column(name = "phone_number")
	private String	phoneNumber;
	
	/**
	 * 거리명
	 */
	@Column(name = "street")
	private String	street;
	
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
	 * 도시
	 */
	@Column(name = "city")
	private String	city;
	
	/**
	 * 시도
	 */
	@Column(name = "state_of_province")
	private String	stateOrProvince;
	
	/**
	 * 우편번호
	 */
	@Column(name = "postal_code")
	private String	postalCode;

	/**
	 * 회원 정보(상위정보)
	 */
	@OneToOne(mappedBy = "personSummary")
	private Person	person;
}
