package com.spring.boot.profiling;

import com.spring.boot.profiling.dto.ProductDTO;
import com.spring.boot.profiling.entity.Order;
import com.spring.boot.profiling.entity.Product;
import com.spring.boot.profiling.entity.Specification;
import com.spring.boot.profiling.enums.ProductCategory;
import com.spring.boot.profiling.mapper.ProductMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfilingApplicationTests {

    @Autowired
    private ProductMapper mapper;

    @Test
    public void contextLoads() {

        System.out.println("+++++++++++++++++++++++++Product Mapper :: "+mapper);

        //ProductMapper productMapper= Mappers.getMapper(ProductMapper.class);

        Product mobile = new Product("Nokia", ProductCategory.ELECTRONICS, 20000L, new Date());
        mobile.setId(1);
        mobile.setSpecification(new Specification("4GB","2.2GHZ","64GB"));
        mobile.setOrder(new Order(new Date().toString(),String.valueOf(System.currentTimeMillis()),new BigDecimal(20000)));

        ProductDTO productDTO = mapper.productToProductDTO(mobile);

        System.out.println("PRODUCT TO PRODUCT DTO ::: " + productDTO);

        Assert.assertEquals(productDTO.getProductName(), mobile.getName());
        Assert.assertEquals(productDTO.getPrice(), mobile.getPrice());
        Assert.assertEquals(productDTO.getProductId(), mobile.getId());
        Assert.assertEquals(productDTO.getProductCategory(), mobile.getProductCategory().getCategory());


        mobile = mapper.productDTOToProduct(productDTO);
        System.out.println("PRODUCT DTO TO PRODUCT ::: " + mobile);

        Assert.assertEquals(mobile.getName(), productDTO.getProductName());
        Assert.assertEquals(mobile.getPrice(), productDTO.getPrice());
        Assert.assertEquals(mobile.getId(), productDTO.getProductId());
        Assert.assertEquals(mobile.getProductCategory().getCategory(), productDTO.getProductCategory());

    }

}
