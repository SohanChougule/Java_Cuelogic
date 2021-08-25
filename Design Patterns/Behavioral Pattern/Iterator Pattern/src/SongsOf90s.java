import java.util.Hashtable;
import java.util.Iterator;

public class SongsOf90s implements SongIterator {
	Hashtable<Integer, SongInfo> bestSong = new Hashtable<Integer, SongInfo>();
	
	int hashKey=0;
	
	public  SongsOf90s() {
		
		addSong("Losing My Religion", "REM", 1991);
		addSong("Creep", "Radiohead", 1993);
		addSong("Walk on the Ocean", "Toad the Wet Sprocket", 1991);
		
	}
	
	public void addSong(String songName, String bandName, int yearReleased) {
		// TODO Auto-generated method stub
		
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		
		bestSong.put(hashKey,songInfo);
		
		hashKey++;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return bestSong.values().iterator();
	}

	/*
	 * public Hashtable<Integer, SongInfo> getBestSongs(){ return bestSong; }
	 */
}
