package Day12_packages_generics_dynamicArrays.Task05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MusicArtist metallica1 = new MusicArtist("Джеймс Хетфилд", 40);
        MusicArtist metallica2 = new MusicArtist("Ларс Ульрих", 41);
        MusicArtist metallica3 = new MusicArtist("Кирк Хэмметт", 42);
        MusicArtist metallica4 = new MusicArtist("Роберт Трухильо", 43);

        List<MusicArtist> musicArtistsMetallica = new ArrayList<>();
        musicArtistsMetallica.add(metallica1);
        musicArtistsMetallica.add(metallica2);
        musicArtistsMetallica.add(metallica3);
        musicArtistsMetallica.add(metallica4);

        MusicBand metallica = new MusicBand("Metallica", 1981, musicArtistsMetallica);

        //Вторая группа как создали в решении, объект сразу создавали и добавляли в список
        List<MusicArtist> musicArtistsMegadeth = new ArrayList<>();
        musicArtistsMegadeth.add(new MusicArtist("Дэйв Мастейн", 40));
        musicArtistsMegadeth.add(new MusicArtist("Джеймс Ломенцо", 41));
        musicArtistsMegadeth.add(new MusicArtist("Дирк Вербурен", 42));
        musicArtistsMegadeth.add(new MusicArtist("Теему Мянтисаари", 43));

        MusicBand megadeth = new MusicBand("Megadeth", 1983, musicArtistsMegadeth);

        metallica.printMembers();
        megadeth.printMembers();

        MusicBand.transferMembers1(metallica, megadeth);

        metallica.printMembers();
        megadeth.printMembers();
    }
}