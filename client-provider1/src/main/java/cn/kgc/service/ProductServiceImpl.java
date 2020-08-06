package cn.kgc.service;

import cn.kgc.mapper.ProductMapper;
import cn.kgc.vo.Product;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductMapper productMapper;


    @Override
    public List<Product> optionData() {
        return productMapper.selectProduct(new Product());
    }

    @Override
    public Map<String,Object> editProduct(Product product, String flag) {
        //封装验证信息，操作的信息
        Map<String,Object> map=new HashMap<String,Object>();

        //查询库存
        Product proInfo =productMapper.selectProduct(product).get(0);

        String msg="";
        if(flag.equals("add")){
            product.setQuantity(proInfo.getQuantity()+product.getQuantity());
            productMapper.updateProduct(product);
            msg="add success";
        }else{
            //判断库存
            if(proInfo.getQuantity()>product.getQuantity()){
                product.setQuantity(proInfo.getQuantity()-product.getQuantity());
                productMapper.updateProduct(product);

                msg="min success";
            }else{
                msg="库存不够";
            }
        }

        map.put("msg",msg);
        return map;
    }
}
