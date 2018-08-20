package com.spring.boot.profiling.mapper;

import com.spring.boot.profiling.dto.ProductDTO;
import com.spring.boot.profiling.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

    @Mappings({
            @Mapping(source = "name",target="productName"),
            @Mapping(source = "id",target = "productId"),
            @Mapping(source = "manufacturingDate",target = "manufacturingDate",dateFormat = "dd-MM-yyyy HH:mm:ss")
    })
    ProductDTO productToProductDTO(Product product);

    @Mappings({
            @Mapping(target = "name",source="productName"),
            @Mapping(target = "id",source = "productId"),
            @Mapping(source = "manufacturingDate",target = "manufacturingDate",dateFormat = "dd-MM-yyyy HH:mm:ss")
    })
    Product productDTOToProduct(ProductDTO productDTO);

}
