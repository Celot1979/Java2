package SnakeGame.Tres En Raya;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Tres_En_Raya {

	 public static void main(String[] args) {
         // TODO Auto-generated method stub
         marco m = new marco();
         m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

}
class marco extends JFrame{
     public marco() {
         setTitle("Tres en Raya");
         setBounds(800,400,300,240);
         principal = new JPanel();
         encuadre= new GridLayout(3,3);
         setLayout(encuadre);
         Jugador1 uno = new Jugador1();
         Jugador2 dos = new Jugador2();
         //valorDado = Integer.parseInt(JOptionPane.showInputDialog("Eres el jugador 1 o 2"));
         b0= new JButton("");
         Dimension d = new Dimension(10,10);
         b0.setFont(new Font ("Arial",Font.BOLD,30));
         b0.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 4, 
Color.BLUE));
         b0.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 // TODO Auto-generated method stub
                 if(e.getSource() == b0 ) {
                	valorDado+=1;
                	if(valorDado == 1) {
                		uno.jugada1(b0);
                		
                	
                		//valorDado = Integer.parseInt(JOptionPane.showInputDialog("Eres el jugador 1 o 2"));
                	}else {
                		dos.jugada2(b0);
                		//valorDado = Integer.parseInt(JOptionPane.showInputDialog("Eres el jugador 1 o 2"));
                	}
                 }
                 b0.setEnabled(false);
                 
             }
         });

         b2= new JButton("");
         b2.setFont(new Font ("Arial",Font.BOLD,30));
         b2.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 4, 
Color.BLUE));
         b2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 // TODO Auto-generated method stub
            	 valorDado+=1;
            	 if(e.getSource() == b2 ) {
                 	if(valorDado == 1) {
                 		uno.jugada1(b2);
                 		
                 	}else {
                 		
                 		dos.jugada2(b2);
                 	}
                  }
            	 b2.setEnabled(false);
             }
            

         });

         b3= new JButton("");
         b3.setFont(new Font ("Arial",Font.BOLD,30));
         b3.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, 
Color.BLUE));
         b3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 // TODO Auto-generated method stub
            	 valorDado+=1;
            	 if(e.getSource() == b3 ) {
                 	if(valorDado == 1) {
                 		uno.jugada1(b3);
                 		
                 	}else {
                 		dos.jugada2(b3);
                 		
                 	}
                  }
            	 b3.setEnabled(false);
           }

         });

         b4= new JButton("");
         b4.setFont(new Font ("Arial",Font.BOLD,30));
         b4.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 4, 
Color.BLUE));
         b4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 // TODO Auto-generated method stub
            	 valorDado+=1;
            	 if(e.getSource() == b4 ) {
                 	if(valorDado == 1) {
                 		uno.jugada1(b4);
                 		
                 	}else {
                 		dos.jugada2(b4);
                 		
                 	}
                  }
            	 b4.setEnabled(false);
             }

         });

         b5= new JButton("");
         b5.setFont(new Font ("Arial",Font.BOLD,30));
         b5.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 4, 
Color.BLUE));
         b5.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 // TODO Auto-generated method stub
            	 valorDado+=1;
            	 if(e.getSource() == b5 ) {
                 	if(valorDado == 1) {
                 		uno.jugada1(b5);
                 		
                 	}else {
                 		dos.jugada2(b5);
                 		
                 	}
                  }
            	 b5.setEnabled(false);
             }

         });

         b6= new JButton("");
         b6.setFont(new Font ("Arial",Font.BOLD,30));
         b6.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, 
Color.BLUE));
         b6.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 // TODO Auto-generated method stub
            	 valorDado+=1;
            	 if(e.getSource() == b6 ) {
                 	if(valorDado == 1) {
                 		uno.jugada1(b6);
                 		
                 	}else {
                 		dos.jugada2(b6);
                 		
                 	}
                  }
            	 b6.setEnabled(false);
             }

         });

         b7= new JButton("");
         b7.setFont(new Font ("Arial",Font.BOLD,30));
         b7.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, 
Color.BLUE));
         b7.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 // TODO Auto-generated method stub
            	 valorDado+=1;
            	 if(e.getSource() == b7 ) {
                 	if(valorDado == 1) {
                 		uno.jugada1(b7);
                 		
                 	}else {
                 		dos.jugada2(b7);
                 		
                 	}
                  }
            	 b7.setEnabled(false);
             }

         });

         b8= new JButton("");
         b8.setFont(new Font ("Arial",Font.BOLD,30));
         b8.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, 
Color.BLUE));
         b8.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 // TODO Auto-generated method stub
            	 valorDado+=1;
            	 if(e.getSource() == b8 ) {
                 	if(valorDado == 1) {
                 		uno.jugada1(b8);
                 		
                 	}else {
                 		dos.jugada2(b8);
                 		
                 	}
                  }
            	 b8.setEnabled(false);
             }

         });

         b9= new JButton("");
         b9.setFont(new Font ("Arial",Font.BOLD,30));
         b9.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, 
Color.BLUE));
         b9.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 // TODO Auto-generated method stub
            	 valorDado+=1;
            	 if(e.getSource() == b9 ) {
                 	if(valorDado == 1) {
                 		uno.jugada1(b9);
                 		
                 	}else {
                 		dos.jugada2(b9);
                 		
                 	}
                  }
            	 b9.setEnabled(false);
             }

         });
         
         add(b0);
         add(b2);
         add(b3);
         add(b4);
         add(b5);
         add(b6);
         add(b7);
         add(b8);
         add(b9);
         
         
       
         setVisible(true);

     }
     public class Jugador1{
    	 public Jugador1() {
    		 
    	 }
    	 public void jugada1(JButton b1) {
    		
    		 if(valorDado == 1 ) {
    			 
    			 b1.setText("X");
    			//Primera línea en horizonatal X
    			 if(b0.getText()=="X") {
    				 contadorX = contadorX + 1;
    				 if(b3.getText() != "X") {
    					 GameOver = false;
    				 }else {
    					 GameOver = true;
    				 }
    			 }else if(b2.getText()== "X") {
    				 contadorX = contadorX + 1;
    				 
    			 }else if(b3.getText() == "X") {
    				 contadorX = contadorX + 1;
    				 if(b1.getText() != "X") {
    					 GameOver = false;
    				 }else {
    					 GameOver = true;
    				 }
    			 }
    			 
    			 
    			 
    			 
    			 //Segunda línea en horizonatal X
    			 if(b4.getText()=="X") {
    				 contadorX = contadorX + 1;
    				 if(b6.getText() != "X") {
    					 GameOver = false;
    				 }else {
    					 GameOver = true;
    				 }
    			 }else if(b5.getText()== "X") {
    				 contadorX = contadorX + 1;
    				 
    			 }else if(b6.getText() == "X") {
    				 contadorX = contadorX +1;
    				 if(b4.getText() != "X") {
    					 GameOver = false;
    				 }else {
    					 GameOver = true;
    				 }
    			 }
    			 
    			//Tercera línea en horizonatal X
    			 if(b7.getText()=="X") {
    				 contadorX = contadorX + 1;
    				 if(b9.getText() != "X") {
    					 GameOver = false;
    				 }else {
    					 GameOver = true;
    				 }
    			 }else if(b8.getText()== "X") {
    				 contadorX = contadorX + 1;
    				 
    			 }else if(b9.getText() == "X") {
    				 contadorX = contadorX +1;
    				 if(b7.getText() != "X") {
    					 GameOver = false;
    				 }else {
    					 GameOver = true;
    				 }
    			 }
    			 
    			if(b0.getText()=="X" && b5.getText()== "X" && b9.getText()=="X") {
    				contadorX =3;
    				GameOver=true;
    			}
    			
    			if(b3.getText()=="X" && b5.getText()== "X" && b7.getText()=="X") {
    				contadorX =3;
    				GameOver=true;
    			}
    			
    			//Verticales
    			 if(b0.getText()=="X" && b4.getText()== "X" && b7.getText()=="X") {
     				contadorX =3;
     				GameOver=true;
     			}
    			 
    			if(b2.getText()=="X" && b5.getText()== "X" && b8.getText()=="X") {
    				contadorX =3;
     				GameOver=true;
     			}
    			
    			if(b3.getText()=="X" && b6.getText()== "X" && b9.getText()=="X") {
    				contadorX =3;
     				GameOver=true;
     			}
    			

    		 }
    		 
    		 
    		 
    		 if(contadorX == 3 && GameOver == true) {
    			 JOptionPane.showMessageDialog(null, "Has ganado el 1º Jugador");
    		 }
    		 
    		 
    		 
    		 
    		 valorDado = 1; 
    	 }
    	 
    	 
     }
     public class Jugador2{
    	 public Jugador2() {
    		 
    	 }
    	 public void jugada2(JButton b1) {
    		
    		 if(valorDado == 2) {
    			 b1.setText("O");

    			//Primera línea en horizonatal X
    			 if(b0.getText()=="O") {
    				 contadorO = contadorO + 1;
    				 if(b3.getText() != "O") {
    					 GameOver = false;
    				 }else {
    					 GameOver = true;
    				 }
    			 }else if(b2.getText()== "O") {
    				 contadorO = contadorO + 1;
    				 
    			 }else if(b3.getText() == "O") {
    				 contadorO = contadorO + 1;
    				 if(b1.getText() != "X") {
    					 GameOver = false;
    				 }else {
    					 GameOver = true;
    				 }
    			 }
    			 
    			 //Segunda línea en horizonatal X
    			 if(b4.getText()=="O") {
    				 contadorO = contadorO + 1;
    				 if(b6.getText() != "X") {
    					 GameOver = false;
    				 }else {
    					 GameOver = true;
    				 }
    			 }else if(b5.getText()== "O") {
    				 contadorO = contadorO + 1;
    				 
    			 }else if(b6.getText() == "O") {
    				 contadorO = contadorO + 1;
    				 if(b4.getText() != "O") {
    					 GameOver = false;
    				 }else {
    					 GameOver = true;
    				 }
    			 }
    			 
    			//Tercera línea en horizonatal X
    			 if(b7.getText()=="O") {
    				 contadorO = contadorO + 1;
    				 if(b9.getText() != "O") {
    					 GameOver = false;
    				 }else {
    					 GameOver = true;
    				 }
    			 }else if(b8.getText()== "O") {
    				 contadorO = contadorO + 1;
    				 
    			 }else if(b9.getText() == "O") {
    				 contadorO = contadorO + 1;
    				 if(b7.getText() != "O") {
    					 GameOver = false;
    				 }else {
    					 GameOver = true;
    				 }
    			 }
    			 
    			 //Diagonales
    			 if(b0.getText()=="O" && b5.getText()== "O" && b9.getText()=="O") {
     				contadorO =3;
     				GameOver=true;
     			}
     			
     			if(b3.getText()=="O" && b5.getText()== "O" && b7.getText()=="O") {
     				contadorO =3;
     				GameOver=true;
     			}
     			
     			
     			
     			//Verticales
     			 if(b0.getText()=="O" && b4.getText()== "O" && b7.getText()=="O") {
      				contadorO =3;
      				GameOver=true;
      			}
     			 
     			if(b2.getText()=="O" && b5.getText()== "O" && b8.getText()=="O") {
      				contadorO =3;
      				GameOver=true;
      			}
     			
     			if(b3.getText()=="O" && b6.getText()== "O" && b9.getText()=="O") {
      				contadorO =3;
      				GameOver=true;
      			}
     			
    			 
    		 }
    		 if(contadorO == 3 && GameOver == true) {
    			 JOptionPane.showMessageDialog(null, "Has ganado El 2º Jugador");
    		 }
    		 valorDado = 0; 
    	 }
    	
     }
     JPanel principal,superior;
     GridLayout encuadre;
     JButton b0,b2,b3,b4,b5,b6,b7,b8,b9;
     public int valorDado;
     public int contadorX;
     public int contadorO;
     public boolean GameOver = false;
     public boolean jugada =false;
     int x, y;
     String Jugador1,Jugador2;
}
