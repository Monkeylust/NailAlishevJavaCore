package Day12_packages_generics_dynamicArrays.Task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Metallica", 1981);
        MusicBand band2 = new MusicBand("Serebro", 2006);
        MusicBand band3 = new MusicBand("Megadeth", 1983);
        MusicBand band4 = new MusicBand("Tokio Hotel", 2001);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);

        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand band : musicBands) {
            if (band.getYear() > 2000) {
                groupsAfter2000.add(band);
            }
        }
        System.out.println(groupsAfter2000);
    }
}