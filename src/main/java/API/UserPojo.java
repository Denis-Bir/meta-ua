package API;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;

public class UserPojo {

    private int id;
    private String email;

    @JsonProperty("first_name")
    private String firstname;

    @JsonProperty("last_name")
    private String lastname;
    private String avatar;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getFirstname() {return firstname;}
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
    public String getAvatar() {return avatar;}
    public void setAvatar(String avatar) {this.avatar = avatar;    }





}
