package cn.kgc.service;

import cn.kgc.mapper.ProductMapper;
import cn.kgc.mapper.SaleMapper;
import cn.kgc.vo.Product;
import cn.kgc.vo.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class SaleServiceImpl implements SaleService{
    @Autowired
    private SaleMapper saleMapper;
    @Autowired
    private ProductMapper productMapper;
    @Override
    public Map<String, Object> saleProduct(Sale sale) {
        Integer productid = sale.getProductid();
        Product product=new Product();
        Map<String, Object> map=new HashMap<String, Object>();
        product.setId(productid);
        String msg="";
        product  = productMapper.selectProduct(product).get(0);
        if (sale.getQuantity()<=product.getQuantity()){
            int num=saleMapper.insertSale(sale);


            product.setQuantity(product.getQuantity()-sale.getQuantity());
            num=productMapper.updateProduct(product);
            msg="success";
        }
        else {
            msg="库存不足！";
        }
        map.put("msg",msg);
        return map;
    }

    @Override
    public List<Sale> selectSale(Sale sale) {
        return saleMapper.selectSale(sale);
    }
}
