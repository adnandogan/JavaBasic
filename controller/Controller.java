package controller;

import being.Kid;
import being.OompaLoompa;
import model.GoldenTicket;
import model.Product;
import song.OompaLoompaSong;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class Controller
{
    List<Kid> kids = new ArrayList<Kid>();
    List<OompaLoompa> oompaLoompas = new ArrayList<OompaLoompa>();
    List<Product> products = new ArrayList<Product>();
    List<Product> purchased_Products=new ArrayList<Product>();


    public Controller()
    {
        Kid adnan = new Kid(111, "Adnan", "10/13/1980", null, "Adana");
        kids.add(adnan);

        Kid adnan1 = new Kid(222, "Adnan1", "01/08/1973", null, "Merkez");
        kids.add(adnan1);

        Kid adnan2 = new Kid(333, "Adnan2", "05/01/1992", null, "Patliyor");
        kids.add(adnan2);

        Product milk = new Product("milk", (long) 123456, "243", null);
        products.add(milk);

        Product milk1 = new Product("milk1", (long) 12345, "43566", null);
        products.add(milk1);

        Product milk2 = new Product("milk2", (long) 1114, "681880", null);
        products.add(milk2);

        Product lollipop = new Product("lollipop", (long) 32670, "466565", null);
        products.add(lollipop);

        Product lollipop1 = new Product("lollipop1", (long) 6710, "345434534", null);
        products.add(lollipop1);

        OompaLoompa oompaLoompa1 = new OompaLoompa(11111, "oompa1", 145, "app1");
        oompaLoompas.add(oompaLoompa1);

        OompaLoompa oompaLoompa2 = new OompaLoompa(22222, "oompa2", 135, "app2");
        oompaLoompas.add(oompaLoompa2);

        OompaLoompa oompaLoompa3 = new OompaLoompa(33333, "oompa3", 123, "app3");
        oompaLoompas.add(oompaLoompa3);
    }
	
    public void Register_Prize(){
        Scanner input = new Scanner(System.in);
        String serialNumber = "";

            System.out.println("Type the serial number of the product you want to insert ticket");
            serialNumber = input.nextLine();
		for (int i = 0; i < products.size(); ++i){
            if (products.get(i).get_Serial_Number().equals(serialNumber)){
                    Date date = new Date();
					String code = serialNumber;
					GoldenTicket goldenTicket = new GoldenTicket(code, date);
					products.get(i).set_PrizeTicket(goldenTicket);
            }
        }
    }
    public void List_All_Prize_Tickets(){
        System.out.println("Listing All Prize Tickets..");
        for (int i = 0; i < products.size(); ++i){
            System.out.println(products.get(i).get_Serial_Number()+ "\n");
            if (products.get(i).get_PrizeTicket() != null){
                System.out.println("It contains Golden Ticket!");
			}
            else if 
			(products.get(i).get_PrizeTicket() == null)
             System.out.println("Not a Golden Ticket!");
			
        }
    }
    public void List_Only_Raffled_Tickets(){
        System.out.println("Listing Raffled Tickets");

        for (int i = 0; i < products.size(); ++i)
        {
            if (products.get(i).get_PrizeTicket()!=null && products.get(i).get_PrizeTicket().isRaffled())
                System.out.println("Ticket code: " + products.get(i).get_PrizeTicket().get_Ticket_Code());
        }
    }
    public void Create_OompaLoompa_Song(){

        OompaLoompaSong song = new OompaLoompaSong(4);
        System.out.println(song.sing());
    }


    public void Register_Beings(){
        System.out.println("Registering Beings...\nPress k to register kid, press o to register oompa loompas");
        Scanner input = new Scanner(System.in);

        char choice = input.next().charAt(0);

        if(choice=='k'){
            String kid_birthday = "";

            int kid_code;
            String kid_place_Of_Birth = "";

            System.out.println("Type the code for the kid: ");
            kid_code = input.nextInt();

            input.nextLine();

            System.out.println("Type the name: ");
            String kid_name = input.nextLine();
            System.out.println("Type birthday (dd/MM/yyyy): ");
            kid_birthday = input.nextLine();
            System.out.println("Type the birth place: ");
            kid_place_Of_Birth = input.nextLine();
            Kid kid = new Kid(kid_code, kid_birthday, kid_name,  null, kid_place_Of_Birth);
            kids.add(kid);
        }

        else if(choice=='o'){
            Scanner inputt = new Scanner(System.in);

            int loompa_code;
            String loompa_name = "";
            int loompa_height;
            String loompa_favorite_food = "";

            System.out.println("Type code: ");
            loompa_code = inputt.nextInt();
            inputt.nextLine();
            System.out.println("Type the name: ");
            loompa_name = inputt.nextLine();
            System.out.println("Type the height: ");
            loompa_height = inputt.nextInt();
            inputt.nextLine();
            System.out.println("Type the favorite food: ");
            loompa_favorite_food = inputt.nextLine();
            OompaLoompa oompaLoompa = new OompaLoompa(loompa_code, loompa_name, loompa_height, loompa_favorite_food);
            oompaLoompas.add(oompaLoompa);
        }
    }


    public void Register_Products(){
        Scanner input = new Scanner(System.in);

        String description = "";
        long barcode;
        String serialNumber = "";

            System.out.println("Type the description: ");
            description = input.nextLine();

            System.out.println("Type the barcode: ");
            barcode = input.nextLong();
            input.nextLine();

            System.out.println("Type the serial number: ");
            serialNumber = input.nextLine();

            Product product = new Product(description, barcode, serialNumber, null);
            products.add(product);

    }



    public void Ruffle_Tickets(){

        Random rIndex = new Random();
        int rtIndex;
        Scanner input = new Scanner(System.in);
            Date ruffleDate = new Date();
            String code = input.nextLine();
            GoldenTicket goldenTicket = new GoldenTicket(code, ruffleDate);
            rtIndex = rIndex.nextInt(products.size());
            while(products.get(rtIndex).get_PrizeTicket()!= null && products.get(rtIndex).get_PrizeTicket().isRaffled())
				rtIndex = rIndex.nextInt(products.size());
	   
            products.get(rtIndex).set_PrizeTicket(goldenTicket);

    }
    public void Register_Sale(){
        System.out.println("Register Sale..\nEnter the code:");
        int userCode = 123;
        Scanner input = new Scanner(System.in);
        int kidsCode=input.nextInt();
        System.out.println("Type user code to proceed: ");
        int userCodeInput = input.nextInt();

        if (userCodeInput == userCode)
        {
            for (int i = 0; i < kids.size(); ++i)
            {
                if (kids.get(i).get_Code() == kidsCode)
                {
                    System.out.println("Type product barcode: ");
                    long barcode = input.nextLong();
                    int rPIndex = 0;

                    Random rIndex = new Random();
                    while (products.get(rPIndex).get_Barcode() != barcode)
                    {
                        rPIndex = rIndex.nextInt(products.size() - 1);
                    }
                    kids.get(i).add_PurchasedProduct(products.get(rPIndex));
                    products.remove(rPIndex);
                    break;
                }
            }
        }
    }
    public void List_Winners() {

        if(kids!=null)
        {
            for (int i = 0; i < kids.size(); ++i)
            {
                purchased_Products = kids.get(i).get_Kid_List_of_purchased_products();

                if(purchased_Products!=null && purchased_Products.size()!=0)
                {
                    for (int j = 0; j < kids.get(i).get_Kid_List_of_purchased_products().size(); ++j)
                    {
                        if (purchased_Products.get(j).get_PrizeTicket() != null)
                        {
                            System.out.println(kids.get(i).get_Code());
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

}
