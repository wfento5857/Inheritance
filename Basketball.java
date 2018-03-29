
/**
 * Write a description of class Basketball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Basketball extends Sports
{
    int dunks, freethrows, hitfreethrows, threes;
    public Basketball(String n, String s, int st, int g, int p, int a, int w, int d, int f, int hft, int three){
        super(n, s, st, g, p, a, w);
        dunks = d;
        freethrows = f;
        hitfreethrows = hft;
        threes = three;
    }
    public double freeThrowPercentage(){
        return hitfreethrows/freethrows;
    }
    public double dunkRate(){
        double avg = dunks/shots;
        return avg;
    }
    public int pointsPerSeason(){
        int twos = shots - threes;
        int totalPts = (twos*2) + (threes*3) + hitfreethrows;
        return totalPts;
    }   
    public String toString()
    {
        String zero = "Statistics for " + name + " playing " + sport + "\n";
        String a = "Free throw Percentage: " + freeThrowPercentage() + "\n";
        String b = "Dunk Rate: " + dunkRate() + "\n";
        String c = "Points per season: " + pointsPerSeason() + "\n";
        String d  = "Shots per game: " + shotsPerGame() + "\n";
        String e = "Accuracy: " + accuracy() + "%\n";
        String f = "Win Rate: " + winRate() + "\n";
        String g = "Start Rate: " + startRate() + "\n";
        return zero+a + b + c + d + e + f + g;
    }
}
