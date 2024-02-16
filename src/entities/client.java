package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class client {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private String Gmail;
    private Date birthDate;

    public client() {
    }

    public client(String name, String gmail, Date BirthDate) {
        this.name = name;
        Gmail = gmail;
        this.birthDate = BirthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public String toString() {
        return name + " (" + sdf.format (birthDate) + ") - " + Gmail;
    }
}
