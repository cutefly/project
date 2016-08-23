/**
 * 
 */
package com.kpcard.jpa.bag;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.person.Person;

/**
 * 지갑 상세정보
 * @author happymoney
 *
 */
@Entity(name = "bag_details")
public class BagDetails {
	
	/**
	 * 지갑상세정보 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
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
	 * 카드정보 리스트
	 */
	@OneToMany(mappedBy = "bagDetails")
	private List<Card>	cards;
	
	/**
	 * 전화정보 리스트
	 */
	@OneToMany(mappedBy = "bagDetails")
	private List<Phone>	phones;

	/**
	 * 지갑 정보(상위정보)
	 */
	@OneToOne(mappedBy = "bagDetails")
	private Bag	bag;
}
