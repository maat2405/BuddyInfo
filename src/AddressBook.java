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

    public boolean removeBuddy(BuddyInfo buddy)
    {
        return buddies.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("John", "123 LeBron St.", "613-123-4567");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
