import java.util.Arrays;
import java.util.Iterator;

public class SongsOf70s implements SongIterator{
	SongInfo[] bestSong;
	
	int arrayValue =0;
	
	public  SongsOf70s() {
		bestSong = new SongInfo[3];
		

		addSong("Imagine", "John Lennon", 1971);
		addSong("American Pie", "Don McLean", 1975);
		addSong("I Will Survive", "Gloria Gaynor", 1979);
		
		
	}
	
	public void addSong(String songName, String bandName, int yearReleased) {
		// TODO Auto-generated method stub
		
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		
		bestSong[arrayValue] = songInfo;
		
		arrayValue++;
		
	}

	/*
	 * public SongInfo[] getBestSongs(){ return bestSong; }
	 */
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return Arrays.asList(bestSong).iterator();
	}
}
