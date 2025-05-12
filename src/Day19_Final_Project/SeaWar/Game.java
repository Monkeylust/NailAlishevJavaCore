package Day19_Final_Project.SeaWar;

public class Game {
    public static void main(String[] args) {
        Board board = new Board(10);
        //board.print();
        Ship ship = new Ship(Ship.Deck.THREE);
        board.addShip(new Coordinate(1, 9), ship, Orientation.VER);
        board.print();
        board.addShip(new Coordinate(2, 9), ship, Orientation.VER);
        board.print();
    }


}