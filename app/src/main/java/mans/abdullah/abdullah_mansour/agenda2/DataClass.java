package mans.abdullah.abdullah_mansour.agenda2;

public class DataClass
{
    String bookname,bookauthor,bookpublisher,publishdate,description,imageurl;

    public DataClass(String bookname, String bookauthor, String bookpublisher, String publishdate, String description, String imageurl) {
        this.bookname = bookname;
        this.bookauthor = bookauthor;
        this.bookpublisher = bookpublisher;
        this.publishdate = publishdate;
        this.description = description;
        this.imageurl = imageurl;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public String getBookpublisher() {
        return bookpublisher;
    }

    public void setBookpublisher(String bookpublisher) {
        this.bookpublisher = bookpublisher;
    }

    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
