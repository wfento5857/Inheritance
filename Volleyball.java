
/**
 * Write a description of class Volleyball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Volleyball extends Sports
{
    int aces, kills, digs, blocks;
    public Volleyball(String n, String s, int st, int g, int p, int a, int w, int ace, int kill, int dig, int blo){
        super (n,s,st,g,p,a,w);
        aces = ace;
        kills = kill;
        digs = dig;
        blocks = blo;
    }
    public double killsPerGame(){
        return kills/games;
    }
    public double blocksPerGame(){
        return blocks/games;
    }
    public double savesPerGame(){
        return digs/games;
    }
    public double acesPerGame(){
        return aces/games;
    }   
    public String toString(){
        String e = "Shots per game: " + shotsPerGame() + "%\n";
        String f = "Point accuracy: " + accuracy() + "%\n";
        String g = "Win rate: " + winRate() + "%\n";
        String h = "Starting rate: " + startRate() + "%\n";
        String a = "Kills per game: " + killsPerGame() + "\n";
        String b = "Blocks per game: " + blocksPerGame() + "\n";
        String c = "Saves per game: " +  savesPerGame() + "\n";
        String d = "Aces per game: " + acesPerGame() + "\n";
        return e+f+g+h+a+b+c+d;
    }
}
