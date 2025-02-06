import java.util.Scanner;

public class Todolist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String allTasks = "";

        while (flag) {
            System.out.print("Enter your tasks (type 'Done' to finish): ");
            String todo = scanner.nextLine();

            if (todo.equalsIgnoreCase("Done")) {
                flag = false;
                System.out.println("\nThis is your to-do list: ");
                System.out.println(allTasks);
            } else {
                allTasks += "- " + todo + "\n";
                System.out.println("Task Added:");
            }
        }

        scanner.close();
    }
}
