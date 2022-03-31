
package another.project;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerOrder {

        public String tablecode;
        public String time;
        public String name;
        public String phone;
        int i;
        ArrayList<AddFoodForMenu> EatList = new ArrayList<AddFoodForMenu>();
        public float Totalpayment;



        public String getTablecode() {
            return tablecode;
        }
        public void setEatList(AddFoodForMenu food) {
            EatList.add(food);
        }
        public void setTime(String time) {
             this.time=time ;
        }
        public void setName(String name){
            this.name=name;
        }
        public void setPhone(String phone){
            this.phone=phone;
        }
        public void setTotalpayment(float Totalpayment) {
            this.Totalpayment=Totalpayment;
        }

        public void input() {
        System.out.println();
        for ( i = 0; i < 35; i++)
        {
            System.out.print("=");
        }

        System.out.print(" ORDER FOOD ");

        for ( i = 0; i < 35; i++)
        {
            System.out.print("=");
        }
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Choice Table & Enter Table Code(Ex: Table-1): ");
        tablecode = input.nextLine();
        System.out.print("Enter Time For Booking(Ex: 2.30 Pm): ");
        time=input.nextLine();
        System.out.print("Enter Your Name: ");
        name= input.nextLine();
        System.out.print("Enter Your Phone Number: ");
        phone= input.nextLine();

    }

        public void print() {
            System.out.println("Customer Name: "+this.name);
            System.out.println("Customer Phone Number: "+this.phone);
            System.out.println("Table Code: "+this.tablecode);
            System.out.println("Total Payment: "+this.Totalpayment);
            System.out.println("Booking Time: "+this.time);
            System.out.println("Total Payment: "+this.Totalpayment);
            System.out.println();
        }

    }
