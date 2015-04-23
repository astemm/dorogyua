import java.awt.event.*;
import java.awt.*;
import java.awt.Graphics;
import java.util.*;
import java.util.Vector;
import java.awt.Font; 
import java.awt.Toolkit;
public class Graf extends Frame
{
gPanel map = new gPanel();
public Graf()
{
setBounds(0,0,650,630);
setTitle("Karta Dorig");
add(map);
setVisible(true);
}
public class gPanel extends Panel
{
public gPanel()
{
//for (int i=0; i<250; i++)
//{
//int r = (int)(Math.random()*75);
//v.add(new Point(i*2,150+r*-1));
//}
}
//Image img=Toolkit.getDefaultToolkit().createImage("K:\\ua.jpg");
//Graf1 gr=new Graf1();
Mistax gm=new Mistax();
public void paint(Graphics g)
{
//g.drawImage(img,65,65,null);
this.gm.createdges();
for (int j=0; j<this.gm.edges.size(); j++)
{
//City p1=(City)this.g.edges.get(j).City1;
//City p2= (City)this.g.edges.get(j).City2;
int o=(int)(this.gm.edges.get(j).City1.x*40*1.5); int d=(int)this.gm.edges.get(j).City1.y*40; int t=(int)(this.gm.edges.get(j).City2.x*40*1.5); int c=(int)this.gm.edges.get(j).City2.y*40;
g.setColor(Color.lightGray);
g.drawLine(d-800,3200-o,c-800,3200-t);}
g.setColor(Color.red);

//for (int k=0; k<gr.v.size(); k++){
//g.drawLine(gr.v.elementAt(k).x,gr.v.get(k).y,gr.v.get(k+1).x,gr.v.get(k+1).y);}

for (int i=0; i<this.gm.mst.size(); i++)
{int o=(int)(this.gm.mst.get(i).City1.x*40*1.5); int d=(int)this.gm.mst.get(i).City1.y*40; int t=(int)(this.gm.mst.get(i).City2.x*40*1.5); int c=(int)this.gm.mst.get(i).City2.y*40;
g.drawLine(d-800,3200-o,c-800,3200-t);}
Font font=new Font("Times New Roman",Font.PLAIN,10);
g.setFont(font);
g.setColor(Color.blue);
for (int r=0; r<this.gm.m.size(); r++){
int o=(int)(this.gm.m.get(r).x*40*1.5); int d=(int)this.gm.m.get(r).y*40; 
g.drawString(this.gm.m.get(r).name,d-800,3200-o);}

g.setColor(Color.gray);
for (int r=0; r<this.gm.m.size(); r++){
int o=(int)(this.gm.m.get(r).x*40*1.5); int d=(int)this.gm.m.get(r).y*40; 
g.fillOval(d-800-5,3200-5-o,10,10);}

}
}
public static void main (String[] args) 
{
Graf f=new Graf();
f.addWindowListener(
  new WindowAdapter(){
    public void windowClosed(WindowEvent e) { System.exit(0); }
  }
);
}
}