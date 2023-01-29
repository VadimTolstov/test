package zadachi.OknoSwing;


import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class MouseMotionListenter implements MouseMotionListener {

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Движение мыши С " + e.getX() + "," + e.getY());

    }
}

