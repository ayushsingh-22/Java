
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

/* 
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
class methoddemo
{
    public static void main(String[] args) 
    {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.skipToNext();
        episode.skipIntro();
    }
}
*/
/* 
class Books
{
    String title;
    String author;
}
class methoddemo
{
    public static void main(String[] args) 
    {
        Books[] myBooks = new Books[3];

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";
        
        while (x < 3) 
        {
            System.out.println();
            System.out.print(myBooks[x].title);         
            System.out.print(" by ");         
            System.out.println(myBooks[x].author);
            System.out.println();
            x = x + 1;
        }
    }
}
*/


class calculator
{
    public static int add(int a,  int b)
    {
        return a+b;
    }

    public int sub (int a, int b)
    {
        return a-b;
    }
}

class advance 
{
    public advance()
    {
        calculator com = new calculator();
        int summ = com.add(50, 50);
    }
}

class methoddemo
{
    public static void main(String[] args) 
    {
        calculator cc = new calculator();
        System.out.println(cc.add(55, 65));
        System.out.println(cc.sub(256, 056));

    }
}