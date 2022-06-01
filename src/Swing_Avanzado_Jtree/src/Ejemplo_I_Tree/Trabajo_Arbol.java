package Ejemplo_I_Tree;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;

public class Trabajo_Arbol extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trabajo_Arbol frame = new Trabajo_Arbol();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Trabajo_Arbol() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 50);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// Nodo "rama" del árbol
		DefaultMutableTreeNode nRaiz = new DefaultMutableTreeNode("Mundo");
		
		//Nodo "Hoja" 
		DefaultMutableTreeNode nPais = new DefaultMutableTreeNode("Colombia");
		
		// Para que se produzca realmente el parentesco debemos realizar lo siguiente
		
		nRaiz.add(nPais);
		
		// Ahora vamos a crear hijos de Colombia. También podemos definiarlo
		// como nietos de nRaiz.
		// Siguiendo la lógica , seria la punta de la hoja
		DefaultMutableTreeNode nRegion = new DefaultMutableTreeNode("Andina");
		nPais.add(nRegion);
		
		/*
		 * En las prox 4 líneas de código veremos como agregar otra región mas al país
		 * Existen dos formas de realizar la implementación.
		 * 1ª Comentada.
		 * 2ª Realizada
		 */
		/*DefaultMutableTreeNode nRegion2 = new DefaultMutableTreeNode("Caribe");
		nPais.add(nRegion2);*/
		nRegion = new DefaultMutableTreeNode("Caribe");
		nPais.add(nRegion);
		
		//----------------------------------------------------------------------

		//Nodo "Hoja" 
		DefaultMutableTreeNode nPais2 = new DefaultMutableTreeNode("España");
		
		// Para que se produzca realmente el parentesco debemos realizar lo siguiente
		
		nRaiz.add(nPais2);
		
		// Ahora vamos a crear hijos de Colombia. También podemos definiarlo
		// como nietos de nRaiz.
		// Siguiendo la lógica , seria la punta de la hoja
		DefaultMutableTreeNode nCastilla = new DefaultMutableTreeNode("Castilla León");
		nPais2.add(nCastilla);
		// Vamos hacer un nivel más de hojas
		DefaultMutableTreeNode nSegovia = new DefaultMutableTreeNode("Segovia");
		nCastilla.add(nSegovia);
		DefaultMutableTreeNode nBurgos = new DefaultMutableTreeNode("Burgos");
		nCastilla.add(nBurgos);
		
		
		DefaultMutableTreeNode nGalicia = new DefaultMutableTreeNode("Galicia");
		nPais2.add(nGalicia);
		
		
		DefaultMutableTreeNode nAsturias = new DefaultMutableTreeNode("Asturias");
		nPais2.add(nAsturias);
		
		
		// Ahora vamos creear el árbol
		
		JTree MArbol = new JTree(nRaiz);
		
		
		// Ahora vamos agregar al contenedor( que no deja de ser un JFrame) el árbol
		contentPane.add(MArbol, BorderLayout.NORTH);
		
		Container miJP = getContentPane();
		miJP.add(new JScrollPane(MArbol));
	}

}
