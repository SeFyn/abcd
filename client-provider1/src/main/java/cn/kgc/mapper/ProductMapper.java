package cn.kgc.mapper;

import cn.kgc.vo.Product;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ProductMapper {
    List<Product> selectProduct(Product product);

    int updateProduct(Product product);


}
