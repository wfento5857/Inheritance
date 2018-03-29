
/**
 * Write a description of class League here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class League extends Sports
{
    int kills, deaths, assists, towers, totalDamage, outplays, farm;
    public League(String n, String s, int st, int g, int p, int a, int w, int k, int d, int as, int to, int tot, int out, int cs){
        super(n,s,st,g,p,a,w);
        kills = k;
        deaths = d;
        assists = as;
        totalDamage = tot;
        outplays = out;
        farm = cs;
    }
    public double killsPerGame(){
        return kills/games;
    }
    public double avgKD(){
        return kills/deaths;
    }
    public double farmPerGame(){
        return farm/games;
    }
    public double damagePerGame(){
        return totalDamage/games;
    }
    public double assistsPerGame(){
        return assists/games;
    }
    public double outplaysPerGame(){
        return outplays/games;
    }
    public double KPGame(){
        return (kills+assists)/games;
     }
    public String toString(){
        String zero = "Statistics for " + name + " playing " + sport + "\n";
        String a = "Win rate: " + winRate() + "%\n";
        String b = "Starting rate: " + startRate() + "%\n";
        String c = "Kills per game: " + killsPerGame() + "\n";
        String d = "Average Kill/Death ratio: " + avgKD() + "\n";
        String e = "Average farm per game: " + farmPerGame() + "\n";
        String f = "Average damage per game: " + damagePerGame() + "\n";
        String g = "Average assists per game: " + assistsPerGame() + "\n";
        String h = "Average outplays per game: " + outplaysPerGame() + "\n";
        String i = "Average kill participation per game: " + KPGame() + "\n";
        return zero+a+b+c+d+e+f+g+h+i;
    }
}
