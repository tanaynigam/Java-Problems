
//public class AddTwoNumbers {
//    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            Boolean count = false;
//            ListNode sol = new ListNode((l1.val+l2.val)%10);
//            if(l1.val+l2.val >= 10)
//                count = true;
//            ListNode node = sol;
//            l1 = l1.next;
//            l2 = l2.next;
//
//            while (l1 != null || l2 != null){
//                int sum = 0;
//                if(l1 != null){
//                    sum = sum + l1.val;
//                    l1 = l1.next;
//                }
//                if(l2 != null){
//                    sum = sum + l2.val;
//                    l2 = l2.next;
//                }
//                if(count == true)
//                    sum = sum+1;
//
//                if(sum >= 10){
//                    sum = sum%10;
//                    count = true;
//                }
//                else
//                    count = false;
//
//                ListNode temp = new ListNode(sum);
//
//                node.next = temp;
//                node = temp;
//            }
//
//            if(count == true){
//                ListNode temp = new ListNode(1);
//                node.next = temp;
//            }
//
//            return sol;
//        }
//
//
//    }
//}
