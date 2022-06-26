package ru.geekbrains.main.converters;

import org.springframework.stereotype.Component;
import ru.geekbrains.main.dto.ProductDto;
import ru.geekbrains.main.entities.Product;

@Component
public class ProductConverter {
    public Product productDtoToProduct(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getTitle(), productDto.getPrice());
    }

    public ProductDto productToProductDto(Product product) {
        return new ProductDto(product.getId(), product.getTitle(), product.getPrice());
    }
}
