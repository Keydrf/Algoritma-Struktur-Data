package Pertemuan2;

public class Dragon {
    int x, y, width, height;
    public Dragon(int xi, int yi, int widthi, int heighti){
        x = xi;
        y = yi;
        width = widthi;
        height = heighti;  
    }
    void moveLeft(){
        if (x > 0){
            x--;
        } else{
            detectCollision();
        }
    }
    void moveRight(){
        if (x < width-1){
        x++;
        } else{
        detectCollision();
        }
    }
    void moveUp(){
        if (y > 0){
            y--;
        }else{
            detectCollision();
        }
    }
    void moveDown(){
        if(y < height -1){
            y++;
        }else{
            detectCollision();
        }
    }
    void printPosition(){
       System.out.println("Position: ("+x+", "+y+")"); 
    }
    void detectCollision(){
        System.out.println("Game over");
    }

    public static void main(String[] args) {
        Dragon dragon13 = new Dragon(0, 0, 5, 3);

        dragon13.moveDown();
        dragon13.printPosition();

        dragon13.moveUp();
        dragon13.printPosition();

        dragon13.moveRight();
        dragon13.printPosition();

        dragon13.moveLeft();
        dragon13.printPosition();
    }
}