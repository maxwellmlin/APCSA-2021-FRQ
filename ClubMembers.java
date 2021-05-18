import java.util.ArrayList;

public class ClubMembers {
  private ArrayList<MemberInfo> memberList;

  public ClubMembers() {
    memberList = new ArrayList<MemberInfo>();
  }

  public ClubMembers(ArrayList<MemberInfo> memberList) {
    this.memberList = memberList;
  }

  public void addMembers(String[] names, int gradYear) {
    for (String name : names) {
      memberList.add(new MemberInfo(name, gradYear, true));
    }
  }
  
  public ArrayList<MemberInfo> getMemberList() {
    return memberList;
  }

  public ArrayList<MemberInfo> removeMembers(int year) {
    ArrayList<MemberInfo> goodStanding = new ArrayList<MemberInfo>();

    for (int i = 0; i < memberList.size(); i++) {
      if (memberList.get(i).getGradYear() <= year && memberList.get(i).inGoodStanding()) {
        goodStanding.add(memberList.get(i));
      }
    }

    for (int i = memberList.size() - 1; i >= 0; i--) {
      if (memberList.get(i).getGradYear() <= year) {
        memberList.remove(i);
      }
    }

    return goodStanding;
  }
}