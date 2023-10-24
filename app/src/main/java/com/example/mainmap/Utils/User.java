package com.example.mainmap.Utils;
import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.ArrayList;

public class User {

    private int userID;
    private int password;
    private int affiliation;
    // https://stackoverflow.com/questions/19285556/how-to-store-an-image-in-a-variable-in-java-android-development
    private Bitmap image;
    private ImageView profilePicture;
    private ArrayList<Reservation> seatHistory;

    public User(int userID, int password, int affiliation, Bitmap image, ImageView profilePicture, ArrayList<Reservation> seatHistory) {
        this.userID = userID;
        this.password = password;
        this.affiliation = affiliation;
        this.image = image;
        this.profilePicture = profilePicture;
        this.seatHistory = seatHistory;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(int affiliation) {
        this.affiliation = affiliation;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public ImageView getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(ImageView profilePicture) {
        this.profilePicture = profilePicture;
    }

    public ArrayList<Reservation> getSeatHistory() {
        return seatHistory;
    }

    public void setSeatHistory(ArrayList<Reservation> seatHistory) {
        this.seatHistory = seatHistory;
    }


}
