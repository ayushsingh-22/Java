
/*
class StreamingSong 
{
    String title;
    String artist;
    int duration;
    void play() 
    {
        System.out.println("Playing song");
    }
    void printDetails() 
    {
        System.out.println("This is " + title + " by " + artist);
    }
}

class hi
{
    public static void main(String[] args)
    {
        StreamingSong song = new StreamingSong();
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}
*/

class Episode 
{
    int seriesNumber;
    int episodeNumber;
    void skipIntro() 
    {
        System.out.println("Skipping intro...");
    }
 void skipToNext() 
 {
    System.out.println("Loading next episode...");
 }
}
class hi
{
    public static void main(String[] args) 
    {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.skipToNext();
        episode.skipIntro();
    }
}
