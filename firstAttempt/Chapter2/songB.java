class songsB {
	String title;
	String artist;

	void playSong (){
		System.out.println("This song is " + title + " by " + artist + ".");
	}
	void skipSong (){
		System.out.println ("This is not the song, try the next one.");
	}
}

class songsBTestDrive{
	public static void main (String [] args){
		songsB fav = new songsB();

		fav.title = "Dollar Van";
		fav.artist = "\"Busy Signal\"";
		fav.playSong();
	}
}
