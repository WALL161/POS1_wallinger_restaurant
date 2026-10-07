public class Restaurant
{
    private String name;
    private int sitzplaetze;
    private boolean vegetarisch;
    
    public Restaurant(String newName, int newSitzplaetze, boolean newVegetarisch)
    {
        setName(newName);
        setSitzplaetze(newSitzplaetze);
        setVegetarisch(newVegetarisch);
    }
    
    public Restaurant(String newName, int newSitzplaetze)
    {
        setName(newName);
        setSitzplaetze(newSitzplaetze);
        setVegetarisch(false);
    }
    
    public Restaurant(String newName, boolean newVegetarisch)
    {
        setName(newName);
        setSitzplaetze(0);
        setVegetarisch(newVegetarisch);
    }
    
    public Restaurant(int newSitzplaetze, boolean newVegetarisch)
    {
        setName("UNKN");
        setSitzplaetze(newSitzplaetze);
        setVegetarisch(newVegetarisch);
    }
    
    public Restaurant(String newName)
    {
        setName(newName);
        setSitzplaetze(0);
        setVegetarisch(false);
    }
    
    public Restaurant(int newSitzplaetze)
    {
        setName("UNKN");
        setSitzplaetze(newSitzplaetze);
        setVegetarisch(false);
    }
    
    public Restaurant(boolean newVegetarisch)
    {
        setName("UNKN");
        setSitzplaetze(0);
        setVegetarisch(newVegetarisch);
    }
    
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