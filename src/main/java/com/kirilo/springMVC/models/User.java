package com.kirilo.springMVC.models;

import java.io.Serializable;

//    https://intellij-support.jetbrains.com/hc/en-us/community/posts/206957655-What-happened-to-the-generate-serialVersionUID-feature-?page=1#community_comment_206678425
//    https://stackoverflow.com/questions/888335/why-generate-long-serialversionuid-instead-of-a-simple-1l
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String password;
    private boolean admin;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
