package cn.kgc.vo;


import java.io.Serializable;

public class Sale implements Serializable {

  private Integer id;
  private double price;
  private Integer quantity;
  private String saledate;
  private Integer userid;
  private Integer productid;
  private User user;
  private Product product;

  @Override
  public String toString() {
    return "Sale{" +
            "id=" + id +
            ", price=" + price +
            ", quantity=" + quantity +
            ", saledate='" + saledate + '\'' +
            ", userid=" + userid +
            ", productid=" + productid +
            ", user=" + user +
            ", product=" + product +
            '}';
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public String getSaledate() {
    return saledate;
  }

  public void setSaledate(String saledate) {
    this.saledate = saledate;
  }


  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }


  public Integer getProductid() {
    return productid;
  }

  public void setProductid(Integer productid) {
    this.productid = productid;
  }

}
