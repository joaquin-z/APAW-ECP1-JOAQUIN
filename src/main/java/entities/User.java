package entities;

import java.util.Calendar;

public class User {
    
    private long id;

    private String name;

    private Calendar birthday;

    private boolean active;
    
    public User(long id, String name, Calendar birthday, boolean active) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public boolean isActive() {
        return active;
    }    
    
}
