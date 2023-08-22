package za.ca.cput.domain;

public class User {

    private String name;
    private String surname;
    private String email;
    private String password;
    private String id;

    public User() {
    }

    public User(String name, String surname, String email, String password, String id) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public static class Builder{

        private String name;
        private String surname;
        private String email;
        private String password;
        private String id;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }

    private User(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.password = builder.password;
        this.id = builder.id;
    }

    @Override
    public String toString(){
        return "User{" + "name=" + name + ", surname=" + surname + ", email=" + email + ", password=" + password + ", id=" + id + '}';
    }
}
