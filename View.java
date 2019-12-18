/*
 *  --------------------------------Version 1.0-----------------------------------------
 * Find all prime values(2 ~ 9). *
 * Part 1 ~ 4. 
 *   Control: call View class.
 *   View   : Setup Componets >>>> JLabel * 2, JTextField * 1, JButton * 1
 *   Model  : Logic Arithmetic
 *   ObjStyle: CSS >> JLabel(jl), JButton(jb) * 
 */
package com.mycompany.isprime;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 2019/12/8 Sunday 18:48
 * @author oliver
 */
public class View
{    
    ObjStyle ose = new ObjStyle();//CSS    
    JFrame jf = new JFrame();//window
    JTextField jtf = new JTextField();//input value
    JLabel jl2 = new JLabel();//answer
    JLabel jl = new JLabel("<html><head>" + ose.jl() + "</head>");//title            
    JButton jb = new JButton("<html><head>" + ose.jb() + "</head>");//execute
    
    public View()
    {       
        jf.setLayout(null);
        jf.setBounds(10, 10, 600, 600);
        jf.setDefaultCloseOperation(3);
        jf.setVisible(true);        
        jf.add(jl);        
        jf.add(jtf);
        jf.add(jb);       
        jf.add(jl2);
        
        jl.setBounds(130, 5, 360, 80);
        
        Font ft_jl2 = new Font(Font.SANS_SERIF,Font.BOLD,30);       
        jl2.setFont(ft_jl2);
        jl2.setBounds(10, 500, 600, 80);
        
        Font ft_jtf = new Font(Font.SANS_SERIF,Font.BOLD,50);
        jtf.setBounds(190, 250, 200, 100);
        jtf.setFont(ft_jtf);        
        
        jb.setBounds(150, 400, 120, 50);
        jb.addActionListener(new Message());
    }
    public class Message implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
           Model m = new Model();
           m.execution(jtf.getText());
           jl2.setText("Prim values : " + m.result);
        }
    }    
}