package netology;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class PosterRepoManagerTest {

    PosterRepoManager repo = new PosterRepoManager();
    Poster poster1 = new Poster("Бладшот", "боевик", 1);
    Poster poster2 = new Poster("Вперёд", "мультфильм", 2);
    Poster poster3 = new Poster("Отель <<Белград>>", "комедия", 3);
    Poster poster4 = new Poster("Джентельмены", "боевик", 4);
    Poster poster5 = new Poster("Человек-невидимка", "ужасы", 5);
    Poster poster6 = new Poster("Тролли. Мировой тур", "мультфильм", 6);
    Poster poster7 = new Poster("Номер один", "комедия", 7);

    //    @BeforeEach
    public void setup() {
        repo.save(poster1);
        repo.save(poster6);
        repo.save(poster3);
        repo.save(poster2);
        repo.save(poster5);
        repo.save(poster4);
        repo.save(poster7);
    }


    @Test
    public void findAllPosterTest() {
        setup();

        Poster[] expected = {poster1, poster6, poster3, poster2, poster5, poster4, poster7};
        Poster[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastAddedPoster() {
        setup();
        Poster[] expected = {poster7, poster4, poster5, poster2, poster3};
        Poster[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLimitLastAddedPosterAboveMaxLenght() {
        setup();
        Poster[] expected = {poster7, poster4, poster5, poster2, poster3, poster6, poster1};
        Poster[] actual = repo.findLimitLast(10);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLimitLastAddedPosterUnderLenght() {
        setup();
        Poster[] expected = {poster7};
        Poster[] actual = repo.findLimitLast(-5);

        Assertions.assertArrayEquals(expected, actual);
    }
}

