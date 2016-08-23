/**
 * 
 */
package com.kpcard.jpa.bag;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * 지갑 요약정보
 * @author happymoney
 *
 */
@Entity(name = "bag_summary")
public class BagSummary {
	/**
	 * 지갑 요약정보 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 소유자 아이디
	 */
	@Column(name = "owner_id")
	private String	ownerId;
	
	/**
	 * 설명
	 */
	@Column(name = "description")
	private String	description;

	/**
	 * 회원 정보(상위정보)
	 */
	@OneToOne(mappedBy = "bagSummary")
	private Bag	bag;
}
