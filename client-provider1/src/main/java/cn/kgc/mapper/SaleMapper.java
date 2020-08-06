package cn.kgc.mapper;

import cn.kgc.vo.Sale;

import java.util.List;

public interface SaleMapper {

int insertSale(Sale sale);


List<Sale> selectSale(Sale sale);

}
