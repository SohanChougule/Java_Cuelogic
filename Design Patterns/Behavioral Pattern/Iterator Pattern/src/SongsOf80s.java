import java.util.ArrayList;
import java.util.Iterator;

public class SongsOf80s implements SongIterator {
	ArrayList<SongInfo> bestSong;
	
	public  SongsOf80s() {
		bestSong = new ArrayList<SongInfo>();
		
		addSong("Roam", "B52s", 1989);
		addSong("Cruel Summer", "Bananarama", 1984);
		addSong("head Over Heels", "Tears for Fears", 1985);
	}
	
	public void addSong(String songName, String bandName, int yearReleased) {
		// TODO Auto-generated method stub
		
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		
		bestSong.add(songInfo);
		
	}

	/*
	 * public ArrayList<SongInfo> getBestSongs(){ return bestSong; }
	 */
	
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return bestSong.iterator();
	}
}
