package meh;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class HeartAnimation extends JPanel {
    private double scale = 1.0;
    private boolean growing = true;

    public HeartAnimation() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.BLACK);
        new Timer(30, e -> {
            scale += growing ? 0.02 : -0.02;
            if (scale >= 1.3) growing = false;
            if (scale <= 0.9) growing = true;
            repaint();
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int cx = getWidth() / 2, cy = getHeight() / 2;
        g2.translate(cx, cy);
        g2.scale(scale, scale);

        GeneralPath heart = new GeneralPath();
        int n = 300;
        for (int i = 0; i <= n; i++) {
            double t = 2 * Math.PI * i / n;
            double x =  16 * Math.pow(Math.sin(t), 3);
            double y = -(13 * Math.cos(t) - 5 * Math.cos(2*t) - 2 * Math.cos(3*t) - Math.cos(4*t));
            x *= 10; y *= 10;
            if (i == 0) heart.moveTo(x, y);
            else        heart.lineTo(x, y);
        }
        heart.closePath();

        g2.setPaint(new GradientPaint(0, -130, new Color(255, 50, 50), 0, 100, new Color(180, 0, 0)));
        g2.fill(heart);
        g2.setColor(new Color(255, 120, 120));
        g2.setStroke(new BasicStroke(2));
        g2.draw(heart);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("❤");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new HeartAnimation());
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
