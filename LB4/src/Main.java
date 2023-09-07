import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Db db = new Db();
        Scanner scanner=new Scanner(System.in);
        String name = scanner.nextLine(), password= scanner.nextLine();
        if(db.check_user_and_pas(name,password)){
            System.out.println("Авторизация выполнена");
        }
        else System.out.println("Авторизация не выполнена");
        db.close();
        scanner.close();
    }
}