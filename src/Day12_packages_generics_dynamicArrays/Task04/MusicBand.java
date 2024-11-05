package Day12_packages_generics_dynamicArrays.Task04;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> groupMember;

    public MusicBand(String name, int year, List<String> groupMember) {
        this.name = name;
        this.year = year;
        this.groupMember = groupMember;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getGroupMember() {
        return groupMember;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGroupMember(List<String> groupMember) {
        this.groupMember = groupMember;
    }

    public String toString() {
        return "%s %s".formatted(name, year, groupMember);
    }

    //-----------------------Статический------------------------//
    public static void transferMembers1(MusicBand aMegadeth, MusicBand bMetallica) {
        for (String member : aMegadeth.getGroupMember())
            bMetallica.getGroupMember().add(member);
        aMegadeth.getGroupMember().clear();
    }
    //-------------------------------------------------------------//

    // логика такова, что нужно расскомментировать либо верхний метод либо нижний
    // впротивном случае перезаписываются ArrayList ы
    // в них показаны разные методы ввержу статический, внизу нет.

    //--------------------------Нестатический----------------------//
//    public void transferMembers2(MusicBand aMegadeth) {//второй вариант нестатичный
//        for (String member : this.groupMember)
//            aMegadeth.getGroupMember().add(member);
//        this.groupMember.clear();
//    }
    //-------------------------------------------------------------//

    public void printMembers() {
        System.out.println(this.groupMember);
    }
}