package model;

 public class Product{

   private String description;
   private Long barcode;
   private String serialNumber;
   private GoldenTicket prizeTicket;


   public Product(){}

   public Product(String description, Long barcode, String serialNumber, GoldenTicket prizeTicket){
     this.description = description;
     this.barcode = barcode;
     this.serialNumber = serialNumber;
     this.prizeTicket = prizeTicket;
   }

   public String get_Description(){
     return description;
   }

   public void set_Description(String description){
     this.description = description;
   }

   public Long get_Barcode(){
     return barcode;
   }

   public void set_Barcode(Long barcode){
     this.barcode = barcode;
   }

   public String get_Serial_Number(){
     return serialNumber;
   }

   public void set_Serial_Number(String serialNumber){
     this.serialNumber = serialNumber;
   }

   public GoldenTicket get_PrizeTicket(){
     return prizeTicket;
   }

   public void set_PrizeTicket(GoldenTicket prizeTicket){
     this.prizeTicket = prizeTicket;
   }

 }
