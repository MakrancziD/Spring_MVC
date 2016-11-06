package elosztott.model;

import java.util.List;

/**
 * Created by makra on 2016. 09. 26..
 */

public class User {


    private String username;
    private int credit;
    private String school;
    private List<String> color;
    private String gender;

    public User(String _username, String _school, List<String> _color, String _gender) {
        setUsername(_username);
        setSchool(_school);
        setColor(_color);
        setGender(_gender);
        credit = 0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getUsername();
    }
}
