package Day19_Final_Project.SeaWar;

public class Game {
    public static void main(String[] args) {
        Board board = new Board(10);
        //board.print();
        Ship ship = new Ship(Ship.Deck.TWO);
        board.addShip(new Coordinate(5, 5), ship, Orientation.HOR);
        board.print();
        //board.addShip(new Coordinate(2, 9), ship, Orientation.VER);
        //board.print();
//        board.attack(new Coordinate(5,6));
//        board.print();
        board.attack(new Coordinate(1,5));
        board.print();
    }


}