public class ParticipantNode{

    int ID;

    String name;
    String sirname;

    ParticipantNode nextNode;//Pointer To Next Node

    public ParticipantNode(int I, String N,String SN)
    {
        ID = I;

        name    = N;
        sirname = SN;
    }
}//End of ParticipantNode