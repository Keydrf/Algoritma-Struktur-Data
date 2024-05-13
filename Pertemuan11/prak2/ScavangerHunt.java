package Pertemuan11.prak2;

public class ScavangerHunt {
    Point startPoint;
    Point currentPoint;
    
    public ScavangerHunt(){
        startPoint = null;
        currentPoint = null;
    }

    public void addPoint(String question, String answer){
        Point newPoint = new Point(question, answer);
        if (startPoint == null){
            startPoint = newPoint;
            currentPoint = newPoint;
        } else {
            currentPoint.nextPoint = newPoint;
            currentPoint = newPoint;
        }
    }

    public String getNextQuestion(){
        if(currentPoint == null){
            return "Game over. You've found the treasure!";
        } else {
            return currentPoint.question;
        }
    }

    public String checkAnswer(String userAnswer){
        if(currentPoint == null){
            return "Game over. You've found the treasure!";
        } else if(userAnswer.equalsIgnoreCase(currentPoint.answer)){
            currentPoint = currentPoint.nextPoint;
            if(currentPoint == null){
                return "Congratulations! You've found the treasure!";
            } else {
                return "Correct! Here's your next question: "+currentPoint.question;
            }
        } else {
            return "Incorrect. Try again!";
        }
    }
}
