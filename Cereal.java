public class Cereal
{
    private String name;
    private int calories,fiber,carbs,cups;
    public Cereal(String name,int calories,int fiber,int carbs,int cups)
    {
        this.name=name;
        this.calories=calories;
        this.fiber=fiber;
        this.carbs=carbs;
        this.cups=cups;
    }
    public String getName()
    {
        return this.name;
    }
    public int getCalories()
    {
        return this.calories;
    }
    public int getFiber()
    {
        return this.fiber;
    }
    public int getCarbs()
    {
        return this.carbs;
    }
    public int getCups()
    {
        return this.cups;
    }
    public String toString()
    {
        String cerealData = this.name+" "+this.calories+" "+this.fiber+" "+this.carbs+" "+this.cups;
        return cerealData;
    }
}