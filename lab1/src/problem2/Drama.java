package problem2;

public class Drama {
private final String title;
    private static int totalDramasCount = 0;
    
    private Genre genre;
    private int episodes;

    {
        totalDramasCount++; 
    }

    public Drama(String title) {	
        this(title, Genre.ROMANCE, 16); 
    }

    public Drama(String title, Genre genre, int episodes) {
        this.title = title;
        this.genre = genre;
        this.episodes = episodes;
    }
    
   

    public static int getTotalDramasCount() {
        return totalDramasCount;
    }

    @Override
    public String toString() {
        return "Drama: " + title + " [" + genre + "], " + episodes + " eps.";
    }

    public static void main(String[] args) {
        Drama d1 = new Drama("Alchemy of Souls", Genre.HISTORICAL, 16);
        Drama d2 = new Drama("True Beauty");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println("Total dramas in list: " + Drama.getTotalDramasCount());
    }
}
