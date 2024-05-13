package Pertemuan11.prak2;

public class Point {
    String question;
    String answer;
    Point nextPoint;

    public Point(String question, String answer){
        this.question = question;
        this.answer = answer;
        this.nextPoint = null;
    }
}
