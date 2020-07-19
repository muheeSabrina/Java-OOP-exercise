package week3.exercises;

public class BookShop {
    public String title;
    public String author;
    int id;
    BookShop(int id){
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }
    public String toString()
    {
        return "Book id : " + getId() + "\tBook title:"+ getTitle() + "\tBook Author:"+ getAuthor() + "\n";
    }
}

