package model;

public class Contacts {
    private String name;
    private String phoneNo;
    private int imageId;

    public Contacts(String name, String phoneNo, int imageId)

    {
        this.name=name;
        this.phoneNo=phoneNo;
        this.imageId=imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getImage() {
        return imageId;
    }

    public void setImage(int imageId) {
        this.imageId = imageId;
    }
}
