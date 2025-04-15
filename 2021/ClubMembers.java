/*
*    Created by: {techmoocher}
*    Date: Arpil 15, 2025
*/

/* Question 3 */

/* Implementation for MemberInfo class is not shown */
public class ClubMembers {
    private ArrayList<MemberInfo> memberList;
    
    public void addMembers(String[] name, int gradYear) {
        for (String member : name) {
            MemberInfo newMember = new MemberInfo(member, gradYear, true);
            memberList.add(newMember);
        }
    }
    
    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MebmerInfo> removedMembers = new ArrayList<MebmerInfo>();
        for (int i = memberList.length - 1; i >= 0 ; i--) {
            if (memberList.get(i).getGradYear() <= year && memberList.get(i).inGoodStanding()) {
                removedMembers.add(memberList.get(i));
            }
            memberList.remove(i);
        }
        return removedMembers;
    }
}
