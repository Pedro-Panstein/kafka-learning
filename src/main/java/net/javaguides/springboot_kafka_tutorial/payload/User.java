package net.javaguides.springboot_kafka_tutorial.payload;

public class User {
    private int id;
    private String name;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nUser " +
                "\nID: " + id +
                "\nName: " + name +
                "\nType: " + type;
    }
}
