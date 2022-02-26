public class ArrayList_Remove 
{
    public static void main(String[] args) 
    {
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "Vedant", "Pranav", "Sandeep") );
         
        System.out.println(namesList);  
         
        
        namesList.remove(1);
         
        System.out.println(namesList);  
    }
}
