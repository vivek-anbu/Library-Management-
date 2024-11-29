package Library;

	public class Book {
	    private String id;               //book id
	    private String title; 			//title			
	    private String author;			//author
	    private String publishYear;		//publish year
	    private String status;			//Available status

	    public Book() {
	    }

	    public Book(String id, String title, String author, String publishYear, String status) {
	        this.id = id;
	        this.title = title;
	        this.author = author;
	        this.publishYear = publishYear;
	        this.status = status;
	    }

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public String getPublishYear() {
	        return publishYear;
	    }

	    public void setPublishYear(String publishYear) {
	        this.publishYear = publishYear;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    @Override
	    public String toString() {
	        String text= "id='" + id + '\'' +", title=" + title + '\'' +", author=" + author + '\'' +", publishYear=" + publishYear + '\'' +
	                ", status=" + status + '\'' ;
	        return text;
	    }
}

