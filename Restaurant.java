public class Restaurant
{
    private String name;
    private int sitzplaetze;
    private boolean vegetarisch;
    
    public Restaurant(String name, int sitzplaetze, boolean vegetarisch)
    {
        setName(name);
        setSitzplaetze(sitzplaetze);
        setVegetarisch(vegetarisch);
    }
    
    public Restaurant(String name, int sitzplaetze)
    {
        setName(name);
        setSitzplaetze(sitzplaetze);
        setVegetarisch(false);
    }
    
    public Restaurant(String name, boolean vegetarisch)
    {
        setName(name);
        setSitzplaetze(1);
        setVegetarisch(vegetarisch);
    }
    
    public Restaurant(int sitzplaetze, boolean vegetarisch)
    {
        setName("UNKN");
        setSitzplaetze(sitzplaetze);
        setVegetarisch(vegetarisch);
    }
    
    public Restaurant(String name)
    {
        setName(name);
        setSitzplaetze(1);
        setVegetarisch(false);
    }
    
    public Restaurant(int sitzplaetze)
    {
        setName("UNKN");
        setSitzplaetze(sitzplaetze);
        setVegetarisch(false);
    }
    
    public Restaurant(boolean vegetarisch)
    {
        setName("UNKN");
        setSitzplaetze(1);
        setVegetarisch(vegetarisch);
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
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setSitzplaetze(int sitzplaetze)
    {
        if((sitzplaetze >= 1) && (sitzplaetze <= 1000))
        {
            this.sitzplaetze = sitzplaetze;
        }
        else
        {
            System.out.println("Sitzplaetze value not supported");
            this.sitzplaetze = 1;
        }
    }
    
    public void setVegetarisch(boolean vegetarisch)
    {
        this.vegetarisch = vegetarisch;
    }
    
    /*
     print method with syntax:
     Roma Restaurant: 80 Sitzplaetze - true
     Akropolis Restaurant: 60 Sitzplaetze - true
     Steakhouse Restaurant: 100 Sitzplaetze - false
     */
    /*
     * Aenderung auf:
     * Restaurant: VeggieHouse - 80 Sitzplätze - vegetarisch
     * Restaurant: SteakHouse - 120 Sitzplätze - nicht vegetarisch
     */
    public void printRestaurant()
    {
        //old: System.out.println( name + " Restaurant: " + sitzplaetze + " Sitzplaetze" + " – " + vegetarisch);
        //new:
        if(vegetarisch = true)
        {
            System.out.println("Restaurant: " + name + " – " + sitzplaetze + " Sitzplaetze" + " – vegetarisch");
        }
        else
        {
            System.out.println("Restaurant: " + name + " – " + sitzplaetze + " Sitzplaetze" + " – nicht vegetarisch");
        }
        

    }
}