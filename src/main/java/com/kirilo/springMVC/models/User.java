package com.kirilo.springMVC.models;

import java.io.Serializable;

//    https://intellij-support.jetbrains.com/hc/en-us/community/posts/206957655-What-happened-to-the-generate-serialVersionUID-feature-?page=1#community_comment_206678425
//    https://stackoverflow.com/questions/888335/why-generate-long-serialversionuid-instead-of-a-simple-1l
public class User implements Serializable {
    private static final long serialVersionUID = 16456546546546L;

    private String name;
    private String password;
    private boolean admin;

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
}
