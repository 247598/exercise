package exercise2;

//public class Main {
//
//	public Main() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

//Driver class

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        manager.addObserver(new ConsoleObserver());

        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("\nOptions: add / view / exit");
            System.out.print("Enter option: ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("add")) {
                System.out.print("Task type (exercise/eat/work): ");
                String type = sc.nextLine();

                System.out.print("Time (HH:MM): ");
                String time = sc.nextLine();

                Task task = TaskFactory.createTask(type, time);
                if (task != null) {
                    manager.addTask(task);
                } else {
                    System.out.println("Invalid task type.");
                }

            } else if (input.equalsIgnoreCase("view")) {
                manager.viewTasks();

            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}
