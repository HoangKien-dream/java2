package book;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        generateMenu();
    }
    public static void addContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your phone: ");
        String phone = scanner.nextLine();
        Contact contact = new Contact(name,phone);
        save(contact);
    }
    public static void display(){
        Contact contact = new Contact();
        System.out.println("Address Book");
        System.out.printf("Name: %s,", contact.getContactName());
        System.out.printf("Phone: %s", contact.getPhone());
    }
    public static boolean save(Contact contact){
        HashMap<String, Contact> hashMap = new HashMap<>();
        hashMap.put("A001",contact);
              return true;
    }

    public static void generateMenu(){
        {
            while (true){
                System.out.printf("Address Book\n");
                System.out.printf("--------------------\n");
                System.out.printf("1. Create new Contact.\n");
                System.out.printf("2. Find a contact by name.\n");;
                System.out.printf("3. Display contacts \n");
                System.out.printf("4. Exit program\n");
                System.out.printf("--------------------\n");
                System.out.printf("Please enter your choice (1-4): \n");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice){
                    case 1:
                        addContact();
                        break;
                    case 2:
                        display();
                        break;
                    case 3:
                        System.out.println("s");
                        break;
                    case 4:
                        System.out.println("Exit program");
                        break;
                    default:
                        System.out.printf("Please choice again (1-4)");
                        break;
                }
                scanner.nextLine();
                if (choice == 4){
                    break;
                }
            }
        }
    }
}

