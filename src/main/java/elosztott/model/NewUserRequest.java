package elosztott.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by makra on 2016. 09. 26..
 */

public class NewUserRequest {

    @NotNull
    @Size(min=3, max = 30)
    private String username;

    @NotNull
    private int credit;
    private String vegzettseg;
    private List<String> color;
    private String nem;

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

    public String getVegzettseg() {
        return vegzettseg;
    }

    public void setVegzettseg(String vegzettseg) {
        this.vegzettseg = vegzettseg;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public String getNem() {
        return nem;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }
}
