package cn.kgc.vo;


import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

  private Integer id;
  private String username;
  private String password;
  private String realname;
  private List<Sale> saleList;

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", realname='" + realname + '\'' +
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


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }

}
