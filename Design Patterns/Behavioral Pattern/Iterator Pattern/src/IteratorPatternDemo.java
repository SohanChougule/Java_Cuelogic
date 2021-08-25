
public class IteratorPatternDemo {
	
	public static void main(String[] args) {
		
		SongsOf70s songs70 = new SongsOf70s();
		SongsOf80s songs80 = new SongsOf80s();
		SongsOf90s songs90 = new SongsOf90s();
		
		DiscJockey dj = new DiscJockey(songs70, songs80, songs90);
		
	//	dj.showTheSongs();
		
		dj.showTheSongs2();
	}
}
