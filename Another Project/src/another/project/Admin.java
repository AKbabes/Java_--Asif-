
package another.project;
import java.util.Scanner;

public class Admin {
int i;

    public void Password()
    {
        String password = "1234";
        String pass;
        Scanner input = new Scanner(System.in);

        for (i = 0; i < 30; i++)
        {
            System.out.print("*");
        }

        System.out.print(" PASSWORD PROTECTED ");

        for (i = 0; i < 30; i++)
        {
            System.out.print("*");
        }

        System.out.print("\n\n\t\t\t\t\t\t\t   Enter Password: ");

        pass = input.nextLine();

        if (pass.equals(password))
        {
            System.out.println("\t\t\t\t\t\t\tPassword Match Successfully");
        }
        else
        {
            System.out.println("\t\t\t\tWarning!! Incorrect Password. Enter Correct Password.\n\n");
            Password();
        }
    }

    public void Mainmenu() {

        System.out.println();
        for (i = 0; i < 21; i++)
        {
            System.out.print("=");
        }

        System.out.print(" WELCOME TO RESTAURANT SERVICE SYSTEM ");

        for (i = 0; i < 21; i++)
        {
            System.out.print("=");
        }

        System.out.println();
        System.out.println("1. FOOD MANAGEMENT (Add Food For Menu)");
        System.out.println("2. ORDER MANAGEMENT(Food Order)");
        System.out.println("3. EXIT");
    }

    public void ManageFoodMenu() {
        System.out.println();
        for ( i = 0; i < 31; i++)
        {
            System.out.print("=");
        }

        System.out.print(" MANAGE FOOD MENU ");

        for ( i = 0; i < 31; i++)
        {
            System.out.print("=");
        }

        System.out.println();
        System.out.println("1. Add Food");
        System.out.println("2. Menu List");
        System.out.println("3. Edit Food");
        System.out.println("4. Delete Food");
        System.out.println("5. Order Information");
        System.out.println("6. Payment Information");
        System.out.println("0. Return Main Menu");
    }

    public void MenuOrder() {
        System.out.println();
        for ( i = 0; i < 30; i++)
        {
            System.out.print("=");
        }

        System.out.print(" MANAGE ORDER MENU ");

        for ( i = 0; i < 30; i++)
        {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("1. Menu List");
        System.out.println("2. Order Food");
        System.out.println("0. Return Main Menu");

    }

    public void AllSeats() {
            int i;
            System.out.println();
            for ( i = 0; i < 81; i++)
            {
                System.out.print("-");
            }
        System.out.println();
            System.out.println("\t\t\t\t\t\t\t\tALL SEATS ");

            System.out.println("\t\t\t\t\t    Table-1\t\tTable-2\t\tTable-3");
            System.out.println("\t\t\t\t\t    Table-4\t\tTable-5\t\tTable-6");
            System.out.println("\t\t\t\t\t    Table-7\t\tTable-8\t\tTable-9");
            System.out.println("\t\t\t\t\t   Table-10\t\tTable-11\tTable-12");
            System.out.println("\t\t\t\t\t    ##### Each Table Contain Four Members #####");
        for ( i = 0; i < 81; i++)
        {
            System.out.print("-");
        }
        }
}
