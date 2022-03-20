/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import Ruang.Balok;
/**
 *
 * @author Ardya
 */
public class Gui extends JFrame implements ActionListener{
    
       JLabel lpanjang = new JLabel("Lenght");
       JTextField fpanjang = new JTextField(10);
       
       JLabel llebar = new JLabel("Width");
       JTextField flebar = new JTextField(10);
       
       JLabel ltinggi = new JLabel("Height");
       JTextField ftinggi = new JTextField(10);
       
       JLabel ljudul = new JLabel("Cuboid Calculator");
       JLabel lresult = new JLabel("Result : ");
       JLabel lluas = new JLabel();
       JLabel lkeliling = new JLabel();
       JLabel lluaspermukaan = new JLabel();
       JLabel lvolume = new JLabel();
       
       JButton bhitung = new JButton("Count");
       JButton breset = new JButton("Reset");

       public Gui(){
           setTitle("Cuboid Calculator");
           
//         setSize(lebar, tinggi);
           setSize( 320 ,  400 );
           setLayout(null);
           add(ljudul);
           add(lpanjang);
           add(fpanjang);
           add(llebar);
           add(flebar);
           add(ltinggi);
           add(ftinggi);
           add(bhitung);
           add(lluas);
           add(lkeliling);
           add(lluaspermukaan);
           add(lvolume);
           add(lresult);
           add(breset);
           
           ljudul.setBounds(100,10,120,20);
           lpanjang.setBounds(25,45,120,20);
           fpanjang.setBounds(100,45,150,20);
           llebar.setBounds(25,85,120,20);
           flebar.setBounds(100,85,150,20);
           ltinggi.setBounds(25,125,120,20);
           ftinggi.setBounds(100,125,150,20);
           lresult.setBounds(130,150,200,20);
           lluas.setBounds(25,180,200,20);
           lkeliling.setBounds(25,210,200,20);
           lvolume.setBounds(25,240,200,20);
           lluaspermukaan.setBounds(25,270,200,20);
           bhitung.setBounds(40,310,100,20);
           breset.setBounds(165,310,100,20);
           
           
           setVisible(true);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLocationRelativeTo(null);
       
           bhitung.addActionListener(this);
           breset.addActionListener(this);
       }
       
       public void actionPerformed(ActionEvent e){
           int panjang,lebar,tinggi;
           
           if(e.getSource() == bhitung){
               if(fpanjang.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "'Lenght' cannot be empty.");
               } else if(flebar.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "'Width' cannot be empty.");
               } else if(ftinggi.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "'Height' cannot be empty.");
               } else {
                    try{
                         panjang = Integer.parseInt(fpanjang.getText());
                         lebar   = Integer.parseInt(flebar.getText());
                         tinggi  = Integer.parseInt(ftinggi.getText());
                         Balok balok = new Balok(panjang, lebar, tinggi);
                         lluas.setText("Square Area : " + balok.luas());
                         lkeliling.setText("Square Circumference : " + balok.keliling());
                         lvolume.setText("Cuboid Volume : " + balok.volume());
                         lluaspermukaan.setText("Cuboid Surface Area : " + balok.luasPermukaan());
                     } catch(NumberFormatException err){
                         JOptionPane.showMessageDialog(null, err.getMessage());
                     }
               }
           }
           
           if(e.getSource() == breset){
               fpanjang.setText("");
               flebar.setText("");
               ftinggi.setText("");
               lluas.setText("");
               lkeliling.setText("");
               lluaspermukaan.setText("");
               lvolume.setText("");
           }
        }
}
