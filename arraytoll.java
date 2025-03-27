class arraytoll  {
    static Node constructLL(int arr[]) {
        if (arr.length == 0) return null;  

        Node head = new Node(arr[0]); 
        Node temp = head;  

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);  
            temp = temp.next;  
        }

        return head;  
    }
}

