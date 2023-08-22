package za.ca.cput.domain;

public class NewUser {
    private String name;
    private String surname;
    private String email;
    private String password;

    public NewUser() {
    }

    public NewUser(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public static class Builder{
        private String name;
        private String surname;
        private String email;
        private String password;

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

        public NewUser build(){
            return new NewUser(this.name, this.surname, this.email, this.password);
        }
    }

    @Override
    public String toString() {
        return "NewUser{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                '}';
    }
}
