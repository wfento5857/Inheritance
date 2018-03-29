
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Driver
{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        boolean check = true;
        while (check){
            System.out.println("What is your sport (Basketball, volleyball, baseball, League of Legends)");
            String sport = input.nextLine();
            if (sport.equalsIgnoreCase("Basketball") || sport.equalsIgnoreCase("volleyball") || sport.equalsIgnoreCase("baseball") || sport.equalsIgnoreCase("League of Legends")){
                System.out.println("How many games did you start in?");
                int starts = input.nextInt();
                input.nextLine();
                System.out.println("How many games were there total?");
                int games = input.nextInt();
                input.nextLine();
                System.out.println("How many shots/points did you make?");
                int shots = input.nextInt();
                input.nextLine();
                System.out.println("How many attempted points did you shoot?");
                int attempts = input.nextInt();
                input.nextLine();
                System.out.println("How many games did you win?");
                int wins = input.nextInt();
                input.nextLine();
                if (sport.equalsIgnoreCase("Basketball")){
                    System.out.println("How many free throws did you shoot?");
                    int frees = input.nextInt();
                    input.nextLine();
                    System.out.println("How many free throws did you land?");
                    int hft = input.nextInt();
                    input.nextLine();
                    System.out.println("How many three pointers did you land?");
                    int threes = input.nextInt();
                    input.nextLine();
                    System.out.println("How many dunks did you land?");
                    int dunk = input.nextInt();
                    input.nextLine();
                    System.out.println(new Basketball(name,sport,starts,games,shots,attempts,wins, dunk, frees,hft,threes));
                }
                else if (sport.equalsIgnoreCase("Baseball")){
                    System.out.println("How many hits did you make?");
                    int hits = input.nextInt();
                    input.nextLine();
                    System.out.println("How many doubles did you make?");
                    int doubles = input.nextInt();
                    input.nextLine();
                    System.out.println("How many triples did you make?");
                    int triples = input.nextInt();
                    input.nextLine();
                    System.out.println("How many steals did you make?");
                    int steals = input.nextInt();
                    input.nextLine();
                    System.out.println("How many home runs did you hit?");
                    int homers = input.nextInt();
                    input.nextLine();
                    System.out.println("How many strikeouts?");
                    int strikeouts = input.nextInt();
                    input.nextLine();
                    System.out.println("How many catches did you make?");
                    int catches = input.nextInt();
                    input.nextLine();
                    System.out.println("How many at bats?");
                    int atB = input.nextInt();
                    input.nextLine();
                    System.out.println("How many walks?");
                    int walks = input.nextInt();
                    input.nextLine();
                    System.out.println(new Baseball(name,sport,starts,games,shots,attempts,wins,hits,doubles,triples,steals,homers,strikeouts,catches,atB,walks)); 
                }
                else if (sport.equalsIgnoreCase("volleyball")){
                    System.out.println("How many aces?");
                    int aces = input.nextInt();
                    input.nextLine();
                    System.out.println("How many kills?");
                    int kills = input.nextInt();
                    input.nextLine();
                    System.out.println("How many digs?");
                    int digs = input.nextInt();
                    input.nextLine();
                    System.out.println("How many blocks?");
                    int blocks = input.nextInt();
                    input.nextLine();
                }
                check = false;
            }
            else{
                System.out.println("Try again! Incorrect input.");
            }
        }

    }
}
