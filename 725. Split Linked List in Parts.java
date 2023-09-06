class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] l1=new ListNode[k];
        ListNode cur=head;
        int len=0;
        while(cur!=null){
            cur=cur.next;
            len++;
        }
        int n=len/k;
        int r=len%k;
        cur=head;
        ListNode prev=null;
        for(int i=0; cur!=null && i<k;i++,r--){
            l1[i]=cur;
            for(int j=0;j<n+(r>0?1:0);j++){
                prev=cur;
                cur=cur.next;
            }
            prev.next=null;
        }
        return l1;
    }
}
