
public class NameEmail {
    private String name1;
    private String email1;

    public NameEmail () {

    } public NameEmail (String name1, String email1) {
        this.name1= name1;
        this.email1 = email1;
    } public String getName1() {
        return name1;
    } public void setName1 (String name1) {
        this.name1 = name1;
    } public String getEmail1 () {
        return email1;
    } public void setEmail1 (String email1) {
        this.email1 = email1;
    }

    @Override
    public String toString() {
        return "NameEmail{" +
                "name1='" + name1 + '\'' +
                ", email1='" + email1 + '\'' +
                '}';
    }
}