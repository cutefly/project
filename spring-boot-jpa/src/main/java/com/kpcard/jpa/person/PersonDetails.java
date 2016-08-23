package com.kpcard.jpa.person;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.type.Gender;

/**
 * 회원상세정보
 * @author happymoney
 *
 */
@Entity(name = "person_details")
public class PersonDetails {
	
	/**
	 * 회원상세정보 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 생성자
	 */
	@Column(name = "creator_id")
	private String	creatorId;
	
	/**
	 * 수정자
	 */
	@Column(name = "updater_id")
	private String	updaterId;

	/**
	 * 설명
	 */
	@Column(name = "notes")
	private String	notes;
	
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
	 * 추가속성정보 리스트
	 */
	@OneToMany(mappedBy = "personDetails")
	private List<PersonEntityAttribute>	additionalAttributes;
	
	/**
	 * 성별
	 */
	@Column(name = "gender")
	@Enumerated(EnumType.STRING)
	private Gender	gender;
	
	/**
	 * 생일
	 */
	@Column(name = "birth_date")
	private String	birthDate;
	
	/**
	 * 회원식별번호
	 */
	@Column(name = "social_security_number")
	private String	socialSecurityNumber;
	
	/**
	 * 언어설정 코드
	 */
	@Column(name = "language_preference_code")
	private String	languagePreferenceCode;
	
	/**
	 * 주소 리스트
	 */
	@OneToMany(mappedBy = "personDetails")
	private List<PersonAddress>	addresses;
	
	/**
	 * 전화번호 리스트
	 */
	@OneToMany(mappedBy = "personDetails")
	private List<PersonPhoneNumber>	phoneNumbers;
	
	/**
	 * 이메일주소 리스트
	 */
	@OneToMany(mappedBy = "personDetails")
	private List<PersonEmail>	emailAddresses;
	
	/**
	 * 인증정보 리스트
	 */
	@OneToMany(mappedBy = "personDetails")
	private List<PersonIdentification>	personIdentifications;

	/**
	 * 회원 정보(상위정보)
	 */
	@OneToOne(mappedBy = "personDetails")
	private Person	person;
}
