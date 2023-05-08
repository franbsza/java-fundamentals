package loops;

import java.util.Scanner;

public class Agenda {
    public static void start(){
        String[][] appointments = new String[30][24];

        Scanner scanner = new Scanner(System.in);

        do{

            int operation = 0;
            int day = 0;
            int hour = 0;

            System.out.println("Type 1 to search or 2 to insert/update: ");
            operation = scanner.nextInt();
            System.out.println("Indicate the date and time of the appointment: ");
            day = scanner.nextInt();
            hour = scanner.nextInt();

            if(operation == 2){
                System.out.println("Enter the appointment description: ");
                scanner.nextLine();
                String description = scanner.next();

                appointments[day][hour] = description;
                System.out.println("Appointment Scheduled!");
            }
            else{
                System.out.println("Your appointment: ");
                System.out.println(appointments[day][hour]);
            }


        }while(true);
    }

    public static void main(String[] args){
        start();
    }
}
