
/**
 * Write a description of class Baseball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Baseball extends Sports
{
    int hits, doubles, triples, steals, homers, strikeouts, catches, atBats, walks;
    public Baseball(String n, String s, int st, int g, int p, int a, int w, int dou, int trip, int steal, int home, int strikeo, int cat, int atB, int hit, int walk){
        super(n,s,st,g,p,a,w);
        doubles = dou;
        triples = trip;
        steals = steal;
        homers = home;
        strikeouts = strikeo;
        catches = cat;
        atBats = atB;
        hits = hit;
        walks = walk;
    }
    public double battingAvg(){
        double avg = hits/atBats;
        avg = avg*100;
        return avg;
    }
    public double catchesPerGame(){
        return catches/games;
    }
    public double triplesPerGame(){
        return triples/games;
    }
    public double doublesPerGame(){
        return doubles/games;
    }
    public double homersPerGame(){
        return homers/games;
    }
    public double stealsPerGame(){
        return steals/games;
    }
    public double basePercentage(){
        return ((hits + walks)/atBats)*100;
    }
    public String toString(){
        String a = "Batting average: " + battingAvg() + "\n";
        String b = "Catches per game: " + catchesPerGame() + "\n";
        String c = "Triples per game: " + triplesPerGame() + "\n";
        String d = "Doubles per game: " + doublesPerGame() + "\n";
        String e = "Home runs per game: " + homersPerGame() + "\n";
        String f = "Bases stolen per game: " + stealsPerGame() + "\n";
        String g = "Percentage of how many times you get on base per at bat: " + basePercentage() + "%\n";
        String h = "Shots per game: " + shotsPerGame() + "%\n";
        String i = "Point accuracy: " + accuracy() + "%\n";
        String j = "Win rate: " + winRate() + "%\n";
        String k = "Starting rate: " + startRate() + "%\n";
        return h+i+j+k+a+b+c+d+e+f+g;
    }
}
