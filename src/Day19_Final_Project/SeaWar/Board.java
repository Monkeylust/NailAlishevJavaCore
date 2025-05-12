package Day19_Final_Project.SeaWar;

public class Board {
    private final Field[][] gameBoard;

    public Board(int size) {
        Field[][] gameBoard = new Field[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameBoard[i][j] = Field.EMPTY;
            }
        }
        this.gameBoard = gameBoard;
    }

    public Field[][] getGameBoard() {
        return gameBoard;
    }

    public void print() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j].getView());
            }
            System.out.println();
        }
        System.out.println();
    }

    public void addShip(Coordinate coordinate, Ship ship, Orientation or) {
        int y = coordinate.getY();
        int x = coordinate.getX();
        int countDeck = ship.getCountDeck().getValue();

        EXIT:
        switch (or) {
            case HOR:
                if (!checkFieldHor(y, x, countDeck)) {
                    break;
                }
                for (int i = 0; i < countDeck; i++) {
                    gameBoard[y][x + i] = Field.SHIP;
                }
                break;
            case VER:
                if (!checkFieldVer(y, x, countDeck)) {
                    break;
                }
                for (int i = 0; i < countDeck; i++) {
                    gameBoard[y + i][x] = Field.SHIP;
                }
                break;
        }
    }

    public boolean checkFieldHor(int y, int x, int countDeck) {
        if (y + countDeck > gameBoard.length - 1) {
            System.out.println("Ошибка, вы вышли за границы доски.");
            return false;
        }
        for (int i = 0; i < countDeck; i++) {
            if (!gameBoard[y][x + i].equals(Field.EMPTY)) {
                System.out.println("Ошибка, ячейка занята.");
                return false;
            }
        }
        return true;
    }

    public boolean checkFieldVer(int y, int x, int countDeck) {
        if (y + countDeck > gameBoard.length - 1) {
            System.out.println("Ошибка, вы вышли за границы доски.");
            return false;
        }
        for (int i = 0; i < countDeck; i++) {
            if (!gameBoard[y + i][x].equals(Field.EMPTY)) {
                System.out.println("Ошибка, ячейка занята.");
                return false;
            }
        }
        return true;
    }
}