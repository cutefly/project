package com.kpcard.jpa.product;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.type.ConfigurationStatus;

/**
 * 상품 설정정보
 * @author happymoney
 *
 */
@Entity(name = "product_configuration")
public class ProductConfiguration {
	
	/**
	 * 설정정보 아이디
	 */
	@Id
	@Column(name = "configuration_id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	configurationId;
	
	/**
	 * 설정명칭
	 */
	@Column(name = "configuration_name")
	private String	configurationName;
	
	/**
	 * 설정 설명
	 */
	@Column(name = "configuration_description")
	private String	configurationDescription;
	
	/**
	 * 아이템 아이디
	 */
	@Column(name = "item_id")
	private Integer	itemId;
	
	/**
	 * 시작일자
	 */
	@Column(name = "start_date")
	private Date	startDate;
	
	/**
	 * 종료일자
	 */
	@Column(name = "end_date")
	private Date	endDate;
	
	/**
	 * 설정상태
	 */
	@Column(name = "configuration_status")
	private ConfigurationStatus	configurationStatus;

	/**
	 * 상품이미지 리스트
	 */
	@OneToMany(mappedBy = "productConfiguration")
	private Set<ProductImage>	productImages;
	
	/**
	 * 상품상세정보(상위정보)
	 */
	@ManyToOne
	@JoinColumn(name = "product_details_id")
	private ProductDetails		productDetails;

}
