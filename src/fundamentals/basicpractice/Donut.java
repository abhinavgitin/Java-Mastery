public class Donut {
    // this java file makes a rotating donut in one new window
    public static void main(String[] args) {
        
        javax.swing.JFrame frame = new javax.swing.JFrame("Rotating Donut");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // we will create a new panel to draw the donut
        javax.swing.JPanel panel = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                // we will draw the donut here
                g.setColor(java.awt.Color.GREEN);
                g.fillOval(100, 100, 200, 200);
                g.setColor(java.awt.Color.WHITE);
                g.fillOval(150, 150, 100, 100);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
