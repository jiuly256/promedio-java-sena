/*
Jiuly Alexandra Rojas
hhtps://jiuly.com.ve
*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class AppletPromedio extends Applet implements ActionListener {
TextField tfNumero1,tfNumero2,tfNumero3,tfNumero4;//entradas de texto
Label lNumero1,lNumero2,lNumero3,lNumero4;//label de los textos de entrada
Button boton;
double resultado;//variable para mostrar el resultado
double suma;
double promedio;

//método constructor,donde se crean los objetos a dibujar en el applet
public AppletPromedio() {
//Damos la instruccion que no se usará ningun layout para poder dibujar con setBounds
this.setLayout((null));

//setBounds(posicionx, posiciony, ancho, alto)
lNumero1= new Label("Numero 1: ");
lNumero1.setBounds(20, 20, 100, 20);
lNumero2= new Label("Numero 2: ");
lNumero2.setBounds(20, 40, 100, 20);
lNumero3= new Label("Numero 3: ");
lNumero3.setBounds(20, 60, 100, 20);
lNumero4= new Label("Numero 4: ");
lNumero4.setBounds(20, 80, 100, 20);
tfNumero1 = new TextField();
tfNumero1.setBounds(120, 20, 100, 20);
tfNumero2 = new TextField();
tfNumero2.setBounds(120, 40, 100, 20);
tfNumero3 = new TextField();
tfNumero3.setBounds(120, 60, 100, 20);
tfNumero4 = new TextField();
tfNumero4.setBounds(120, 80, 100, 20);
boton = new Button("Promedio");
boton.setBounds(120,140,100,20);
//agregamos los elementos a la pantalla
add(lNumero1);
add(lNumero2);
add(lNumero3);
add(lNumero4);
add(tfNumero1);
add(tfNumero2);
add(tfNumero3);
add(tfNumero4);
add(boton);
boton. addActionListener(this); // se le añade al boton la facilidad de ser escuchado
	
}
//método paint en el cual se pone lo que se quiere dibujar
public void paint(Graphics g) {
	
	this.setSize(300, 300);

	
	double numero1 = Double.parseDouble(tfNumero1.getText());
	double numero2 = Double.parseDouble(tfNumero2.getText());
	double numero3 = Double.parseDouble(tfNumero3.getText());
	double numero4 = Double.parseDouble(tfNumero4.getText());
	suma = numero1 + numero2 + numero3 + numero4;
	promedio = suma/4;
	
	resultado = (double) Math.round(promedio * 100) / 100;
	
	
	g.drawString("El promedio es= "+resultado, 20, 180);
	
	//dibuja el cuadrado
}
// método para realizar las opciones al oprimir un botón
public void actionPerformed(ActionEvent ae) {
	
	repaint(); 
	
}

}
