package diary;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String body;
    private String dateCreated;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDateTime.now().toString();
    }


    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        if (body == null || body.trim().isEmpty()) {
            throw new IllegalArgumentException("Body cannot be null or empty");
        }
        this.body = body;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated.toString();
    }
    @Override
    public String toString() {
        return "Title: " + title + "\nContent: " + body +"\nID: " + id + "\nDateCreated: " + dateCreated;
    }
}
