import java.awt.*;


public class Cubo extends Canvas {
    public static final int SALTO = 100;

    public Cubo() {
        setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);

        //angulos
       g.drawLine(100, 300, 340, 120);//1


        //cuadro
        g.drawLine(100, 300, 100, 900);//1 I
        g.drawLine(700, 300, 700, 900);//2 I
        g.drawLine(940, 720, 940, 120);



        for (int i = 20; i <= 650; i += 50) {
            //linea orizontal


            g.drawLine(700, 280 + i, 940, 100 + i);
        }


        dibujarFrente(g);
    }

    private void dibujarFrente(Graphics g) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                //lineas frente

                g.drawLine(150 + j * SALTO, 300 + i * SALTO, 150 + j * SALTO, 350 + i * SALTO);
                g.drawLine(100 + j * SALTO, 350 + i * SALTO, 100 + j * SALTO, 400 + i * SALTO);
                g.drawLine(720 + j * 40, 285 - j * 30 + i * SALTO, 720 + j * 40, 335 - j * 30 + i * SALTO);
                g.drawLine(700 + j * 40, 400 - j * 30 + i * SALTO, 700 + j * 40, 350 - j * 30 + i * SALTO);

                g.drawLine(100+i*40+j*SALTO, 300-i*30, 120+i*40+j*SALTO, 285-i*30);

                g.drawLine(190+i*40+j*SALTO, 270-i*30, 170+i*40+j*SALTO, 285-i*30);


            }
        }
        //Linea Orizontal
        for (int i = 0; i < 13; i++) {

                g.drawLine(100+i*20, 300 - i * 15, 700+i*20, 300 - i * 15);
                g.drawLine(100, 300+i*SALTO/2, 700, 300+i*SALTO/2);

                
        }
    }
}