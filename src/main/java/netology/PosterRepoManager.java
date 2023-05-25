package netology;

public class PosterRepoManager {

    private int limitLength;
    private Poster[] posters = new Poster[0];

    public PosterRepoManager() {
        this.limitLength = 5;
    }

    public PosterRepoManager(int limit) {
        this.limitLength = limit;
    }

    public void save(Poster poster) {
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public Poster[] findAll() {
        return posters;
    }

    public Poster[] findLast() {
        int resultLength;
        if (posters.length < limitLength) {
            resultLength = posters.length;
        } else {
            resultLength = limitLength;
        }
        Poster[] reversed = new Poster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = posters[posters.length - 1 - i];
        }
        return reversed;
    }
}
