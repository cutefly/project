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

import com.kpcard.jpa.type.EmailType;

/**
 * 개인전자우편정보
 * @author happymoney
 *
 */
@Entity(name = "person_email")
public class PersonEmail {

	/**
	 * 전자우편정보 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 전자우편주소
	 */
	@Column(name = "email_address")
	private String	emailAddress;
	
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
	 * 전자우편 유형
	 */
	@Column(name = "email_type")
	@Enumerated(EnumType.STRING)
	private EmailType	emailType;
	
	/**
	 * 회원상세정보(상위정보)
	 */
	@ManyToOne
	@JoinColumn(name = "person_details_id")
	private PersonDetails		personDetails;

}
