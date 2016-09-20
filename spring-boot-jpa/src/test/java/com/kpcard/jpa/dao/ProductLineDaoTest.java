/**
 * 
 */
package com.kpcard.jpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kpcard.jpa.product.PinCharacteristics;
import com.kpcard.jpa.product.ProductLine;
import com.kpcard.jpa.product.ProductLineDetails;
import com.kpcard.jpa.product.ProductLineSummary;
import com.kpcard.jpa.type.AccountType;
import com.kpcard.jpa.type.ActivationType;
import com.kpcard.jpa.type.Location;
import com.kpcard.jpa.type.PinType;

/**
 * @author happymoney
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//@SpringApplicationConfiguration(classes = SpringBootJpaApplication.class)
@WebAppConfiguration
public class ProductLineDaoTest {

	@Autowired
	private ProductLineDao	productLineDao;
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
    public void findAll() {
        
        List<ProductLine> catalogList = productLineDao.findAll();
        assertEquals(catalogList.size(), 0);
    }

	@Test
    public void create() {
        ProductLine	productLine = new ProductLine();
        ProductLineSummary	productLineSummary = new ProductLineSummary();
        
        productLineSummary.setProductLineName("Ediya");
        productLineSummary.setAccountType(AccountType.LOYALTY_CARD);
        productLineSummary.setBrandName("Ediya");        
        productLine.setProductLineSummary(productLineSummary);
        
        ProductLineDetails	productLineDetails = new ProductLineDetails();

        productLineDetails.setCreatedTimestamp(Calendar.getInstance().getTime());
        productLineDetails.setUpdatedTimestamp(Calendar.getInstance().getTime());
        productLineDetails.setProductLineDescription("Ediya Coffee");
        productLineDetails.setActivationType(ActivationType.ONE_STEP);
        productLineDetails.setPinRequired(false);
        
        PinCharacteristics	pinCharacteristics = new PinCharacteristics();
        pinCharacteristics.setPinType(PinType.PRINTED);
        pinCharacteristics.setPinLabel("Card # :");
        pinCharacteristics.setPinLocation(Location.BACK);
        productLineDetails.setPinCharacteristics(pinCharacteristics);
        productLine.setProductLineDetails(productLineDetails);
        
		productLineDao.save(productLine);
        List<ProductLine> catalogList = productLineDao.findAll();
        assertEquals(catalogList.size(), 1);
    }

}
