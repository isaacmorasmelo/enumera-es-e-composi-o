package entities;

import java.text.SimpleDateFormat;

public class client {

    private static SimpleDateFormat birthDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private String name;
    private String Gmail;

    public client() {
    }

    public client(String name, String gmail) {
        this.name = name;
        Gmail = gmail;
    }

    public static SimpleDateFormat getBirthDate() {
        return birthDate;
    }

    public static void setBirthDate(SimpleDateFormat birthDate) {
        client.birthDate = birthDate;
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
}
