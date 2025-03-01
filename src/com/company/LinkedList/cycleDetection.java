package com.company.LinkedList;


public class cycleDetection {
//    leet code question

//     * Definition for singly-linked list.
      class ListNode {
          int val;
          ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
      }


        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast)
                    return true;
            }

            return false;
        }
        public int lengthCycle(ListNode head){
          ListNode slow = head;
          ListNode fast = head;
          while(fast!= null && fast.next!= null){
              fast = fast.next.next;
               slow = slow.next;
               if(fast == slow){
                   int length = 0;
                   ListNode temp = slow;
                   do{
                       temp = temp.next;
                       length++;
                   }
                   while(temp!= slow);
                   return length;
               }
          }
           return 0;
        }


}
