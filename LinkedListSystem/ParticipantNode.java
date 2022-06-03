public class ParticipantNode{

    int ID;

    String name;
    String sirname;
    String city;
    int contact;
    String email;

    int firstround;
    int secondround;

    int total;

    ParticipantNode nextNode;//Pointer To Next Node

    public ParticipantNode(int I, String N,String SN, String C, int Co, String E, int F, int S, int T)
    {

        ID = I;

        name    = N;
        sirname = SN;
        city    = C;
        contact = Co;
        email   = E;

        firstround = F;
        secondround = S;
        total = T;


    }
}//End of ParticipantNode