/**
 * This class holds election vote percentages for multiple demographic groups for a given party and year.
 * 
 * The supported demographic groups per party/year combination:  
 * 1. Total
 * 2. Men
 * 3. Women
 * 4. White
 * 5. Black
 * 6. Hispanic
 * 7. Asian
 */
public class ElectionResult {

  // These constants represent the row indexes of the vote percentages
  public static int VOTE_TOTAL = 0;
  public static int VOTE_MEN = 1;
  public static int VOTE_WOMEN = 2;
  public static int VOTE_WHITE = 3;
  public static int VOTE_BLACK = 4;
  public static int VOTE_HISPANIC = 5;
  public static int VOTE_ASIAN = 6;

  // internal variables representing the party, year, and vote breakdown across demographic groups
  private String party;
  private int year;
  private int total;
  private int men;
  private int women;
  private int white;
  private int black;
  private int hispanic;
  private int asian;

  // no argument constructor
  public ElectionResult() {
  }

  // argument constructor
  public ElectionResult(String party, 
                        int year, 
                        int total, 
                        int men,
                        int women, 
                        int white, 
                        int black,
                        int hispanic,
                        int asian) {

    this.party = party;
    this.year = year;
    this.total = total;
    this.men = men;
    this.women = women;
    this.white = white;
    this.black = black;
    this.hispanic = hispanic;
    this.asian = asian;
  }

  /**
   * Returns the vote percentage for the given vote type (men, women, hispanic, etc). 
   * If no vote type match is found, returns -1. 
   */
  public int getVote(int type) {

    int vote = -1;
    
    if (type == VOTE_TOTAL) {
      vote = total;
    }
    else if (type == VOTE_MEN) {
      vote = men;
    }
    else if (type == VOTE_WOMEN) {
      vote = women;
    }
    else if (type == VOTE_WHITE) {
      vote = white;
    }
    else if (type == VOTE_BLACK) {
      vote = black;
    }
    else if (type == VOTE_HISPANIC) {
      vote = hispanic;
    }
    else if (type == VOTE_ASIAN) {
      vote = asian;
    }

    return vote;
  }

  // these are the getter methods for fetching the election result data
  public String getParty() { return party; }
  public int getYear() { return year; }
  public int getTotal() { return total; }
  public int getMen() { return men; }
  public int getWomen() { return women; }
  public int getWhite() { return white; }
  public int getBlack() { return black; }
  public int getHispanic() { return hispanic; }
  public int getAsian() { return asian; }

  // returns a string representation of the data
  public String toString() {
    return 
       "----------------------------------\n" + 
       "party=" + party + ", \n" +
       "year=" + year + ", \n" +
       "total=" + total + ", \n" +
       "men=" + men + ", \n" +
       "women=" + women + ", \n" +
       "white=" + white + ", \n" +
       "black=" + black + ", \n" +
       "hispanic=" + hispanic + ", \n" +
       "asian=" + asian + "\n" + 
       "----------------------------------\n";
  }
}