import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class PanelFrm7 extends JFrame implements ActionListener {
 int N=12,r1,g1,b1,r2,g2,b2,n[]=new int[N];
 String s,r[]=new String[N];
 Button bc,bs;
 ClkPanel p[]=new ClkPanel[N];
 Random rd=new Random();
 Panel pp=new Panel(),pb=new Panel();
 PanelFrm7(){super("Ubah Panel Frame-7");
 setLayout(new BorderLayout());
  pp.setLayout(new GridLayout(3,3));
  setBounds(100,100,300,300);
  bc=new Button("color");
  bc.addActionListener(this);
  pb.add(bc);
  bs=new Button("swap");
  bs.addActionListener(this);
  pb.add(bs);
  for(int i=0;i<N;i++){r1=rd.nextInt(255);
  g1=rd.nextInt(255);
  b1=rd.nextInt(255);
   r2=255-r1;g2=255-g1;
   b2=255-b1;
   r[i]=""+(rd.nextInt(99)+1);
   p[i]=new ClkPanel(new Color(r1,g1,b1),new Color(r2,g2,b2),new Dimension(33,33),r[i]);
   pp.add(p[i]);
   } add(pp,BorderLayout.CENTER);
   add(pb,BorderLayout.SOUTH);
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  } public void actionPerformed(ActionEvent e){String c=e.getActionCommand();
  if(c.equals("swap")){int j=-1,k=-1,cc=0,ccc=0;
   for(int i=0;i<N;i++)if(p[i].ss.equals(p[i].s)){j=1;
   if(k==-1)k=i;
   }System.out.println(""+j+"="+p[j].s+","+k+"="+p[k].s);
   if(j!=k)swap(p,j,k);
   for(int i=0;i<N;i++)p[i].repaint();
   setVisible(false);
   for(int i=1;i<N;i++)if(Integer.parseInt(p[i].s)>=Integer.parseInt(p[i-1].s))cc++;
   else if(Integer.parseInt(p[i].s)<=Integer.parseInt(p[i-1].s))ccc++;
   if((cc>=8)||(ccc>=8)){JOptionPane.showMessageDialog(this,"HOREEE","INFO",1);
   bs.setEnabled(false);
   }System.out.println("\ncc:"+cc+";ccc:"+ccc);
  }else {for(int i=0;i<N;i++){r1=rd.nextInt(255);g1=rd.nextInt(255);b1=rd.nextInt(255);
   r2=255-r1;g2=255-g1;b2=255-b1;p[i].setBackground(new Color(r1,g1,b1));
   p[i].setForeground(new Color(r2,g2,b2));r[i]=""+(rd.nextInt(99)+1);
   p[i].s=r[i];repaint();}setVisible(false);}pp.repaint();setVisible(true);}
 void swap(ClkPanel p[],int j,int k){String t=p[j].s;p[j].s=p[k].s;p[k].s=t;}
 public static void main(String[] x){new PanelFrm7();} }
class ClkPanel extends JPanel implements MouseListener{String s,ss="";
 ClkPanel(Color c1,Color c2, Dimension d, String s){this.s=s;
  setBackground(c1);setForeground(c2);
  setSize(d);addMouseListener(this);}
 public void mouseClicked(MouseEvent e)
  {ss=s;System.out.print(ss+";");}
 public void mousePressed(MouseEvent e){}
 public void mouseReleased(MouseEvent e){}
 public void mouseExited(MouseEvent e){}
 public void mouseEntered(MouseEvent e){}
 public void paint(Graphics g){super.paint(g);
  g.setFont(new Font("",Font.BOLD,36));
  g.drawString(s,28,52);}}