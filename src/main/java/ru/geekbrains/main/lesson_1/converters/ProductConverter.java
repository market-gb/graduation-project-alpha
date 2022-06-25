package ru.geekbrains.main.lesson_1.converters;

import ru.geekbrains.main.lesson_1.dto.ProductDto;
import ru.geekbrains.main.lesson_1.entities.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    public Product productDtoToProduct(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getTitle(), productDto.getPrice());
    }

    public ProductDto productToProductDto(Product product) {
        return new ProductDto(product.getId(), product.getTitle(), product.getPrice());
    }
}
