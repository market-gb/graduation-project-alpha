package ru.geekbrains.main.lesson_1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.main.lesson_1.dto.ProductDto;
import ru.geekbrains.main.lesson_1.exceptions.ResourceException;
import ru.geekbrains.main.lesson_1.services.ProductService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<?> getProductList(){
        return new ResponseEntity<>(productService.getAllProductsDto(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id){
        HttpStatus httpStatus;
        ProductDto productDto;
        try{
            productDto = productService.getProductDtoById(id);
            httpStatus = HttpStatus.OK;
        }catch (ResourceException exception){
            httpStatus = HttpStatus.NOT_FOUND;
            return new ResponseEntity<>(exception.getMessage(), httpStatus);
        }
        return new ResponseEntity<>(productDto, httpStatus);
    }

    @PostMapping
    public ResponseEntity<?> saveNewProduct(@RequestBody ProductDto productDto){
        HttpStatus httpStatus;
        try{
            productService.saveProduct(productDto);
            httpStatus = HttpStatus.CREATED;
        }catch (ResourceException exception){
            httpStatus = HttpStatus.BAD_REQUEST;
            return new ResponseEntity<>(exception.getMessage(), httpStatus);
        }
        return new ResponseEntity<>(httpStatus);
    }

    @PutMapping
    public ResponseEntity<?> updateProduct(@RequestBody ProductDto productDto){
        HttpStatus httpStatus;
        try{
            productService.saveProduct(productDto);
            httpStatus = HttpStatus.OK;
        }catch (ResourceException exception){
            httpStatus = HttpStatus.BAD_REQUEST;
            return new ResponseEntity<>(exception.getMessage(), httpStatus);
        }
        return new ResponseEntity<>(httpStatus);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable Long id){
        HttpStatus httpStatus;
        try{
            productService.deleteProductById(id);
            httpStatus = HttpStatus.OK;
        }catch (ResourceException exception){
            httpStatus = HttpStatus.BAD_REQUEST;
            return new ResponseEntity<>(exception.getMessage(), httpStatus);
        }
        return new ResponseEntity<>(httpStatus);
    }
}
