package Proyecto_unidad_2;

import java.awt.*;
import java.awt.event.*;
import static java.lang.Boolean.FALSE;
import javax.swing.*;

public class Ventana extends JPanel implements ActionListener, KeyListener, MouseMotionListener, MouseListener, MouseWheelListener {

    private final JFrame ventana;
    private final Container contenedor;
    private Punto[] figura;
    public JMenuBar transformaciones, traslacion;
    public JMenu uno, dos;
    public JMenuItem u1, u2, u3, u4, u5, u6, u7, u8, accion1, accion2, accion3, accionRestablecer;
    public JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, botonArriba, botonAbajo, botonIzquierda,
            botonDerecha, botonTeclado, botonRestablecer;

    public Ventana(String título, Punto[] figura) {
        //botones
        // escalar
        boton1 = new JButton("+");
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("-");
        boton2.addActionListener(this);
        add(boton2);

        //Rotaciones
        boton3 = new JButton("=>");
        boton3.addActionListener(this);
        add(boton3);

        boton4 = new JButton("<=");
        boton4.addActionListener(this);
        add(boton4);

        //reflexiones x  y  xy
        boton5 = new JButton("Reflexion x");
        boton5.addActionListener(this);
        add(boton5);

        boton6 = new JButton("Reflexion y");
        boton6.addActionListener(this);
        add(boton6);

        boton7 = new JButton("Reflexion xy");
        boton7.addActionListener(this);
        add(boton7);

        // deformacion
        boton8 = new JButton("Deformacion");
        boton8.addActionListener(this);
        add(boton8);

        //boton restablecer figura
        botonRestablecer = new JButton("Reset");
        botonRestablecer.addActionListener(this);
        add(botonRestablecer);
        
        //salir
        boton9 = new JButton("Salir");
        boton9.addActionListener(this);
        add(boton9);

        //
        boton1.setFocusable(FALSE);
        boton2.setFocusable(FALSE);
        boton3.setFocusable(FALSE);
        boton4.setFocusable(FALSE);
        boton5.setFocusable(FALSE);
        boton6.setFocusable(FALSE);
        boton7.setFocusable(FALSE);
        boton8.setFocusable(FALSE);
        botonRestablecer.setFocusable(FALSE);
        

        // color botones
        boton1.setBackground(Color.white);
        boton2.setBackground(Color.white);
        boton3.setBackground(Color.white);
        boton4.setBackground(Color.white);
        boton5.setBackground(Color.white);
        boton6.setBackground(Color.white);
        boton7.setBackground(Color.white);
        boton8.setBackground(Color.white);
        botonRestablecer.setBackground(Color.green);
        boton9.setBackground(Color.red);

        ventana = new JFrame(título);
        ventana.setSize(1200, 600);

        //TECLADO
        ventana.addKeyListener(this);

        // MOUSE CON MOVIMIENTO DE CURSOS
        ventana.addMouseMotionListener(this);

        // CLICK BOTONES DE MOUSE
        ventana.addMouseListener(this);
        ventana.addMouseWheelListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
        transformaciones = new JMenuBar();
        uno = new JMenu("Transformaciones");
        traslacion = new JMenuBar();
        dos = new JMenu("Translaciones¨");

        //menu de transformaciones
        u1 = new JMenuItem("Escalar.", new javax.swing.ImageIcon("src/imagenes/Escalar.png"));
        u2 = new JMenuItem("Rotar Derecha.", new javax.swing.ImageIcon("src/imagenes/der.png"));
        u3 = new JMenuItem("Rotar Izquierda.", new javax.swing.ImageIcon("src/imagenes/izq.png"));
        u4 = new JMenuItem("Traslación.", new javax.swing.ImageIcon("src/imagenes/Traslacion.png"));
        u5 = new JMenuItem("Reflexión.X.", new javax.swing.ImageIcon("src/imagenes/ReflexionX.png"));
        u6 = new JMenuItem("Reflexión.Y.", new javax.swing.ImageIcon("src/imagenes/ReflexionY.png"));
        u7 = new JMenuItem("Reflexión.XY.", new javax.swing.ImageIcon("src/imagenes/ReflexionXY.png"));
        u8 = new JMenuItem("Deformacion.", new javax.swing.ImageIcon("src/imagenes/deformacion.png"));
        accionRestablecer = new JMenuItem("Restablecer.", new javax.swing.ImageIcon("src/imagenes/restablecer.png"));

        // se agregan las opciones de las distintas transformaciones
        add(transformaciones);
        transformaciones.add(uno);

        uno.add(u1);
        u1.addActionListener(this);

        uno.add(u2);
        u2.addActionListener(this);

        uno.add(u3);
        u3.addActionListener(this);

        uno.add(u4);
        u4.addActionListener(this);

        uno.add(u5);
        u5.addActionListener(this);

        uno.add(u6);
        u6.addActionListener(this);

        uno.add(u7);
        u7.addActionListener(this);

        uno.add(u8);
        u8.addActionListener(this);

        uno.add(accionRestablecer);
        accionRestablecer.addActionListener(this);

        //Botones del menu de rotaciones
        botonArriba = new JButton(new javax.swing.ImageIcon("src/imagenes/arriba.png"));
        botonArriba.addActionListener(this);

        botonAbajo = new JButton(new javax.swing.ImageIcon("src/imagenes/abajo.png"));
        botonAbajo.addActionListener(this);

        botonDerecha = new JButton(new javax.swing.ImageIcon("src/imagenes/der.png"));
        botonDerecha.addActionListener(this);

        botonIzquierda = new JButton(new javax.swing.ImageIcon("src/imagenes/izq.png"));
        botonIzquierda.addActionListener(this);
        
        //
        botonArriba.setFocusable(FALSE);
        botonAbajo.setFocusable(FALSE);
        botonDerecha.setFocusable(FALSE);
        botonIzquierda.setFocusable(FALSE);
        
        // color botones
        botonArriba.setBackground(Color.white);
        botonAbajo.setBackground(Color.white);
        botonDerecha.setBackground(Color.white);
        botonIzquierda.setBackground(Color.white);

        // se agregan los botones al menu
        add(traslacion);
        traslacion.add(dos);

        dos.add(botonArriba);
        botonArriba.addActionListener(this);

        dos.add(botonAbajo);
        botonAbajo.addActionListener(this);

        dos.add(botonDerecha);
        botonDerecha.addActionListener(this);

        dos.add(botonIzquierda);
        botonIzquierda.addActionListener(this);

        //Boton para mostrar atajos de mouse y teclado
        botonTeclado = new JButton("Atajos");
        botonTeclado.addActionListener(this);
        //se agrega el botoon
        add(botonTeclado);
        // color botones
        botonTeclado.setBackground(Color.white);
        //
        botonTeclado.setFocusable(FALSE);
       

//-----------------------------------------------------------------
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);
        contenedor.add(this, BorderLayout.CENTER);

        this.figura = figura;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        this.dibujar(g);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == u1) {
            double x = 0, y = 0;
            x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese x"));
            y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese y"));
            this.escalar(x, y);
            repaint();
        } else if (e.getSource() == u2) {
            double angulo = 0;
            angulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese angulo para rotara a la derecha"));
            this.rotación1(angulo);
            repaint();

        } else if (e.getSource() == u3) {
            double angulo = 0;
            angulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  ángulo para rotar a la izquierda"));
            this.rotación2(angulo);
            repaint();

        } else if (e.getSource() == u4) {
            double x = 0, y = 0;
            x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese  X para escalar:"));
            y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese  Y para escalar:"));
            this.traslación(x, y);
            repaint();
        } else if (e.getSource() == u5) {
            this.reflexiónX();
            repaint();
        } else if (e.getSource() == u6) {
            this.reflexiónY();
            repaint();
        } else if (e.getSource() == u7) {
            this.reflexiónXY();
            repaint();
        } else if (e.getSource() == u8) {
            double x = 0, y = 0;
            x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese  X para escalar:"));
            y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese  Y para escalar:"));
            this.deformación(x, y);
            repaint();
        } else if (e.getSource() == accionRestablecer) {
            this.reset();
            repaint();
            //botones
        } else if (e.getSource() == boton1) {
            this.escalar(1.5, 1.5);
            repaint();

        } else if (e.getSource() == boton2) {
            this.escalar(.5, .5);
            repaint();
            // rotaciones
        } else if (e.getSource() == boton3) {
            this.rotación1(1.5);
            repaint();
        } else if (e.getSource() == boton4) {
            this.rotación2(1.5);
            repaint();
        } else if (e.getSource() == botonArriba) {
            this.traslación(0, -30);
            repaint();
        } else if (e.getSource() == botonAbajo) {
            this.traslación(0, 30);
            repaint();
        } else if (e.getSource() == botonDerecha) {
            this.traslación(30, 0);
            repaint();
        } else if (e.getSource() == botonIzquierda) {
            this.traslación(-30, 0);
            repaint();
        } else if (e.getSource() == boton5) {
            this.reflexiónX();
            repaint();
        } else if (e.getSource() == boton6) {
            this.reflexiónY();
            repaint();
        } else if (e.getSource() == boton7) {
            this.reflexiónXY();
            repaint();
        } else if (e.getSource() == boton8) {
            this.deformación(.2, .2);
            repaint();
        } else if (e.getSource() == botonRestablecer) {
            this.reset();
            repaint();
        } else if (e.getSource() == boton9) {
            System.exit(0);
        } else if (e.getSource() == botonTeclado) {
            JOptionPane.showMessageDialog(null, "   =================================== [ATAJOS DE TECLADO] =================================" + "\n" + "*IMPORTANTE BLOQUEAR MAYUSCULAS*" + "\n" + "ALT+B" + "\n"
                    + "SHIFT+G:= Hacer grande la figura" + "\n" + "SHIFT+C:= Hacer chica la imagen" + "\n" + "SHIFT+D:= Rotar derecha" + "\n" + "SHIFT+I:= Rotar Izquierda" + "\n" + "SHIFT+X:= Reflexion en x" + "\n"
                    + "SHIFT+Y:= Reflexion en y" + "\n" + "SHIFT+W:= Reflexion en xy" + "\n" + "SHIFT+0:= Restablecer figura" + "\n" + "Teclas de navegacion:= Mover figuras en los 4 sentidos" + "\n"
                    + "   =================================== [ATAJOS DE MOUSE] =================================" + "\n" + "Click derecho "
                    + "( mover a la derecha )" + "\n" + "Click izquierdo ( mover a la izquierda )"
                    + "\n" + "Click derecho [matener preciondo] y mover mouse (Para bajar figura )" + "\n"
                    + "Click izquierdo [matener preciondo] y  mover mouse (Para subir figura )" + "\n" + "Click scroll + clik con mouse ( Precionar el scroll la veces que se quiera escalar [cada click de scroll aumenta .5]. )"
                    + "\n" + "Mover scroll ( Para hacer grande o chica la figura )");
        }
    }

    //mouse
    @Override
    public void mouseWheelMoved(MouseWheelEvent mwe) {
        double scroll = .5;
        scroll = (mwe.getWheelRotation() > 0) ? 1 + scroll : 1 - scroll;
        this.escalar(scroll, scroll);
        repaint();

    }

    @Override
    public void mouseDragged(MouseEvent me) {
        if (me.getModifiersEx() == 4096) {//arriba
            this.traslación(0, 10);
            repaint();

        } else if (me.getModifiersEx() == 1024) {// abajo
            this.traslación(0, -10);
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if (me.getModifiersEx() == 4096) {//izquierda
            this.traslación(30, 0);
            repaint();

        } else if (me.getModifiersEx() == 1024) {// derecha
            this.traslación(-30, 0);
            repaint();

        } else if (me.getModifiersEx() == 2048) {// CLICK SCROOL
            this.deformación(.2, .2);
        }
    }
    /// Quedan vacios para que no genere errores ya que son esuchas de mouse

    @Override
    public void mouseMoved(MouseEvent me) {

    }

    // teclado
    @Override
    public void keyTyped(KeyEvent e) {
        //System.out.println("Escribió una tecla");
    }

    //teclado
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) {//arriba
            this.traslación(0, -10);
            repaint();
        } else if (key == KeyEvent.VK_DOWN) {//abajo
            this.traslación(0, 10);
            repaint();
        } else if (key == KeyEvent.VK_LEFT) {//derecha
            this.traslación(-10, 0);
            repaint();
        } else if (key == KeyEvent.VK_RIGHT) {//izquierda
            this.traslación(10, 0);
            repaint();
        } else if (e.isShiftDown() && e.getKeyChar() != 'd' && e.getKeyCode() == KeyEvent.VK_D) {
            this.rotación1(10);
            repaint();
        } else if (e.isShiftDown() && e.getKeyChar() != 'i' && e.getKeyCode() == KeyEvent.VK_I) {
            this.rotación2(10);
            repaint();
        } else if (e.isShiftDown() && e.getKeyChar() != 'g' && e.getKeyCode() == KeyEvent.VK_G) {
            this.escalar(1.5, 1.5);
            repaint();
        } else if (e.isShiftDown() && e.getKeyChar() != 'c' && e.getKeyCode() == KeyEvent.VK_C) {
            this.escalar(.5, .5);
            repaint();
        } else if (e.isShiftDown() && e.getKeyChar() != 'x' && e.getKeyCode() == KeyEvent.VK_X) {
            this.reflexiónX();
            repaint();
        } else if (e.isShiftDown() && e.getKeyChar() != 'y' && e.getKeyCode() == KeyEvent.VK_Y) {
            this.reflexiónY();
            repaint();
        } else if (e.isShiftDown() && e.getKeyChar() != 'w' && e.getKeyCode() == KeyEvent.VK_W) {
            this.reflexiónXY();
            repaint();
        } else if (e.isShiftDown() && e.getKeyChar() != 'z' && e.getKeyCode() == KeyEvent.VK_Z) {
            this.deformación(.3, .3);
            repaint();
        } else if (e.isShiftDown() && e.getKeyChar() != '0' && e.getKeyCode() == KeyEvent.VK_0) {
            this.reset();
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //System.out.println("Soltó una tecla");
    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

// metodos de transformaciones
    private void escalar(double fx, double fy) {
        int tx = figura[0].getX();
        int ty = figura[0].getY();
        for (Punto punto : figura) {
            punto.setX(
                    ((int) ((punto.getX() - tx) * fx) + tx)
            );
            punto.setY(
                    ((int) ((punto.getY() - ty) * fy) + ty)
            );
        }
    }

    private void rotación1(double ang) {
        int tx = figura[0].getX();
        int ty = figura[0].getY();

        for (Punto punto : figura) {
            punto.setX((int) ((punto.getX() - tx) * Math.cos(Math.toRadians(ang)) - (punto.getY() - ty) * Math.sin(Math.toRadians(ang)) + tx));
            punto.setY((int) ((punto.getX() - tx) * Math.sin(Math.toRadians(ang)) + (punto.getY() - ty) * Math.cos(Math.toRadians(ang)) + ty));
        }
    }

    private void rotación2(double ang) {
        int tx = figura[0].getX();
        int ty = figura[0].getY();
        for (Punto punto : figura) {
            punto.setX(
                    (int) ((punto.getX() - tx) * Math.cos(Math.toRadians(ang)) + (punto.getY() - ty) * Math.sin(Math.toRadians(ang)) + tx));
            punto.setY(
                    (int) ((-1) * (punto.getX() - tx) * Math.sin(Math.toRadians(ang)) + (punto.getY() - ty) * Math.cos(Math.toRadians(ang)) + ty));
        }
    }

    private void traslación(double xf, double yf) {
        for (Punto punto : figura) {
            punto.setX(
                    ((int) ((punto.getX() + xf)))
            );
            punto.setY(
                    ((int) ((punto.getY() + yf)))
            );
        }
    }

    private void reflexiónX() {
        int tx = figura[0].getX();
        int ty = figura[0].getY();
        for (Punto punto : figura) {
            punto.setX(-(punto.getX() - tx) + tx);
            punto.setY((punto.getY() - ty) + ty);
        }
    }

    private void reflexiónY() {
        int tx = figura[0].getX();
        int ty = figura[0].getY();
        for (Punto punto : figura) {
            punto.setX((punto.getX() - tx) + tx);
            punto.setY(-(punto.getY() - ty) + ty);
        }
    }

    private void reflexiónXY() {
        int tx = figura[0].getX();
        int ty = figura[0].getY();
        for (Punto punto : figura) {
            punto.setX(-(punto.getX() - tx) + tx);
            punto.setY(-(punto.getY() - ty) + ty);
        }
    }

    private void deformación(double dx, double dy) {
        int tx = figura[0].getX();
        int ty = figura[0].getY();
        for (Punto punto : figura) {
            punto.setX(((int) ((punto.getX() - tx) + ((punto.getY() - ty) * dx) + tx)));
            punto.setY(((int) (((punto.getX() - tx) * dy) + ((punto.getY() - ty) + ty))));
        }
    }

    public void setFig(Punto figura[]) {
        this.figura = figura;
    }

    public void reset() {
        Punto fig[] = {
            new Punto(200, 120),
            new Punto(210, 90),
            new Punto(210, 120),
            new Punto(210, 120),
            new Punto(220, 90),
            new Punto(220, 120),
            new Punto(220, 120),
            new Punto(230, 90),
            new Punto(230, 120),
            new Punto(230, 120),
            new Punto(240, 90),
            new Punto(240, 120),
            new Punto(240, 120),
            new Punto(250, 90),
            new Punto(250, 120),
            new Punto(250, 120),
            new Punto(260, 90),
            new Punto(260, 120),
            new Punto(260, 120),
            new Punto(270, 90),
            new Punto(270, 120),
            new Punto(270, 120),
            new Punto(280, 90),
            new Punto(280, 120),
            new Punto(280, 120),
            new Punto(290, 90),
            new Punto(290, 120),
            //arbol
            new Punto(290, 120),
            new Punto(300, 120),
            new Punto(300, 50),
            new Punto(300, 120),
            new Punto(300, 50),
            new Punto(270, 60),
            new Punto(270, 60),
            new Punto(300, 40),
            new Punto(280, 45),
            new Punto(300, 28),
            new Punto(290, 29),
            new Punto(305, 18),
            /// mitad
            new Punto(315, 29),
            new Punto(305, 18),
            new Punto(315, 29),
            new Punto(305, 29),
            new Punto(305, 29),
            new Punto(325, 44),
            new Punto(305, 40),
            new Punto(325, 44),
            new Punto(305, 40),
            new Punto(338, 58),
            new Punto(305, 50),
            new Punto(305, 120),
            new Punto(315, 120),
            new Punto(315, 120),
            new Punto(325, 90),
            new Punto(325, 120),
            new Punto(325, 120),
            new Punto(335, 90),
            new Punto(335, 120),
            new Punto(335, 120),
            new Punto(345, 90),
            new Punto(345, 120),
            new Punto(345, 120),
            new Punto(355, 90),
            new Punto(355, 120),
            new Punto(355, 120),
            new Punto(365, 90),
            new Punto(365, 120),
            new Punto(365, 120),
            new Punto(375, 90),
            new Punto(375, 120),
            new Punto(375, 120),
            new Punto(385, 90),
            new Punto(385, 120),
            new Punto(385, 120),
            new Punto(395, 90),
            new Punto(395, 120),
            new Punto(325, 120),
            new Punto(200, 120),};
        setFig(fig);
        repaint();
    }

    private void dibujar(Graphics g) {
        for (int i = 0; i < figura.length - 1; i++) {
            Punto punto = figura[i];
            g.drawLine(
                    this.figura[i].getX(),
                    this.figura[i].getY(),
                    this.figura[i + 1].getX(),
                    this.figura[i + 1].getY()
            );
        }
    }

}
