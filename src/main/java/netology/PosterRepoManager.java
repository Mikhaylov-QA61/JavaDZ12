package netology;

public class PosterRepoManager {

    private int resultLength = 5;
    private Poster[] posters = new Poster[0];

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
        Poster[] all = findAll();
        Poster[] reversed = new Poster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public Poster[] findLimitLast(int resultLength) {
        if (resultLength > 0) {
            if (resultLength > posters.length) {
                resultLength = posters.length;
            } else {
                resultLength = resultLength;
            }
        } else {
            resultLength = 1;
        }
        Poster[] all = findAll();
        Poster[] reversed = new Poster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

}
