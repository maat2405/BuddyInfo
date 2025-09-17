//UPDATED IN GITHUB 2025-09-17 12:30pm


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

    public boolean removeBuddy(BuddyInfo buddy)
    {
        if (buddy != null) {
            return buddies.remove(buddy);
        }
        return false;
    }

    public int numberOfBuddies() {
        return buddies.size();
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("John", "123 LeBron St.", "613-123-4567");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        int numOfBuddies = addressBook.numberOfBuddies();
        System.out.println("You have " + numOfBuddies + " friends!" );
    }
}
