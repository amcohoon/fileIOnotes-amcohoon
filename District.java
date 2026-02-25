
/**
 * Models a voting district.
 * 
 * Keeps track of district number, republican votes, and democratic votes.
 *
 * @author 
 * @version 
 */
public class District
{
    private int number,demVotes,gopVotes;
    public District(int districtNumber, int democratVotes,int republicanVotes)
    {
        this.number = districtNumber;
        this.demVotes = democratVotes;
        this.gopVotes = republicanVotes;
    }
    public int getDistrictNumber()
    {
        return this.number;
    }
    public int getDemocratVotes()
    {
        return this.demVotes;
    }
    public int getRepublicanVotes()
    {
        return this.gopVotes;
    }
    public int getAllVotes()
    {
        return this.demVotes + this.gopVotes;
    }
}
