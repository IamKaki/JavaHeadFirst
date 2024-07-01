class Songs {
	String title;
	String author;

	void playSong (){
		System.out.println("This is " + title + " by " + author + ".");
	}
	void nextSong (){
		System.out.println("This is not the one, play the next song");
	}
}

class SongsTestDrive {
	public static void main (String[] args) {
		Songs p = new Songs();
		
		p.title = "\"Dollar Van\"";
		p.author = "Busy Signal";

		p.playSong ();
	}
}
