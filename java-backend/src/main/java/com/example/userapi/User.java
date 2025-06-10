public class User {
    private int id;
    private String name;
    private String email;

    // Constructors, getters, and setters

    public User(String email, int id, String name) {
        this.email = email;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

}
