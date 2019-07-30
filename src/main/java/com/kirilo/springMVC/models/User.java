package com.kirilo.springMVC.models;

import java.io.Serializable;
import javax.validation.constraints.Size;

//    https://intellij-support.jetbrains.com/hc/en-us/community/posts/206957655-What-happened-to-the-generate-serialVersionUID-feature-?page=1#community_comment_206678425
//    https://stackoverflow.com/questions/888335/why-generate-long-serialversionuid-instead-of-a-simple-1l
public class User implements Serializable {
    private static final long serialVersionUID = -5253061187045326968L;

    @Size(min = 6, message = "{name.size.error}")
    private String username;
    @Size(min = 5, max = 10, message = "{password.size.error}")
    private String password;
    private boolean admin;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
