// Test cases except for FRQ #3A provided by College Board
// https://apcentral.collegeboard.org/pdf/ap21-frq-computer-science-a.pdf

import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    /*
      TEST CASES for FRQ #1
    */

    // WordMatch game = new WordMatch("mississippi");
    // System.out.println(game.scoreGuess("i"));
    // System.out.println(game.scoreGuess("iss"));
    // System.out.println(game.scoreGuess("issipp"));
    // System.out.println(game.scoreGuess("mississippi"));

    // WordMatch game = new WordMatch("aaaabb");
    // System.out.println(game.scoreGuess("a"));
    // System.out.println(game.scoreGuess("aa"));
    // System.out.println(game.scoreGuess("aaa"));
    // System.out.println(game.scoreGuess("aabb"));
    // System.out.println(game.scoreGuess("c"));

    // WordMatch game = new WordMatch("concatenation");
    // System.out.println(game.scoreGuess("ten"));
    // System.out.println(game.scoreGuess("nation"));
    // System.out.println(game.findBetterGuess("ten", "nation"));
    // System.out.println(game.scoreGuess("con"));
    // System.out.println(game.scoreGuess("cat"));
    // System.out.println(game.findBetterGuess("con", "cat"));

    /*
      TEST CASES for FRQ #2
    */

    // SingleTable t1 = new SingleTable(4, 74, 60);
    // SingleTable t2 = new SingleTable(8, 74, 70);
    // SingleTable t3 = new SingleTable(12, 76, 75);
    // CombinedTable c1 = new CombinedTable(t1, t2);
    // System.out.println(c1.canSeat(9));
    // System.out.println(c1.canSeat(11));
    // System.out.println(c1.getDesirability());
    // CombinedTable c2 = new CombinedTable(t2, t3);
    // System.out.println(c2.canSeat(18));
    // System.out.println(c2.getDesirability());
    // t2.setViewQuality(80);
    // System.out.println(c2.getDesirability());

    /*
      TEST CASES for FRQ #3
    */

    // ClubMembers clubMembers = new ClubMembers();
    // clubMembers.addMembers(new String[]{"Max", "Bob", "Will"}, 2022);
    // System.out.println(clubMembers.getMemberList());

    // ArrayList<MemberInfo> members = new ArrayList<MemberInfo>();
    // members.add(new MemberInfo("SMITH, JANE", 2019, false));
    // members.add(new MemberInfo("FOX, STEVE", 2018, true));
    // members.add(new MemberInfo("XIN, MICHAEL", 2017, false));
    // members.add(new MemberInfo("GARCIA, MARIA", 2020, true));
    // ClubMembers clubMembers = new ClubMembers(members);
    // ArrayList<MemberInfo> standing = clubMembers.removeMembers(2018);
    // System.out.println(clubMembers.getMemberList());
    // System.out.println(standing);

    /*
      TEST CASES for FRQ #4
    */

    // int[][] arr = {{2, 1, 0},
    //               {1, 3, 2},
    //               {0, 0, 0},
    //               {4, 5, 6}};
    // System.out.println(ArrayResizer.isNonZeroRow(arr, 0));
    // System.out.println(ArrayResizer.isNonZeroRow(arr, 1));
    // System.out.println(ArrayResizer.isNonZeroRow(arr, 2));
    // System.out.println(ArrayResizer.isNonZeroRow(arr, 3));

    // int[][] arr = {{2, 1, 0},
    //               {1, 3, 2},
    //               {0, 0, 0},
    //               {4, 5, 6}};
    // int[][] smaller = ArrayResizer.resize(arr);
    // System.out.println(Arrays.deepToString(smaller));
  }
}