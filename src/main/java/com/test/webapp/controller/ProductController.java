package com.test.webapp.controller;


import com.test.webapp.model.Product;
import com.test.webapp.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/")
@Api(value="ProductController", description="ProductController Api document")
public class ProductController {
    @Autowired
    ProductService productService;

    @ApiOperation(value = "View a list of available products",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @GetMapping("product_id/{id}")
    public Optional<Product> getProductById(@PathVariable("id") Integer id){

        return productService.getProductById(id);
    }

    @PostMapping("/save_product")
    public Product saveProduct(@RequestBody Product teacherInformation){

        return productService.saveProduct(teacherInformation);
    }

    @ApiOperation(value = "View a list of all products",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @GetMapping("/all_Product")
    public List<Product> getProductAll(){

        return productService.getProductAll();
    }
}
