public class DB
{
    private DB() {}
     
    private static DB INSTANCE = null;
     
    public static DB getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new DB(); 
        }
        return INSTANCE;
    }

    public Boolean hasAccess(String name) { return true; }

}