package zadachi.OknoSwing;

import javax.swing.JFrame;

public class MainOknoSwing {
    public static void main(String[] args) {
        //создано окно
        JFrame jf =new JFrame();
        //Установить ему размер
        jf.setSize(400, 300);
        //и показываем его
            jf.setVisible(true);

            jf.addMouseListener(new SimpleClickListener());

            jf.addMouseMotionListener(new MouseMotionListenter());

              }
}
