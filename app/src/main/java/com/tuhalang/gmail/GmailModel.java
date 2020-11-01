package com.tuhalang.gmail;

public class GmailModel {
    String fullname;
    int avatarResource;
    String description;
    boolean isSelected;

    public GmailModel(String fullname, String description) {
        this.fullname = fullname;
        this.description = description;
        this.avatarResource = avatarResource;
        this.isSelected = false;
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAvatarResource() {
        return avatarResource;
    }

    public void setAvatarResource(int avatarResource) {
        this.avatarResource = avatarResource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
