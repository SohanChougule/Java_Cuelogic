import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {
	
	SongsOf70s songs70;		//arrays
	SongsOf80s songs80;		//arraylist
	SongsOf90s songs90;		//hashtable
	
	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;
	
	
	/*
	 * public DiscJockey(SongsOf70s songs70, SongsOf80s songs80, SongsOf90s songs90)
	 * { super(); this.songs70 = songs70; this.songs80 = songs80; this.songs90 =
	 * songs90; }
	 */
	

	public DiscJockey(SongIterator songs70, SongIterator songs80, SongIterator songs90) {
		super();
		this.iter70sSongs = songs70;
		this.iter80sSongs = songs80;
		this.iter90sSongs = songs90;
	}
	
	
	
	/*
	public void showTheSongs() {
		SongInfo[] aL70sSongs = songs70.getBestSongs();
		
		System.out.println("SOngs of the 70's \n");
		
		for (int i = 0; i < aL70sSongs.length; i++) {
			SongInfo bestSong = (SongInfo) aL70sSongs[i];
			
			System.out.println(bestSong.getSongName()+ " by " + bestSong.getBandName()+ " in " + bestSong.getYearReleased());
		}
		
		
		System.out.println("===============================");
		ArrayList<SongInfo> aL80sSongs = songs80.getBestSongs();
		
		System.out.println("Songs of the 80's \n");
		
		for (int i = 0; i < aL80sSongs.size(); i++) {
			SongInfo bestSong = (SongInfo) aL80sSongs.get(i);
			
			System.out.println(bestSong.getSongName()+ " by " + bestSong.getBandName()+ " in " + bestSong.getYearReleased());
		}

		
		System.out.println("===============================");

		Hashtable<Integer,SongInfo> ht90sSongs = songs90.getBestSongs();
		
		System.out.println("Songs of the 90's \n");
		
		for (Enumeration<Integer> e = ht90sSongs.keys();e.hasMoreElements();){
			SongInfo bestSong = ht90sSongs.get(e.nextElement());
			
			System.out.println(bestSong.getSongName()+ " by " + bestSong.getBandName()+ " in " + bestSong.getYearReleased());
			
		}
		
	}
	*/
	
	public void showTheSongs2() {
		Iterator songs70s = iter70sSongs.createIterator();
		Iterator songs80s = iter80sSongs.createIterator();
		Iterator songs90s = iter90sSongs.createIterator();
		
		System.out.println("\nSongs of the 70s\n");
		printTheSongs(songs70s);
		
		System.out.println("\nSongs of the 80s\n");
		printTheSongs(songs80s);
		
		System.out.println("\nSongs of the 90s\n");
		printTheSongs(songs90s);
	}




	public void printTheSongs(Iterator iterator) {
		
		while(iterator.hasNext()) {
			
			SongInfo songInfo = (SongInfo) iterator.next();
			
			System.out.println(songInfo.getSongName()+ " by "
			+ songInfo.getBandName()+ " in " + songInfo.getYearReleased());
			
		}
	}
	
}
