package models;

public class Student {
    private long id;
    private String name;
    private String photoPath;

    public Student(long id, String name, String photoPath) {
        this.id = id;
        this.name = name;
        this.photoPath = photoPath;
    }

    public Student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
}
