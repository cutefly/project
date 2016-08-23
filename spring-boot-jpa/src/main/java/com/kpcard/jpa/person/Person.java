/**
 * 
 */
package com.kpcard.jpa.person;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * 사용자정보
 * @author happymoney
 *
 */
@Entity(name = "person")
public class Person {

	/**
	 * 사용자아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 사용자 요약정보
	 */
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "person_summary_id")
	private PersonSummary	personSummary;

	/**
	 * 사용자 상세정보
	 */
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "person_details_id")
	private PersonDetails	personDetails;

}
