public class LinkedList{
  
    private class Node{
      private int value;
      private Node next;
      
      public Node(int value){
          this.value = value;
      }
    }
    
      
    
    
      private Node first;
      private Node last;
      
      
      public void addLast(int item){
      //  Node node = new Node();
      //This is repeating the class Node twice which is uneeded
      //We can just write it with var
          var node = new Node(item);
          
          if(first == null){
              first = last = node;
          }
  
          
          }
      }
      
      //add first 
      //addLast
      //deleteFirst
      //deleteLast
      //contains
      //indexOf
  }