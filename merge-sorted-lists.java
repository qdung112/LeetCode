public static List<Integer> mergeSortedLists(List<Integer> lst1, List<Integer> lst2) {
    List<Integer> mergedList = new ArrayList<>();
    int i = 0, j = 0;
    while (i < lst1.size() && j < lst2.size()) {
        if (lst1.get(i) <= lst2.get(j)) {
            mergedList.add(lst1.get(i));
            i++;
        } else {
            mergedList.add(lst2.get(j));
            j++;
        }
    }
    while (i < lst1.size()) {
        mergedList.add(lst1.get(i));
        i++;
    }
    while (j < lst2.size()) {
        mergedList.add(lst2.get(j));
        j++;
    }
    return mergedList;
}

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

 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1!=null && list2!=null){
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
        }
        }
        if(list1==null)
            return list2;
        return list1;
    }
