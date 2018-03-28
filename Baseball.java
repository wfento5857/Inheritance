
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
        return (hits + walks)/atBats;
    }
    
}
