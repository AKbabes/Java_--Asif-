package another.project;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<AddFoodForMenu> menulist = new ArrayList<>();

        int select1, select2, select3;
        Scanner input = new Scanner(System.in);
        Admin adminobj = new Admin();
        ManageFood managefoodobj = new ManageFood();
        adminobj.Password();
        
        do {
            adminobj.Mainmenu();
            System.out.print("Please Enter Your Choice: ");
            select1 = input.nextInt();

            switch (select1) {
                case 1:
                    do {
                        adminobj.ManageFoodMenu();
                        System.out.print("Please Enter Your Choice: ");
                        select2 = input.nextInt();
                        switch (select2) {
                            case 1:
                                managefoodobj.add();
                                break;
                            case 2:
                                managefoodobj.Print();
                                break;
                            case 3:
                                managefoodobj.Print();
                                managefoodobj.EditFood();
                                break;
                            case 4:
                                managefoodobj.Print();
                                managefoodobj.DeleteFood();
                                break;
                            case 5:
                                managefoodobj.PrintOrder();
                                break;
                            case 6:
                                managefoodobj.Search();
                                break;
                            case 0:
                                System.out.println("Back to the Menu");
                                break;
                            default:
                                break;
                        }
                    } while (select2 != 0);
                    break;
                case 2:

                    do {
                        adminobj.MenuOrder();
                        System.out.print("Please Enter Your Choice: ");
                        select3 = input.nextInt();
                        switch (select3) {
                            case 1:
                                managefoodobj.Print();
                                break;
                            case 2:
                                adminobj.AllSeats();
                                managefoodobj.Price();
                                break;
                            case 0:
                                System.out.println("Back to the Menu");
                                break;
                            default:
                                break;
                        }
                    } while (select3 != 0);
                    break;

                default:
                    break;
            }
        } while (select1 != 0);


    }

}