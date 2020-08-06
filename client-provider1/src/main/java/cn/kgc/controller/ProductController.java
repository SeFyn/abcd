package cn.kgc.controller;

import cn.kgc.service.ProductService;
import cn.kgc.vo.Product;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/product")
    @RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/opt.do",method = RequestMethod.GET)
    public List<Product> optionData(){
        return productService.optionData();
    }
    @RequestMapping(value = "/edit.do",method = RequestMethod.POST)
    public Map<String,Object> editProduct(@RequestBody Product product, @RequestParam("flag") String flag){
        return productService.editProduct(product,flag);
    }
}
