/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        int i=0;
        while(temp.next.next!=null){
            if((temp.val<temp.next.val&&temp.next.val>temp.next.next.val)||(temp.val>temp.next.val&&temp.next.val<temp.next.next.val))
            list.add(i);
            i++;
            temp=temp.next;
        }
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        if(list.size()<2)
        return ans;
        int min=list.get(1)-list.get(0);
        for(int j=2;j<list.size();j++)
        {
            min=Math.min(min,list.get(j)-list.get(j-1));
        }
        ans[0]=min;
        ans[1]=list.get(list.size()-1)-list.get(0);
        return ans;
    }
}