import java.util.Scanner;

class Linky{

    Node head;
    
    
    public void append(int value)   //Add element to the linked list
    {
    if(head==null) //if Linked list is empty!
    {
        head=new Node(value);
        return;
    }
     
    Node current = head;
    
    while(current.next!=null)
    {
    current=current.next;
    }
    
    current.next=new Node(value);
    
    }
    
    public void deletewithvalue(int value)   //Delete element from linked list with value!
    {
    if (head==null)   //if linkedList is empty!
    { 
        System.out.println("Linked list is empty!");
        return;
    }
    
    if(head.Data==value) //if first element contains value!
    {
    head=head.next;
    return;
    }
    
    Node current=head;
    while(current.next!=null)
    {
        if(current.next.Data==value)
        {
         current.next=current.next.next;
         return;
        }
    }
    
    System.out.println("Value not found!");
    
    }
    
    
    public void Print()
    {
    
    Node current = head;

    if(head==null)
    {
        System.out.println("Linked list is empty");
        return;
    }
    
    while(current.next!=null)
    {
        System.out.println(current.Data);
        current=current.next;
    }
    System.out.println(current.Data); //Prints the last element!
    
    }
    
    public void delete(int a) 
    {
        Node current=head;
       
      if(a<1)
      {
          System.out.println("Please enter a proper input (min 1)");
          return;
      }

        if(head==null)    // if linked list empty
        {
            System.out.println("Empty!");
            return;
        }

    if(a==1)   // if u want to delete the first value of the linked list!
    {
        head=head.next;
        return;
    }

    if(head.next==null)  
    {
       if(a>1) 
       {
         System.out.println("Not enough values to delete this Node!");
         return;
       }
    }
    
    
        for(int i=1;i<a-1;i++)
        {
            current=current.next;
            if(current.next==null && i<a)  //if the element is not available in the linked list 
            {
                System.out.println("Not enough elements in the linkedlist!");
                return;
            }
           
        }
    
        
        current.next=current.next.next;   
       
    
    }
    
    
    
    
    
    public static void main(String[] args)
    {
       
     Linky a= new Linky();
    System.out.println("Printing linked list: ");
    a.append(1);
    a.append(2);
    a.append(3);
    a.append(4);
    a.Print();
    
   System.out.println("What element do you want to delete?");
   Scanner sc=new Scanner(System.in);
   int w= sc.nextInt();
    a.delete(w);
    System.out.println("Printing linked list:");
    a.Print();   
    
    
    }
    
    
    
    
    
    
    
    
    
    
    }