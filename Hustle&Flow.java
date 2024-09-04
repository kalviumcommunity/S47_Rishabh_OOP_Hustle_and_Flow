 class Artist {
    // Attributes
    private String name;
    private int fanBase;
    private double money;

    // Constructor
    public Artist(String name) {
        this.name = name;
        this.fanBase = 100; // Starting fan base
        this.money = 1000;  // Starting money
    }

    // Member Function 1: Release a Song
    public void releaseSong(Song song) {
        int popularity = song.calculatePopularity();
        fanBase += popularity * 10; // Increase fan base
        money += popularity * 50;   // Increase money
        System.out.println(name + " released '" + song.getTitle() + "' and gained " + (popularity * 10) + " fans!");
    }

    // Member Function 2: Perform at a Concert
    public void performConcert() {
        int concertFans = 50;
        fanBase += concertFans;   // Increase fan base
        money += 1000;            // Earn money from the concert
        System.out.println(name + " performed at a concert and gained " + concertFans + " fans!");
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Fan Base
    public int getFanBase() {
        return fanBase;
    }

    // Getter for Money
    public double getMoney() {
        return money;
    }
}


 class Song {
    // Attributes
    private String title;
    private String style;
    private int quality; // 1 to 10 scale

  

    // Member Function 1: Calculate Song Popularity
    public int calculatePopularity() {
        return quality * 10; // Popularity based on quality
    }

    // Member Function 2: Display Song Details
    public void displayDetails() {
        System.out.println("Title: " + title + ", Style: " + style + ", Quality: " + quality);
    }

    // Getter for Title
    public String getTitle() {
        return title;
    }

    // Getter for Style
    public String getStyle() {
        return style;
    }
}
 class Main {
    public static void main(String[] args) {
        // Create an Artist object
        Artist artist = new Artist("Lil Byte");

   
        
   
        artist.performConcert();   

   
       
    }
}
