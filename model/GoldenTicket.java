package model;

import java.util.Date;

public class GoldenTicket{


  private String ticket_code;
  private Date raffled;

  public GoldenTicket(){}

  public GoldenTicket(String ticket_code, Date raffled){
    this.ticket_code = ticket_code;
    this.raffled = raffled;
  }

  public String get_Ticket_Code(){
    return ticket_code;
  }

  public void set_Ticket_Code(String ticket_code){
    this.ticket_code = ticket_code;
  }

  public Date get_Raffled(){
    return raffled;
  }

  public void set_Raffled(Date raffled){
    this.raffled = raffled;
  }

  public Boolean isRaffled(){

    Date currentDate = new Date();
    return currentDate.after(this.raffled);
  }

}
