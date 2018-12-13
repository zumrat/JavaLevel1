import java.util.Scanner;
import java.util.Random;
public class Java1Lesson4 {
    /*
     *поле
     * ввод координат
     * x-o
     * игроки/ИИ
     *проверка пустоты/ попадания в поле
     *проверка конца игры
     *вывод поля на экран
     */
    public static final char HUMAN_DOT = 'X';
    public static final char AI_DOT = 'O';
    public static final char EMPTY_DOT = '_';
    public static final Scanner in = new Scanner(System.in);
    public static final Random rnd = new Random();

    public static int fieldSizeY;
    public static int fieldSizeX;
    public static char[][] field;

    public static void initField() {
        fieldSizeX = 3;
        fieldSizeY = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = EMPTY_DOT;

            }
        }
    }

    public static void printField() {
        System.out.println("_y_y_y_");
        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print("x");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter coordinates X and Y() separated by space: ");
            x = in.nextInt() - 1;
            y = in.nextInt() - 1;
        } while (!isEmptyCell(x, y) || !isValidCell(x, y));
        field[y][x] = HUMAN_DOT;
    }

    public static boolean isEmptyCell(int x, int y) {
        return field[y][x] == EMPTY_DOT;
    }

    public static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rnd.nextInt(fieldSizeX);
            y = rnd.nextInt(fieldSizeY);
        }
        while (!isEmptyCell(x, y));
        field[y][x] = AI_DOT;
    }

    public static boolean isFieldFull() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == EMPTY_DOT)
                    return false;
            }
        }
        return true;
    }
    public static boolean checkWin(char c){
        for (int x=0;x <fieldSizeX;x=x+2){
            for (int y = 0; y < fieldSizeY; y=y+2) {
                if (field[x][y]==c && field[x][y+1]==c && field[x][y+2]==c) return true;
                if (field[x+1][y]==c && field[x+1][y+1]==c && field[x+1][y+2]==c) return true;
                if (field[x+2][y]==c && field[x+2][y+1]==c && field[x+2][y+2]==c) return true;

                if (field[x][y]==c && field[x+1][y]==c && field[x+2][y]==c) return true;
                if (field[x][y+1]==c && field[x+1][y+1]==c && field[x+2][y+1]==c) return true;
                if (field[x][y+2]==c && field[x+1][y+2]==c && field[x+2][y+2]==c) return true;

                if (field[x][y]==c && field[x+1][y+1]==c && field[x+2][y+2]==c) return true;
                if (field[x][y+2]==c && field[x+1][y+1]==c && field[x+2][y]==c) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        initField();
        printField();
        while (true) {
            while (true) {
                humanTurn();
                printField();
                if (checkWin(HUMAN_DOT)) {
                    System.out.println("Player wins!");
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("Draw!");
                    break;
                }
                aiTurn();
                printField();
                if (checkWin(AI_DOT)) {
                    System.out.println("AI wins!");
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("Draw!");
                    break;
                }
            }
            System.out.println("Do you want to play again? Press 1 if yes");
            int repeat;
            repeat = in.nextInt();
            if (repeat != 1) break;
        }
    }
}