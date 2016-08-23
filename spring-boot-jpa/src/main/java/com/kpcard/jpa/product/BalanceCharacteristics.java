package com.kpcard.jpa.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * 잔액조회 속성
 * @author happymoney
 *
 */
@Entity(name = "balance_characteristics")
public class BalanceCharacteristics {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	@Column(name = "are_balances_transferable")
	private Boolean	areBalancesTransferable;
	
	@Column(name = "balance_lock_time_frame")
	private Integer	balanceLockTimeFrame;
	
	@Column(name = "hasUniversal_bi_support")
	private Boolean	hasUniversalBISupport;
	
	@Column(name = "pin_required_for_bi")
	private Boolean	pinRequiredforBI;

	@OneToOne
	@JoinColumn(name = "product_line_details_id")
	private ProductLineDetails		productLineDetails;
}
