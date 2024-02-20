import javax.swing.*;

public class App {
    public static void main(String[] args){
        // these are the dimensions of our background image
        int boardwidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setVisible(true);
        frame.setSize(boardwidth, boardHeight);
        frame.setLocationRelativeTo(null);
        // prevent resizing
        frame.setResizable(false);
        // terminates the program when 'x' on top corner is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        frame.setVisible(true);

    }
}
