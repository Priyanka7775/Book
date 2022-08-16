package data;

public class Book {
    private String tittle;
    private int yearOfPublishing;
    private long isbnNumber;
    private String authorName;

    public void setTittle(String tittle){
        this.tittle=tittle;
    }
    public String getTittle(){
        return tittle;
    }

    public void setYearOfPublishing(int yearOfPublishing){
        this.yearOfPublishing=yearOfPublishing;
    }
    public int getYearOfPublishing(){
        return yearOfPublishing;
    }

    public void setIsbnNumber(long isbnNumber){
        this.isbnNumber=isbnNumber;
    }
    public long getIsbnNumber(){
        return isbnNumber;
    }

    public void setAuthorName(String xyz){
        this.authorName=authorName;
    }
    public String getAuthorName(){
        return authorName;
    }
}
