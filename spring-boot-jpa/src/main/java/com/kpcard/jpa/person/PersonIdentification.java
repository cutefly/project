package com.kpcard.jpa.person;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.type.IdentificationType;

/**
 * 개인 아이디 정보
 * @author happymoney
 *
 */
@Entity(name = "person_identification")
public class PersonIdentification {
	/**
	 * 개인아이디 키
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 생성시간
	 */
	@Column(name = "created_timestamp")
	private Date	createdTimestamp;
	
	/**
	 * 수정시간
	 */
	@Column(name = "updated_timestamp")
	private Date	updatedTimestamp;
	
	/**
	 * 인증번호
	 */
	@Column(name = "identification_number")
	private String	identificationNumber;
	
	/**
	 * 발행자
	 */
	@Column(name = "issuing_uthority")
	private String	issuingAuthority;
	
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
	private IdentificationType	identificationType;
	
	/**
	 * 회원상세정보(상위정보)
	 */
	@ManyToOne
	@JoinColumn(name = "person_details_id")
	private PersonDetails		personDetails;
}
