import java.util.Arrays;

public class PlaylistManager {
    static class Playlist {
        private final String[] songs;
        private int count;
        public Playlist(int capacity) {
            this.songs = new String[Math.max(1, capacity)];
            this.count = 0;
        }
        public void addSong(String song) {
            if (song != null && count < songs.length) songs[count++] = song;
        }
        public String[] getSongs() {
            String[] copy = new String[count];
            System.arraycopy(songs, 0, copy, 0, count);
            return copy;
        }
        public int getSongCount() { return count; }
    }
    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A"); p.addSong("Song B");
        System.out.println(Arrays.toString(p.getSongs()));
        System.out.println("Count: " + p.getSongCount());
    }
}
