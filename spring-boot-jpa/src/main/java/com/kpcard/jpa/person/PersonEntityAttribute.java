/**
 * 
 */
package com.kpcard.jpa.person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * 개인속성정보
 * @author happymoney
 *
 */
@Entity(name = "person_entity_attribute")
public class PersonEntityAttribute {
	
	/**
	 * 회원 추가속성 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 속성명
	 */
	@Column(name = "name")
	String	name;
	
	/**
	 * 속성타입
	 */
	@Column(name = "type")
	String	type;
	
	/**
	 * 속성값
	 */
	@Column(name = "value")
	String	value;

	/**
	 * 회원상세정보(상위정보)
	 */
	@ManyToOne
	@JoinColumn(name = "person_details_id")
	private PersonDetails		personDetails;
}