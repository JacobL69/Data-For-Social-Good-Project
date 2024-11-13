import java.util.Scanner;

/**
 * Represents a collection of election vote results loaded from files. 
 */
public class UserStory {

  // ElectionResult array containing loaded data. Each ElectionResult represents data for given party and year.
  private ElectionResult[] results;

  // constructor
  public UserStory(String[] files, String[] parties, int[] years) {

    // creates an array to hold data from data files
    results = new ElectionResult[files.length];

    // iterate through files
    for (int i=0; i<files.length; i++) {

      // load data for each file: party, year, and votes by demogrphic group
      String party = parties[i];
      int year = years[i];
      String filename = files[i];

      // extrcts vote data from file
      int[] votes = FileReader.toIntArray(filename);

      // helper method for creating an election result
      results[i] = createElectionResult(party, year, votes);
    }
  }

  /**
   * Returns the vote percentage for a given party, year, and demographic type constant. The type
   * constants are stored in the ElectionResult class.
   */
  public int getVote(String party, int year, int type) {

    int vote = 0;

    // iterate through the array of Election results
    for (int i=0; i<results.length; i++) {

      // if a match on party and year is found
      if (results[i].getParty().equals(party) && results[i].getYear() == year) {

        // get the vote value
        vote = results[i].getVote(type);
      }
    }

    return vote;
  }

  // returns a String representation explaining what the UserStory is for
  public String toString() {
    return "Election results for Democrats and Republicans for years 2018, 2020, and 2022 for multiple demographic groups.";
  }

  // helper method for creating each ElectionResult object
  private ElectionResult createElectionResult(String party, int year, int[] votes) {
    ElectionResult result = new ElectionResult(
      party, 
      year,
      votes[ElectionResult.VOTE_TOTAL],
      votes[ElectionResult.VOTE_MEN],
      votes[ElectionResult.VOTE_WOMEN],
      votes[ElectionResult.VOTE_WHITE],
      votes[ElectionResult.VOTE_BLACK],
      votes[ElectionResult.VOTE_HISPANIC],
      votes[ElectionResult.VOTE_ASIAN]);

    System.out.println(result);

    return result;
  }
}