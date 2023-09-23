public class GameField {
    private int[][] field = new int[3][3];
    private final int field_width =3;
    private final int field_height = 3;
    private int num_step;
    private final int max_num_step = 9;
    public GameField(){
        for(int i=0;i<field_width;i++){
            for (int y=0;y<field_height;y++){
                field[y][i] = 0;
            }
        }
        num_step=0;
    }
    public void print_field(){
        System.out.print("\n");
        System.out.println("  0 1 2");
        for (int i = 0; i < field_width; i++) {
            System.out.print(i + " ");
            for (int y = 0; y < field_height; y++) {
                if (field[y][i] == 1) {
                    System.out.print("X");
                } else if (field[y][i] == 2) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
                if (y < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -+-+-");
            }
        }
        System.out.println();
    }
    public Boolean check_field(Player X, Player O){
        for(int y=0;y < field_height;y++){
            if(field[y][0]==1 && field[y][1]==1 && field[y][2]==1){
                System.out.println("Игрок " + X.getName() + " Выиграл!!");
                return true;
            } else if (field[y][0]==2 && field[y][1]==2 && field[y][2]==2) {
                System.out.println("Игрок " + O.getName() + " Выиграл!!");
                return true;
            }
        }
        for(int i=0; i < field_width;i++) {
            if(field[0][i]==1 && field[1][i]==1 && field[2][i]==1){
                System.out.println("Player " + X.getName() + " Выиграл!!");
                return true;
            } else if (field[0][i]==2 && field[1][i]==2 && field[2][i]==2) {
                System.out.println("Игрок " + O.getName() + " Выиграл!!");
                return true;
            }
        }
        if(field[0][0]==1 && field[1][1]==1 && field[2][2]==1){
            System.out.println("Player " + X.getName() + " Выиграл!!");
            return true;
        } else if (field[0][0]==2 && field[1][1]==2 && field[2][2]==2) {
            System.out.println("Игрок " + O.getName() + " Выиграл!!");
            return true;
        }else if (field[0][2]==1 && field[1][1]==1 && field[2][0]==1) {
            System.out.println("Player " + X.getName() + " Выиграл!!");
            return true;
        }else if (field[0][2]==2 && field[1][1]==2 && field[2][0]==2) {
            System.out.println("Игрок " + O.getName() + " Выиграл!!");
            return true;
        } else if (num_step==max_num_step) {
            System.out.println("Нет победителя");
        }
        return false;
    }
    public void step(Player player){
        int[] mas = player.move();
        if(field[mas[0]][mas[1]]==0) {
            field[mas[0]][mas[1]] = player.getSide();
        }
        else{
            step(player);
        }
    }
    public int getNum_step() {
        return num_step;
    }
    public void setNum_step(int num_step) {
        this.num_step = num_step;
    }
    public void increaseNum_step() {
        this.num_step++;
    }

    public int getMax_num_step() {
        return max_num_step;
    }
}
