class Solution {
    /**
     * 必须需要四个指针，做记录.
     * 时间复杂度O（n），空间复杂度O(1)
     * 做题方法：可以两个链表来具体化问题：1，2，3；1，2，3，4
     * @param head
     * @return
     */
        public ListNode oddEvenList(ListNode head) {
            if(head==null){
                return head;
            }
            ListNode oddhead=head;
            ListNode oddTail=head;
            ListNode evenhead=head.next;
            ListNode evenTail=evenhead;
            while(evenTail!=null&&evenTail.next!=null){
                oddTail.next=evenTail.next;//奇数的下一个，等于偶数的下一个
                oddTail=oddTail.next;//调整指针
                evenTail.next=oddTail.next;//偶数的下一个，等于奇数的下一个
                evenTail=evenTail.next;//调整指针
            }
            oddTail.next=evenhead;//奇尾指针指向偶的头指针
            return head;
        }
       
}