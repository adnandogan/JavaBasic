package being;

public class OompaLoompa extends Being{

  
  private int loompa_height;
  private String loompa_favorite_food;


  

  public OompaLoompa(int loompa_code, String loompa_name, int loompa_height, String loompa_favorite_food){
    super(loompa_code,loompa_name);
    this.loompa_height = loompa_height;
    this.loompa_favorite_food = loompa_favorite_food;
  }

  public int get_Loompa_Height(){
    return loompa_height;
  }

  public void set_Loompa_height(int loompa_height){
    this.loompa_height = loompa_height;
  }

  public String get_Loompa_Favorite_Food(){
    return loompa_favorite_food;
  }

  public void set_Loompa_Favorite_Food(String loompa_favorite_food){
    this.loompa_favorite_food = loompa_favorite_food;
  }

}
