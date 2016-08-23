package com.kpcard.jpa.bag;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * 전화정보
 * @author happymoney
 *
 */
@Entity(name = "phone")
public class Phone {
	
	/**
	 * 전화정보 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * Account 아이디
	 */
	@Column(name = "account_id")
	private String	accountId;
	
	/**
	 * 전화번호
	 */
	@Column(name = "phone_number")
	private String	phoneNumber;
	
	/**
	 * 상품라인 아이디
	 */
	@Column(name = "product_line_id")
	private String	productLineId;
	
	/**
	 * 설명
	 */
	@Column(name = "description")
	private String	description;
	
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
	 * 지갑상세정보(상위정보)
	 */
	@ManyToOne
	@JoinColumn(name = "bag_details_id")
	private BagDetails		bagDetails;
}
