package cn.kgc.controller;

import cn.kgc.service.SaleService;
import cn.kgc.vo.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping("/sale")
@RestController
public class SaleController {
    @Autowired
    private SaleService saleService;
    @RequestMapping(value = "/sale.do",method = RequestMethod.POST)
    public Map<String,Object> saleProduct(@RequestBody Sale sale){
        return saleService.saleProduct(sale);
    }

    @RequestMapping(value = "/find.do",method = RequestMethod.GET)
    public List<Sale> selectSale(Sale sale) {
        return saleService.selectSale(sale);
    }
}
