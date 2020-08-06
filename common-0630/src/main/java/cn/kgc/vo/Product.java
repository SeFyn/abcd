package cn.kgc.vo;


import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {

  private Integer id;
  private String productname;
  private Integer quantity;
  private List<Sale> saleList;

  @Override
  public String toString() {
    return "Product{" +
            "id=" + id +
            ", productname='" + productname + '\'' +
            ", quantity=" + quantity +
            ", saleList=" + saleList +
            '}';
  }

  public List<Sale> getSaleList() {
    return saleList;
  }

  public void setSaleList(List<Sale> saleList) {
    this.saleList = saleList;
  }




  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getProductname() {
    return productname;
  }

  public void setProductname(String productname) {
    this.productname = productname;
  }


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

}
