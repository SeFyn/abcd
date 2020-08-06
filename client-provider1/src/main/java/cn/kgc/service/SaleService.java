package cn.kgc.service;

import cn.kgc.vo.Sale;

import java.util.List;
import java.util.Map;

public interface SaleService {

    Map<String,Object> saleProduct(Sale sale);
    List<Sale> selectSale(Sale sale);
}
