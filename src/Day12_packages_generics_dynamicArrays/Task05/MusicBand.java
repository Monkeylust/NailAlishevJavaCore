package Day12_packages_generics_dynamicArrays.Task05;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> groupMember;

    public MusicBand(String name, int year, List<MusicArtist> groupMember) {
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

    public List<MusicArtist> getGroupMember() {
        return groupMember;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGroupMember(List<MusicArtist> groupMember) {
        this.groupMember = groupMember;
    }

    public String toString() {
        return "%s %s %s".formatted(name, year, groupMember);
    }

    public static void transferMembers1(MusicBand a, MusicBand b) {
        for (MusicArtist member : a.getGroupMember())
            b.getGroupMember().add(member);
        a.getGroupMember().clear();
    }

    public void printMembers() {
        System.out.println(this.groupMember);
    }
}