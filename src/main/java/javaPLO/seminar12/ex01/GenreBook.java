package javaPLO.seminar12.ex01;

public class GenreBook implements Genre {
    private String genreName;

    public GenreBook(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public String toGenre() {
        return genreName;
    }
}
