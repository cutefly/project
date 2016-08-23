/**
 * 
 */
package com.kpcard.jpa.bag;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * 지갑정보
 * @author happymoney
 *
 */
@Entity(name = "bag")
public class Bag {
	/**
	 * 지갑아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String	id;
	
	/**
	 * 지갑요약정보
	 */
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "bag_summary_id")
	private BagSummary	bagSummary;

	/**
	 * 지갑상세정보
	 */
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "bag_details_id")
	private BagDetails	bagDetails;
}
