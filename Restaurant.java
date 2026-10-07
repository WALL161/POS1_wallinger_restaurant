public class Restaurant
{
    private String name;
    private int sitzplaetze;
    private boolean vegetarisch;
    
    public String getName()
    {
        return name;
    }
    
    public int getSitzplaetze()
    {
        return sitzplaetze;
    }
    
    public boolean getVegetarisch()
    {
        return vegetarisch;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setSitzplaetze(int newSitzplatze)
    {
        sitzplaetze = newSitzplatze;
    }
    
    public void setVegetarisch(boolean newVegetarisch)
    {
        vegetarisch = newVegetarisch;
    }
}