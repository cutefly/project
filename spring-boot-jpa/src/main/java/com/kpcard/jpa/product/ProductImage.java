package com.kpcard.jpa.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.type.ImageSize;
import com.kpcard.jpa.type.ImageType;

/**
 * 상품 이미지 정보
 * @author happymoney
 */
@Entity(name = "product_image")
public class ProductImage {
	
	/**
	 * 이미지정보 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 전면 이미지
	 */
	@Column(name = "front_image")
	private String	frontImage;
	
	/**
	 * 후면 이미지
	 */
	@Column(name = "back_image")
	private String	backImage;
	
	/**
	 * 이미지 크기
	 */
	@Column(name = "image_size")
	@Enumerated(EnumType.STRING)
	private ImageSize	imageSize;
	
	/**
	 * 이미지 유형
	 */
	@Column(name = "image_type")
	@Enumerated(EnumType.STRING)
	private ImageType	imageType;
	
	/**
	 * 상위정보(Product Configuration)
	 */
	@ManyToOne
	@JoinColumn(name = "product_configuration_id")
	private ProductConfiguration		productConfiguration;

}
