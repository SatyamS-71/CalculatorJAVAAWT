
import java.awt.*;
import java.awt.event.*;
//import java.applet.*;
class prac extends Frame implements ActionListener{
TextField t;
String s= "";
Button l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
Button plus,minus,divi,mul,eq;
Button AC;
Button Back;
prac(){
Frame fr = new Frame("This is title");
fr.setSize(200,200);
fr.setLayout(new FlowLayout());
 l1 = new Button("1");
 l2 = new Button("2");
 l3 = new Button("3");
 l4 = new Button("4");
 l5 = new Button("5");
 l6 = new Button("6");
 l7 = new Button("7");
 l8 = new Button("8");
 l9 = new Button("9");
 l0 = new Button("0");
 plus = new Button("+");
 minus = new Button("-");
 divi = new Button("/");
 mul = new Button("*");
 eq = new Button("=");
 AC = new Button("AC");
 Back = new Button("<-");
//fr.setLayout(new FlowLayout());
//fr.setLayout(new BottomLayout());
t = new TextField(s+"                    ");
TextArea t2 = new TextArea(2,10  );
l1.addActionListener(this); //
l2.addActionListener(this); 
l3.addActionListener(this); 
l4.addActionListener(this);
l5.addActionListener(this); 
l6.addActionListener(this); 
l7.addActionListener(this); 
l8.addActionListener(this); 
l9.addActionListener(this); 
l0.addActionListener(this);
plus.addActionListener(this);
minus.addActionListener(this);
divi.addActionListener(this);
mul.addActionListener(this);
eq.addActionListener(this);
AC.addActionListener(this);
Back.addActionListener(this);
fr.setVisible(true);
fr.add(t);
fr.add(l1);
fr.add(l2);
fr.add(l3);
fr.add(l4);
fr.add(l5);
fr.add(l6);
fr.add(l7);
fr.add(l8);
fr.add(l9);
fr.add(l0);
fr.add(plus);
fr.add(minus);
fr.add(mul);
fr.add(divi);
fr.add(eq);
fr.add(AC);
fr.add(Back);


//fr.add(t2);


}
public void actionPerformed(ActionEvent e){
   t.setText(s);
   if(e.getSource()==l1){
     s=s+"1";
     t.setText(s);
   }
   if(e.getSource()==l2){
      s=s+"2";
      t.setText(s);
    }
    if(e.getSource()==l3){
      s=s+"3";
      t.setText(s);
    }  
     if(e.getSource()==l4){
      s=s+"4";
      t.setText(s);
    }   if(e.getSource()==l5){
      s=s+"5";
      t.setText(s);
    }   if(e.getSource()==l6){
      s=s+"6";
      t.setText(s);
    }   if(e.getSource()==l7){
      s=s+"7";
      t.setText(s);
    }   if(e.getSource()==l8){
      s=s+"8";
      t.setText(s);
    }
    if(e.getSource()==l9){
      s=s+"9";
      t.setText(s);
    }
    if(e.getSource()==l0){
       s=s+"0";
       t.setText(s);
    }
    if(e.getSource()==plus){
       s= s+"+";
       t.setText(s);
    }
    if(e.getSource()==minus){
       s=s+"-";
       t.setText(s);
    }
    if(e.getSource()==mul){
       s= s+"*";
       t.setText(s);
    }
    if(e.getSource()==divi){
       s=s+"/";
       t.setText(s);
    }
    if(e.getSource()==eq){
       EvaluateString a = new EvaluateString();
       try{
       s=a.evaluate(s)+"";
       }
       catch(Exception e2){
          s="INVALID EXPRESSION PRESS AC";
       }  
       t.setText(s);
    }
    if(e.getSource()==AC){
       s="";
       t.setText("0");
    }
    if(e.getSource()==Back){
      try{ 
      s=s.substring(0,s.length()-1);
      }
      catch(Exception e1){
         s="";
      }   
      t.setText(s);
    }

}

public static void main(String[] args){
  new prac();

}
}