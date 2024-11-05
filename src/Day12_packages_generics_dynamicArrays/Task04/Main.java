package Day12_packages_generics_dynamicArrays.Task04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listMetallica = new ArrayList<>();
        listMetallica.add("Джеймс Хетфилд");
        listMetallica.add("Ларс Ульрих");
        listMetallica.add("Кирк Хэмметт");
        listMetallica.add("Роберт Трухильо");
        MusicBand objectMetallica = new MusicBand("Metallica", 1981, listMetallica);

        List<String> listMegadeth = new ArrayList<>();
        listMegadeth.add("Дэйв Мастейн");
        listMegadeth.add("Джеймс Ломенцо");
        listMegadeth.add("Дирк Вербурен");
        listMegadeth.add("Теему Мянтисаари");
        MusicBand objectMegadeth = new MusicBand("Megadeth", 1983, listMegadeth);

        //-----------------------Статический------------------------//
        MusicBand.transferMembers1(objectMegadeth, objectMetallica);
        objectMetallica.printMembers();
        objectMegadeth.printMembers();
        //-------------------------------------------------------------//

        // логика такова, что нужно расскомментировать либо верхний блок либо нижний
        // впротивном случае перезаписываются ArrayList ы
        // в них показаны разные методы ввержу статический, внизу нет.

        //--------------------------Нестатический---------------------//
//        objectMetallica.transferMembers2(objectMegadeth);
//        objectMetallica.printMembers();
//        objectMegadeth.printMembers();
        //-------------------------------------------------------------//
    }
}