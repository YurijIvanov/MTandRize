import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Db db = new Db();
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.println("Игрок X ходит первым: ");
            Player X = new Player(1);
            System.out.println("Введите имя игрока X: ");
            X.setName(scanner.nextLine());
            System.out.println("Введите пароль игрока X: ");
            X.setPassword(scanner.nextLine());
            System.out.println();
            if (db.check_user_and_pas(X.getName(), X.getPassword())) {
                Player O = new Player(2);
                System.out.println("Введите имя игрока O: ");
                O.setName(scanner.nextLine());
                System.out.println("Введите пароль игрока O: ");
                O.setPassword(scanner.nextLine());
                System.out.println();
                if (db.check_user_and_pas(O.getName(), O.getPassword())) {
                    GameField field = new GameField();
                    field.print_field();
                    while (field.getNum_step() != field.getMax_num_step()) {
                        if (field.getNum_step() == 8) {
                            System.out.print("");
                        }
                        field.step(X);
                        field.print_field();
                        if (field.check_field(X, O)) {
                            break;
                        }
                        field.increaseNum_step();
                        field.step(O);
                        field.print_field();
                        if (field.check_field(X, O)) {
                            break;
                        }
                        field.increaseNum_step();
                    }
                }else{
                    System.out.println("Ошибка в пароле или имени игрока O.\nПродолжить? - y/n");
                    if(scanner.nextLine().indexOf("n")!=-1){
                        break;
                    }
                }
            } else{
                System.out.println("Ошибка в пароле или имени игрока X.\nПродолжить? - y/n");
                if(scanner.nextLine().indexOf("n")!=-1){
                    break;
                }
            }
        }
        db.close();
        scanner.close();
    }
}