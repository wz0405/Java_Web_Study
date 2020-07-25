package day0604;

public class BoardDTO_3 {
    private String name;
    private String subject;
    private String content;

    public BoardDTO_3() {

    }

    public BoardDTO_3(String name, String sub, String cont) {
        this.name = name;
        this.subject = sub;
        this.content = cont;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
