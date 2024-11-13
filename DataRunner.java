import java.util.Scanner;

/**
 * Top-level class that loads the UserStory from data files. 
 */
public class DataRunner {

  // array containing the data file names
  private static String[] FILES = new String[] {
    "2018_democrat.txt", 
    "2020_democrat.txt", 
    "2022_democrat.txt", 
    "2018_republican.txt", 
    "2020_republican.txt", 
    "2022_republican.txt" };

  // array containing the party of each file
  private static String[] PARTIES = new String[] { "Democrat", "Democrat", "Democrat", "Republican", "Republican", "Republican" };

  // array containing the year for each file
  private static int[] YEARS = new int[] { 2018, 2020, 2022, 2018, 2020, 2022 };

  // entry point for loading the user story
  public static void main(String[] args) {

    // load user story
    UserStory userStory = new UserStory(FILES, PARTIES, YEARS);

    // example vote searches by party, year, and demographic group
    System.out.println("Vote results for party=Democrat, year=2020, demographic=Asian: " 
                       + userStory.getVote("Democrat", 2020, ElectionResult.VOTE_ASIAN));
    System.out.println("Vote results for party=Republican, year=2022, demographic=Women: " 
                       + userStory.getVote("Democrat", 2022, ElectionResult.VOTE_WOMEN));
  }
}