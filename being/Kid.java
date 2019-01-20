package being;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class Kid extends Being{

 
  private String kid_birthday;
  private List<Product> kid_list_of_purchased_products = new ArrayList<Product>();
  String kid_place_of_birth;

  

  public Kid(int kid_code, String kid_birthday, String kid_name, List<Product> kid_list_of_purchased_products, String kid_place_of_birth){
	super(kid_code, kid_name);
    this.kid_birthday = kid_birthday;
    this.kid_list_of_purchased_products = kid_list_of_purchased_products;
    this.kid_place_of_birth = kid_place_of_birth;

  }

  

  public String get_Kid_Birtday(){
    return this.kid_birthday;
  }

  public void set_Kid_Birthday(String kid_birthday){
    this.kid_birthday = kid_birthday;
  }

  public List<Product> get_Kid_List_of_purchased_products(){
    return this.kid_list_of_purchased_products;
  }

  public void set_Kid_List_of_purchased_products(List<Product> kid_list_of_purchased_products){
    this.kid_list_of_purchased_products = kid_list_of_purchased_products;
  }

  public String get_Kid_Place_of_birth(){
    return this.kid_place_of_birth;
  }

  public void set_Kid_Place_of_birth(String kid_place_of_birth){
    this.kid_place_of_birth = kid_place_of_birth;
  }

  public void add_PurchasedProduct(Product product)
  {
    if(kid_list_of_purchased_products==null)
      this.kid_list_of_purchased_products=new ArrayList<Product>();

    this.kid_list_of_purchased_products.add(product);
  }

}
