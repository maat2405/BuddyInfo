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
        if (buddy != null)
        {
            this.buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index)
    {
        if (index >= 0 && index < buddies.size()) {
            return buddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("John", "123 LeBron St.", "613-123-4567");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
