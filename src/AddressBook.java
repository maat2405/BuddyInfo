import java.util.ArrayList;

public class AddressBook
{
    private ArrayList<BuddyInfo> buddies;

    public AddressBook()
    {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy)
    {
        this.buddies.add(buddy);
    }

    public boolean removeBuddy(String name)
    {
        return this.buddies.removeIf(buddy -> buddy.getName().equals(name));
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
