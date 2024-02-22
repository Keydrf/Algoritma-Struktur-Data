package Pertemuan2;

public class Dragon13 {
    
        private int x;
        private int y;
        private int width;
        private int height;
    
        public Dragon13(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    
        public void moveLeft() {
            if (x > 0) {
                x--;
            } else {
                detectCollision();
            }
        }
    
        public void moveRight() {
            if (x < width - 1) {
                x++;
            } else {
                detectCollision();
            }
        }
    
        public void moveUp() {
            if (y > 0) {
                y--;
            } else {
                detectCollision();
            }
        }
    
        public void moveDown() {
            if (y < height - 1) {
                y++;
            } else {
                detectCollision();
            }
        }
    
        public void printPosition() {
            System.out.println("Position: (" + x + ", " + y + ")");
        }
    
        private void detectCollision() {
            System.out.println("Game Over");
        }
    
        public static void main(String[] args) {
            Dragon13 dragon = new Dragon13(0, 0, 10, 10);
    
            dragon.moveRight();
            dragon.printPosition();
    
            dragon.moveDown();
            dragon.printPosition();
    
            // Trying to move out of bounds to trigger detectCollision
            dragon.moveDown();
            dragon.printPosition();
        }
    
}
