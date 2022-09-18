package com.dev.products;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestScope;

import java.util.List;

@RestController

public class ProductController {
    @Autowired
    ProductService productService;

    // return all products
    @ApiOperation(value = "Get all products", notes = "Returns all product from product table")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved"),
            @ApiResponse(code = 404, message = "Some error occurred")
    })
    @RequestMapping(method = RequestMethod.GET, value = "/products")
    List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    List<Product> userProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/products")
    boolean addProduct(@RequestBody Product prod) {
        return productService.addProduct(prod);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/products")
    boolean updateProduct(@RequestBody Product prod) {
        return productService.updateProduct(prod);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
    boolean deleteProduct(@PathVariable Integer id) {
        return productService.deleteProduct(id);
    }


}
