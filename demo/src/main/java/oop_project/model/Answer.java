package model;

public class Answer {
    private String text;
    private Answer(String text){
        this.text = (test == null) ? "" : text;
    }
    public static Answer fromText(String text){
        return new Answer(text);
    }
    public static getText(){
        return text;
    }
}
