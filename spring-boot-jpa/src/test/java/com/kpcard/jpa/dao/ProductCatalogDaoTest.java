package com.kpcard.jpa.dao;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kpcard.SpringBootJpaApplication;
import com.kpcard.jpa.product.ProductCatalog;
import com.kpcard.jpa.product.ProductCatalogDetails;
import com.kpcard.jpa.product.ProductCatalogSummary;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootJpaApplication.class)
@WebAppConfiguration
public class ProductCatalogDaoTest {

	@Autowired
	private ProductCatalogDao	productCatalogDao;
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
    public void findAll() {
        
        List<ProductCatalog> catalogList = productCatalogDao.findAll();
        assertEquals(catalogList.size(), 0);
    }

	@Test
    public void createAndDelete() {
        
		ProductCatalog	productCatalog = new ProductCatalog();
		ProductCatalogSummary	productCatalogSummary = new ProductCatalogSummary();
		ProductCatalogDetails	productCatalogDetails = new ProductCatalogDetails();
	
		productCatalogSummary.setVersion(1);
		productCatalogSummary.setName("catalog");
		productCatalog.setProductCatalogSummary(productCatalogSummary);

		productCatalogDetails.setNotes("notes");
		productCatalogDetails.setDescription("description");
		productCatalogDetails.setCreatedTimestamp(Calendar.getInstance().getTime());
		productCatalogDetails.setUpdatedTimestamp(Calendar.getInstance().getTime());
		productCatalog.setProductCatalogDetails(productCatalogDetails);

		productCatalogDao.save(productCatalog);

        assertEquals(productCatalogDao.findAll().size(), 1);
        
//		productCatalogDao.deleteAll();
//        assertEquals(productCatalogDao.findAll().size(), 0);
        
    }
}
