package ru.geekbrains.main.lesson_1.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.main.lesson_1.converters.ProductConverter;
import ru.geekbrains.main.lesson_1.dto.ProductDto;
import ru.geekbrains.main.lesson_1.exceptions.ResourceException;
import ru.geekbrains.main.lesson_1.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductConverter productConverter;

    public List<ProductDto> getAllProductsDto() {
        return productRepository.findAll().stream()
                .map(productConverter::productToProductDto)
                .collect(Collectors.toList());
    }

    public ProductDto getProductDtoById(Long id) {
        if (id == null){
            throw new ResourceException(ResourceException.Errors.INVALID_PARAMS.name());
        }
        return productConverter
                .productToProductDto(productRepository.findById(id)
                        .orElseThrow(() -> new ResourceException(
                                ResourceException.Errors.PRODUCT_NOT_FOUND.name())));
    }

    public void saveProduct(ProductDto productDto) {
        if (productDto == null){
            throw new ResourceException(ResourceException.Errors.INVALID_PARAMS.name());
        }
        productRepository.save(productConverter.productDtoToProduct(productDto));
    }

    public void deleteProductById(Long id){
        if (id == null){
            throw new ResourceException(ResourceException.Errors.INVALID_PARAMS.name());
        }
        productRepository.deleteById(id);
    }
}
