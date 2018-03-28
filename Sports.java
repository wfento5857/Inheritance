
/**
 * Write a description of class Sports here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
abstract class Sports
{
    private Scanner input = new Scanner(System.in);
    public int starts,games,shots,attempts,wins;
    public String name,sport;
    public Sports(String n, String s, int st, int g, int p, int a, int w){
        name = n;
        sport = s;
        starts = st;
        games = g;
        shots = p;
        attempts = a;
        wins = w;
    }
    public double shotsPerGame(){
        double avg = shots / games;
        return avg;
    }
    public double accuracy(){
        double avg = shots/attempts;
        return avg;
    }
    public double winRate(){
        double avg = wins/games;
        return avg;
    }
    public double startRate(){
        double avg = starts/games;
        return avg;
    }
}
