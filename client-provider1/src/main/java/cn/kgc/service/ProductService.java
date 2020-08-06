package cn.kgc.service;

import cn.kgc.vo.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    //下拉列表
    List<Product> optionData();


    //修改商品
    Map<String,Object> editProduct(Product product, String flag);

}
