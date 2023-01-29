package Igri;

public class Tank {
    int position;

    public void goForward(int move) {
        position += move;

    }

    /*public  void goForward(int move){
        this.move=move;
        int move = 0;
        if(move >0) position = move;
        }*/
    public void goBackward(int move) {
        position -= move;
    }

    public void printPosition() {
        System.out.println("The Tank is at " + position + " now");
    }
}

