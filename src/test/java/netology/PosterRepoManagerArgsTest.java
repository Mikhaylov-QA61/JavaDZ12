package netology;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PosterRepoManagerArgsTest {

    @Test
    public void findLastAddedPosterLimit3() {
        PosterRepoManager repo = new PosterRepoManager(3);

        Poster poster1 = new Poster("Бладшот", "боевик", 1);
        Poster poster2 = new Poster("Вперёд", "мультфильм", 2);
        Poster poster3 = new Poster("Отель <<Белград>>", "комедия", 3);
        Poster poster4 = new Poster("Джентельмены", "боевик", 4);
        Poster poster5 = new Poster("Человек-невидимка", "ужасы", 5);
        Poster poster6 = new Poster("Тролли. Мировой тур", "мультфильм", 6);
        Poster poster7 = new Poster("Номер один", "комедия", 7);

        repo.save(poster1);
        repo.save(poster6);
        repo.save(poster3);
        repo.save(poster2);
        repo.save(poster5);
        repo.save(poster4);
        repo.save(poster7);


        Poster[] expected = {poster7, poster4, poster5};
        Poster[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastAddedPosterLimit1() {
        PosterRepoManager repo = new PosterRepoManager(1);

        Poster poster1 = new Poster("Бладшот", "боевик", 1);
        Poster poster2 = new Poster("Вперёд", "мультфильм", 2);
        Poster poster3 = new Poster("Отель <<Белград>>", "комедия", 3);
        Poster poster4 = new Poster("Джентельмены", "боевик", 4);
        Poster poster5 = new Poster("Человек-невидимка", "ужасы", 5);
        Poster poster6 = new Poster("Тролли. Мировой тур", "мультфильм", 6);
        Poster poster7 = new Poster("Номер один", "комедия", 7);

        repo.save(poster1);
        repo.save(poster6);
        repo.save(poster3);
        repo.save(poster2);
        repo.save(poster5);
        repo.save(poster4);
        repo.save(poster7);


        Poster[] expected = {poster7};
        Poster[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastAddedPosterLimit0() {
        PosterRepoManager repo = new PosterRepoManager(0);

        Poster poster1 = new Poster("Бладшот", "боевик", 1);
        Poster poster2 = new Poster("Вперёд", "мультфильм", 2);
        Poster poster3 = new Poster("Отель <<Белград>>", "комедия", 3);
        Poster poster4 = new Poster("Джентельмены", "боевик", 4);
        Poster poster5 = new Poster("Человек-невидимка", "ужасы", 5);
        Poster poster6 = new Poster("Тролли. Мировой тур", "мультфильм", 6);
        Poster poster7 = new Poster("Номер один", "комедия", 7);

        repo.save(poster1);
        repo.save(poster6);
        repo.save(poster3);
        repo.save(poster2);
        repo.save(poster5);
        repo.save(poster4);
        repo.save(poster7);


        Poster[] expected = {};
        Poster[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
