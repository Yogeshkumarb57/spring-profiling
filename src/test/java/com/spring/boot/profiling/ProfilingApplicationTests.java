package com.spring.boot.profiling;

import com.spring.boot.profiling.dto.ProductDTO;
import com.spring.boot.profiling.entity.Product;
import com.spring.boot.profiling.enums.ProductCategory;
import com.spring.boot.profiling.mapper.ProductMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfilingApplicationTests {

    @Test
    public void contextLoads() {

        Product mobile = new Product("Nokia", ProductCategory.ELECTRONICS, 20000L, new Date());
        mobile.setId(1);

        ProductDTO productDTO = ProductMapper.mapper.productToProductDTO(mobile);

        System.out.println("PRODUCT TO PRODUCT DTO ::: " + productDTO);

        Assert.assertEquals(productDTO.getProductName(), mobile.getName());
        Assert.assertEquals(productDTO.getPrice(), mobile.getPrice());
        Assert.assertEquals(productDTO.getProductId(), mobile.getId());
        Assert.assertEquals(productDTO.getProductCategory(), mobile.getProductCategory().getCategory());

        mobile = ProductMapper.mapper.productDTOToProduct(productDTO);
        System.out.println("PRODUCT DTO TO PRODUCT ::: " + mobile);

        Assert.assertEquals(mobile.getName(), productDTO.getProductName());
        Assert.assertEquals(mobile.getPrice(), productDTO.getPrice());
        Assert.assertEquals(mobile.getId(), productDTO.getProductId());
        Assert.assertEquals(mobile.getProductCategory().getCategory(), productDTO.getProductCategory());

    }

}
