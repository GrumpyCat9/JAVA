import java.util.*;

public class ParticpantList
{
    ParticipantNode head, tail;

    public void init()
    {
        head = null;
        tail = null;
    }
    public void addparti(int i,String n,String sna)
    {
        ParticipantNode n1 = new ParticipantNode(i,n,sna);
        if(head == null)
        {
            head = n1;
            tail = n1;
            tail.nextNode = null;

        }
        else
        {
            tail.nextNode = n1;
            n1.nextNode = null;
            tail = n1;
        }
    }

    public void show()
    {
        ParticipantNode n1 = head;
        n1 = head;

        System.out.println("------------------------------------------------------------------------------------------------------"); 
        System.out.println("                                    Participants                                                      ");
        System.out.println("------------------------------------------------------------------------------------------------------");

        if(n1 == null)
        {
            System.out.println("                                   No Participants                                     ");
        }
        else{

            System.out.println("ID      Name        Sir Name");

        while(n1.nextNode != null)
        {
            System.out.println(n1.ID +"     "+n1.name + "       " + n1.sirname);
            System.out.println("");

            n1 = n1.nextNode;
        }
        System.out.println(n1.ID +"     "+n1.name + "       " + n1.sirname);
        System.out.println("");
        
        }
    }

    public void Delparti(String n)
    {
        ParticipantNode p,q;
        p = head;
        q = null;
        boolean found = false;
        while(p!= null && found==false)
        {
            if(n.equals(p.name))
            {
                found = true;
                System.out.println("--------------------------------------"); 
                System.out.println("           Participant Found          ");
                System.out.println("--------------------------------------");
                System.out.println("Participant ID      : " +p.ID       ); 
                System.out.println("Participant Name    : " +p.name     );
                System.out.println("Participant ID      : " +p.sirname  );
                System.out.println("Accept [Y/N]:");
                System.out.println("");
                Scanner obj = new Scanner(System.in);
                String answer = obj.nextLine();
                if(answer.equals("Y")||answer.equals("y"))
                {
                    if(q==null)
                    {
                        head = p.nextNode;
                        System.out.println("Participant Deleted");
                        System.out.println("");
                    }
                    else
                    {
                        q.nextNode = p.nextNode;
                        System.out.println("Participant Deleted");
                        System.out.println("");
                    }
                }
                else
                {
                    q = p;
                    p = p.nextNode;
                }
                
            }
        }
        if(found == false)
        {
            System.out.println("Participant Not Found");
        }
    }

    public static void main(String[] args) 
    {
        ParticpantList s1 = new ParticpantList();
        Scanner obj = new Scanner(System.in);
        s1.init();
        int choice = 0;
        while(choice <= 4)
        {
            System.out.println(""); 
            System.out.println("--------------------------------------"); 
            System.out.println("                Menu                  "); 
            System.out.println("--------------------------------------"); 
            System.out.println("1. Register participant"            ); 
            System.out.println("2. Show participant  Details"       );
            System.out.println("3. Delete participant Details"      ); 
            System.out.println("4. Exit"                            );

            System.out.println("--------------------------------------"); 

            System.out.println("Please Select An Option");
            

            choice = obj.nextInt();

            if(choice == 1)
            {
                System.out.println("Enter Participant  ID :         ");

                int I = 0;
                if(obj.hasNextInt())  
                    {  
                     I = obj.nextInt();    
                    }   
                    else 
                    {  
                        System.out.println("Please enter An Valid ID. "); 
                        main(args); 
                    }    

                System.out.println("Enter Participant  First Name : ");
                String N = obj.next();

                System.out.println("Enter Participant  Sir Name :   ");
                String SN = obj.next();
                
                System.out.println("************************************");
                System.out.println("        participant registered      ");
                System.out.println("************************************");
                System.out.println("");

                s1.addparti(I, N, SN);
            }
            else if(choice  == 2)
            {
                s1.show();
            }
            else if(choice == 3)
            {
                System.out.println("Enter Student Name : ");
                String N = obj.next();
                s1.Delparti(N);
            }
            else if(choice == 4)
            {
                System.exit(0);
            }
        }
    }
}
