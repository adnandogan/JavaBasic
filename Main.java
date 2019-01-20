import controller.Controller;

import java.util.Scanner;
import being.Kid;
import being.OompaLoompa;
import model.GoldenTicket;
import model.Product;
import song.OompaLoompaSong;


public class Main{
	
	

  public static void main(String[] args) {

    Controller cntr = new Controller();
    Scanner sc = new Scanner(System.in);

    int option = 0;


    do{

      System.out.println(" \n\n\n\n\n\n\n\n Press 1 for Registering prize tickets"
                        + "\n Press 2 for Listing all prize tickets"
                        + "\n Press 3 for Listing only raffled tickets"
                        + "\n Press 4 for Creating new OompaLoompa song"
                        + "\n Press 5 for Registering Beings"
                        + "\n Press 6 for Registering Products"
                        + "\n Press 7 for Ruffling tickets"
                        + "\n Press 8 for Registering sales"
                        + "\n Press 9 for Listing winner \n"
                        + "\n Press 0 to exit \n");



    option = sc.nextInt();

    switch(option){

      case 1:
        cntr.Register_Prize();
        break;
      case 2:
          cntr.List_All_Prize_Tickets();
        break;
      case 3:
          cntr.List_Only_Raffled_Tickets();
        break;
      case 4:
          cntr.Create_OompaLoompa_Song();
        break;
      case 5:
          cntr.Register_Beings();
        break;
      case 6:
          cntr.Register_Products();
        break;
      case 7:
          cntr.Ruffle_Tickets();
       break;
      case 8:
          cntr.Register_Sale();
       break;
      case 9:
          cntr.List_Winners();
       break;
      case 0:
       break;
       default:
          System.out.println("Wrong option");
        }

    }while(option != 0);

  }
}
