package book;

public class Contact {
    private String contactName;
    private String phone;

    public Contact() {
    }

    public Contact(String contactName, String phone) {
        this.contactName = contactName;
        this.phone = phone;
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return String.format(" %10s%10s%10s | %10s%10s%10s \n",
                "",contactName,"",
                "",phone,"");
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
