package netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Poster {

    private String nameFilm;
    private String genre;
    private int id;

    public Poster(String nameFilm, String genre, int id) {
        this.nameFilm = nameFilm;
        this.genre = genre;
        this.id = id;
    }
}
