public class BuddyInfo
{
    private String name;
    private String address;
    private String number;

    public BuddyInfo(String name, String address, String number)
    {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public BuddyInfo()
    {
        this.name = "LeBron";
        this.address = "123 Laker Ave.";
        this.number = "613";
    }

    public String getName()
    {
        return name;
    }

    public static void main(String[] args)
    {
        BuddyInfo buddy = new  BuddyInfo();
        String name = buddy.getName();
        System.out.println("Hello " + name);
    }
}
