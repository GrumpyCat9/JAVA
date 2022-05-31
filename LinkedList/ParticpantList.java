import java.util.*;

public class ParticpantList
{
    ParticipantNode head, tail;

    public void init()
    {
        head = null;
        tail = null;
    }

    //////////////////////////////////////////////Add Fucntion////////////////////////////////////////////
    public void addparti(int i,String n,String sna, String ci, int con, String em, int fn, int sn, int t)
    {
        ParticipantNode n1 = new ParticipantNode(i,n,sna,ci,con,em,fn,sn,t);
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
    }//End of Add function

    //////////////////////////////////////////Show Function/////////////////////////////////////////////////////
    public void show()
    {
        ParticipantNode n1 = head;
        n1 = head;

        System.out.println("------------------------------------------------------------------------------------------------------"); 
        System.out.println("                                    Participants                                                      ");
        System.out.println("------------------------------------------------------------------------------------------------------");

        if(n1 == null)
        {
            System.out.println("No Participants");
        }
        else{

            System.out.println("ID      Name        Sir Name        City        Contact     Email                    First Round     Second Round       Total");

        while(n1.nextNode != null)
        {
            System.out.println(n1.ID +"     "+n1.name + "       " + n1.sirname + "       " + n1.city+ "      " + n1.contact + "      " + n1.email +"     " + n1.firstround +"        " + n1.secondround +"      "+n1.total);
            System.out.println("");

            n1 = n1.nextNode;
        }
        System.out.println(n1.ID +"     "+n1.name + "       " + n1.sirname + "       " + n1.city+ "      " + n1.contact + "      " + n1.email +"     " + n1.firstround +"        " + n1.secondround +"      "+n1.total);
        System.out.println("");
        
        }
    }//End of Show Function

    ////////////////////////////////////////////Delete Function//////////////////////////////////////////////////////////
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
                System.out.println("Participant City    : "+p.city      );
                System.out.println("Participant Contact : "+p.contact   );
                System.out.println("Participant Marks   : "+p.email     );
                System.out.println("Accept [Y/N]:");
                System.out.println("");
                Scanner obj = new Scanner(System.in);
                String answer = obj.nextLine();
                if(answer.equals("Y")||answer.equals("y"))
                {
                    if(q==null)
                    {
                        head = p.nextNode;
                        System.out.println("Student Deleted");
                        System.out.println("");
                    }
                    else
                    {
                        q.nextNode = p.nextNode;
                        System.out.println("Student Deleted");
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
            System.out.println("Student Not Found");
        }
    }//End of Delete Function

    ////////////////////////////////////////////////Search Function////////////////////////////////////////////
    public void Search(int n)
    {
        ParticipantNode na;
        na = head;
        boolean found;
        found = false;
        
        while(na!=null && found==false)
        {
            if(n == na.ID)
            {
                found = true;
            }
            else
            {
                na = na.nextNode;
            }
        }
        if(found == true)
        {
            System.out.println(" ");
            System.out.println("--------------------------------------"); 
            System.out.println("           Participant Found          ");
            System.out.println("--------------------------------------");
            System.out.println("Participant ID      : " +na.ID      ); 
            System.out.println("Participant Name    : " +na.name    );
            System.out.println("Participant Name    : " +na.sirname );
            System.out.println("Participant City    : "+na.city     );
            System.out.println("Participant Contact : "+na.contact  );
            System.out.println("Participant Marks   : "+na.email    );
        }
        else
        {
            System.out.println(" ");
            System.out.println("Participant Not Found");
        }
    }
    //End of Search Function

    /////////////////////////////////////////////////////////////////Round Function//////////////////////////////////////////////////////////
    public void rounds(String n, int f1, int f2)
    {
        ParticipantNode na;
        na = head;
        boolean found;
        found = false;
        
        while(na!=null && found==false)
        {
            if(n.equals(na.name))
            {
                found = true;
            }
            else
            {
                na = na.nextNode;
            }
        }
        if(found == true)
        {
            System.out.println(" ");
            System.out.println("--------------------------------------"); 
            System.out.println("           Participant Found          ");
            System.out.println("--------------------------------------");
            System.out.println("Participant ID      : " +na.ID      ); 
            System.out.println("Participant Name    : " +na.name    );
            System.out.println("Participant Name    : " +na.sirname );
            System.out.println("Participant City    : "+na.city     );
            System.out.println("Participant Contact : "+na.contact  );
            System.out.println("Participant Marks   : "+na.email    );
            System.out.println("--------------------------------------");

            na.firstround = f1;
            na.secondround = f2;

            na.total = f1 + f2;
        }
        else
        {
            System.out.println(" ");
            System.out.println("Participant Not Found");
        }
    }

    ///////////////////////////////////////////////////////////////Winner Function/////////////////////////////////////////
    public void Winner()
    {
        if (this.head == null)
		{
			System.out.println("\n Empty linked list");
			return;
		}

		ParticipantNode result = this.head;
		ParticipantNode temp = this.head.nextNode;

		while (temp != null)
		{
			if (result.total < temp.total)
			{
				result = temp;
			}
			temp = temp.nextNode;
		}
		System.out.println(" The Winner Is "+result.name + " " +result.sirname+ " With A Total Of " + result.total);
    }

    public void RemoveLowest()
    {
        if (this.head == null)
		{
			System.out.println("\n Empty linked list");
			return;
		}

		ParticipantNode result = this.head;
		ParticipantNode temp = this.head.nextNode;

		while (temp != null)
		{
			if (result.total > temp.total)
			{
				result = temp;
			}
			temp = temp.nextNode;
		}
		System.out.println(" The Loser Is "+result.name + " " +result.sirname+ " With A Total Of " + result.total);
    }

    public static void main(String[] args) 
    {
        ParticpantList s1 = new ParticpantList();
        Scanner obj = new Scanner(System.in);
        s1.init();
        int choice = 0;
        while(choice <= 7)
        {
            System.out.println(""); 
            System.out.println("--------------------------------------"); 
            System.out.println("         Great Minds (Pvt) Ltd        "); 
            System.out.println("--------------------------------------"); 
            System.out.println("1. Register participant"            ); 
            System.out.println("2. Show participant  Details"       );
            System.out.println("3. Search for a participant Details");
            System.out.println("4. Delete participant Details"      ); 
            System.out.println("5. Insert 2 Rounds of Results"      );
            System.out.println("6. Show the Winners"                );
            System.out.println("7. Exit"                            );

            System.out.println("--------------------------------------"); 

            System.out.println("Please Select An Option");
            

            choice = obj.nextInt();
            
            // I = ID
            // N = name
            // SN = secondname
            // C = city
            // Co = contact
            // E = email
            // F = firstround
            // S = secondround
            // T = total

            if(choice == 1)
            {
                System.out.println("Enter Participant  ID :         ");
                int I = obj.nextInt();

                System.out.println("Enter Participant  First Name : ");
                String N = obj.next();

                System.out.println("Enter Participant  Sir Name :   ");
                String SN = obj.next();

                System.out.println("Enter Participant  City :       ");
                String C = obj.next();

                System.out.println("Enter Participant  Contact :    ");
                int Co = obj.nextInt();

                System.out.println("Enter Participant  Email :      ");
                String E = obj.next();
                
                System.out.println("************************************");
                System.out.println("        participant registered      ");
                System.out.println("************************************");
                System.out.println("");

                /////////////setting first round, second round and total to Zero////////////
                int F = 0;
                int S = 0;
                
                int T = 0;

                s1.addparti(I, N, SN, C, Co, E,F,S,T);
            }
            else if(choice  == 2)
            {
                s1.show(); //////////////////////////////////Show/////////////////////////////////////
            }
            else if(choice == 3)
            {
                System.out.println("Enter participant ID : ");////////////////////////////////Search//////////////////////////////
                int na = obj.nextInt();
                s1.Search(na);
            }
            else if(choice == 4)
            {
                System.out.println("Enter Student Name : ");/////////////////////////////Delete////////////////////////////////////
                String N = obj.next();
                s1.Delparti(N);
            }
            else if(choice == 5)
            {
                System.out.println("Enter participant name to add results :     ");////////////////////////////////Round Results//////////////////////////////
                String na = obj.next();

                System.out.println("Enter participant  First Round Result :     ");
                int F = obj.nextInt();
                System.out.println("Enter participant  Second Round Result :    ");
                int S = obj.nextInt();

                String N = na;

                s1.rounds(N,F,S);

            }
            else if(choice == 6)
            {
                s1.Winner();
                s1.RemoveLowest();
            }
            else if(choice == 7)
            {
                System.exit(0);
            }
        }
    }
}
