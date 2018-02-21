//ver 1
//Salvatore Carlino

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grafica extends JFrame implements ActionListener{
	private JLabel l1,l2,l3;
	private JPanel p[];
	private JButton b1,b2,b3;
	private ImageIcon img;
	private JButton pi,m;
	private int dim;
		
	public Grafica() {
		super("Bandiere !!!");
		Container c=getContentPane();
		
		l2=new JLabel("");
		img=new ImageIcon("md.png");
		l2.setIcon(img);
				
		p=new JPanel[6];
		for(int i=0;i<p.length;i++)
			p[i]=new JPanel();
		
		l1=new JLabel("Scegli la bandiera!");
		
		l3=new JLabel(dim+"");
						
		b1=new JButton("Italia");
		b1.addActionListener(this);
		
		b2=new JButton("Irlanda");
		b2.addActionListener(this);
		
		b3=new JButton("Moldavia");
		b3.addActionListener(this);
		
		pi=new JButton("+");
		pi.addActionListener(this);
		
		m=new JButton("-");
		m.addActionListener(this);
							
		p[5].setLayout(new GridLayout(1,3));
		p[5].add(p[1]);
		p[5].add(p[2]);
		p[5].add(p[3]);
		
		p[0].add(l1);
		p[4].add(b1);
		p[4].add(b2);
		p[4].add(b3);
		p[4].add(pi);
		p[4].add(l3);
		p[4].add(m);
	
		c.add(p[0],"North");
		c.add(p[4],"South");
		c.add(p[5]);
		
		setSize(500,500);
		setLocation(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object o=arg0.getSource();
		if(o==b1) {
			p[1].setBackground(Color.GREEN);
			p[2].setBackground(Color.WHITE);
			p[3].setBackground(Color.RED);
			l1.setText("Italia");
			l2.setVisible(false);
		}
		else if(o==b2) {
			p[1].setBackground(Color.ORANGE);
			p[2].setBackground(Color.WHITE);
			p[3].setBackground(Color.GREEN);
			l1.setText("Irlanda");
			l2.setVisible(false);
		}
		else if(o==b3) {
			p[1].setBackground(Color.RED);
			p[2].setBackground(Color.YELLOW);
			p[3].setBackground(Color.BLUE);
			l1.setText("Moldavia");
			p[2].add(l2);
			l2.setVisible(true);
		}
		if(o==pi) {
			dim=
			dim++;
			l1.setFont(new Font("Arial",0,dim));
			l3.setText(dim+"");
		}
		else if(o==m) {
			dim--;
			l1.setFont(new Font("Arial",0,dim));
			l3.setText(dim+"");
		}
			
	}

}
