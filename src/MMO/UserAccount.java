package MMO;

import java.util.ArrayList;

public class UserAccount {

    private String UserName;
    private String Password;
    private String Email;
    private ArrayList<Character>CharacterList;
    private boolean admin;


    public UserAccount(String UserName, String Password, String Email, boolean admin) {
            this.UserName = UserName;
            this.Password = Password;
            this.Email = Email;
            this.CharacterList = new ArrayList<>();
            this.admin = false;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public ArrayList<Character> getCharacterList() {
        return CharacterList;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setCharacterList(ArrayList<Character> characterList) {
        CharacterList = characterList;
    }


    public  boolean isAdmin() {
            return true;
    }
}
