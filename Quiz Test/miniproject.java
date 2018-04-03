//updated on 30 th october 2017
package javaproject;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.*;

public class miniproject
{
        public String un[]=new String[10];
        public String ei[]=new String[10];
        public String pw[]=new String[10];
        public int c=0 ,res=0;
        public void intro()
        { 
        	 JFrame f3 =new JFrame("Introduction");
             miniproject o=new miniproject();
             f3.setResizable(false);
             f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             JLabel l=new JLabel();
             f3.setContentPane(new JLabel(new ImageIcon("u.jpg")));
             f3.add(l);
             JButton b1=new JButton("Test");
             JLabel l1=new JLabel();
             l1.setText("Introduction");
             l1.setFont(new Font("Serif", Font.BOLD,50));
             l1.setBounds(200,30,400,100);
             b1.setBounds(300,400,200,50);
                     
             JMenuBar menubar=new JMenuBar();
             f3.setJMenuBar(menubar);
             
             JMenu about=new JMenu("Menu");
             JMenuItem abouts=new JMenuItem("About Us");
             menubar.add(about);
             about.add(abouts);
             
             JMenu reg=new JMenu("Register");
             JMenuItem n=new JMenuItem("New user");
             menubar.add(reg);
             reg.add(n);
             JMenuItem e=new JMenuItem("Existing user");
             reg.add(e);
             
             JLabel l2=new JLabel();
             l2.setText("<html><body >We are conducting a multiple choice question test which is based on the knowlwdge related to programming language. In this test there eill be 5 mcq question with 4 options to each question.You have to answer all 5 question. Result will be given at last. If you want to give test click on the test button.</html>");
                     l2.setFont(new Font("Serif", Font.BOLD,25));
             l2.setBounds(50,50,700,400);
             f3.add(l2);
              
             b1.addActionListener (new ActionListener(){
             public void actionPerformed(ActionEvent eb1)
             {
                o.home();
                f3.setVisible(false);
             }
             });
       
    
            abouts.addActionListener (new ActionListener(){
            public void actionPerformed(ActionEvent eb1)
            {
                o.about();
                f3.setVisible(false);
            }
           
            });
            n.addActionListener (new ActionListener(){
            public void actionPerformed(ActionEvent eb1)
            {
                o.register();
                f3.setVisible(false);
            }           
            });
            e.addActionListener (new ActionListener(){

            public void actionPerformed(ActionEvent eb1)
            {
                o.login(un,pw);
                f3.setVisible(false);
            }
            });
            f3.add(l1);
            f3.add(b1);
            f3.setSize(800,600);
            f3.setLayout(null);
            f3.setVisible(true);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            f3.setLocation(dim.width/2-f3.getSize().width/2, dim.height/2-f3.getSize().height/2);
        }
    
        public void home()
        {
        	 miniproject n=new miniproject();
             JFrame f=new JFrame("Home Page");
             JButton b1=new JButton("Userlogin");
             JButton b2=new JButton("Register");
             JLabel l1=new JLabel();
             l1.setText("MULTIPLE CHOISE QUESTION TEST");
             b1.setBounds(270,280,250,50);
             b2.setBounds(270,380,250,50);
             l1.setBounds(100,125,800,50);
             JLabel l=new JLabel();
             f.setContentPane(new JLabel(new ImageIcon("x.jpg")));
             f.add(l);
             l1.setFont(new Font("Serif", Font.BOLD,30));
             f.setSize(800,600);
             f.add(b1); f.add(b2);
             f.add(l1);
             f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             f.setLayout(null);
             f.setVisible(true);
             Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
             f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
 
                b1.addActionListener (new ActionListener(){
              	public void actionPerformed(ActionEvent eb1)
             	{
             		n.login(un,pw);
             		f.setVisible(false);
             	}
             });
             b2.addActionListener (new ActionListener(){
             	public void actionPerformed(ActionEvent eb1)
             	{
             		n.register();
             		f.setVisible(false);
             	}
             });
             JButton b=new JButton("Back");      
             b.setBounds(600,20,100,25);
             f.add(b);     
             b.addActionListener (new ActionListener(){
             	public void actionPerformed(ActionEvent eb1)
             	{
             		n.intro();
             		f.setVisible(false);
             	}
             }); 
     
     	}
        public void register()
        {
        	miniproject m=new miniproject();    
        	JFrame f2=new JFrame("Register");
            JLabel l=new JLabel();
            f2.setContentPane(new JLabel(new ImageIcon("u.jpg")));
            f2.add(l);
            f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JTextField t1,t2,t3;
            JButton b1=new JButton("SUBMIT");
            
            JLabel l1=new JLabel();
            JLabel l2=new JLabel();
            JLabel l3=new JLabel();
            
            t1=new JTextField();
            t2=new JTextField();
            t3=new JPasswordField();
            
            l1.setText("Username:");
            l2.setText("Email:");
            l3.setText("Password:");
            
            
            l1.setFont(new Font("Serif", Font.BOLD, 25));
            l2.setFont(new Font("Serif", Font.BOLD, 25));
            l3.setFont(new Font("Serif", Font.BOLD, 25));
            
            t1.setFont(new Font("Serifw", Font.BOLD, 25));
            t2.setFont(new Font("Serif", Font.BOLD, 25));
            t3.setFont(new Font("Serif", Font.BOLD, 25));

            l1.setBounds(100,220,200,35);
            t1.setBounds(280,220,350,35); 
            l2.setBounds(100,265,200,35);
            t2.setBounds(280,265,350,35);
            l3.setBounds(100,310,200,35); 
            t3.setBounds(280,310,350,35);
            b1.setBounds(350,400,100,35);
            

            b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {    
                un[c]=t1.getText();
                ei[c]=t2.getText();
                pw[c]=t3.getText();
                
                if(un[c].equals("")||ei[c].equals("")||pw[c].equals(""))
                	m.Alert1();
                
                else if(validator(ei[c])) {
                	JFrame f=new JFrame();
                	f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
                	JOptionPane.showMessageDialog(f,"<html>Invalid Email Address</html>","Alert",JOptionPane.QUESTION_MESSAGE);
                }
                else if(pw[c].length()<8) {
                	JFrame f=new JFrame();
                	f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
                	JOptionPane.showMessageDialog(f,"<html>Password must contain at least 8 character</html>","Alert",JOptionPane.QUESTION_MESSAGE);
                }
                else
                {
                    if(c==9)
                    {
                    	m.Error();
                    	m.home();
                    }
                    else
                    {   
                    	c++;
                    	m.alert();
                    	m.login(un,pw);;
                        f2.setVisible(false);
                    }
                    
                }
            }
            });
                
            JButton b=new JButton("Back");      
            b.setBounds(600,20,100,25);
            f2.add(b);     
            
            b.addActionListener (new ActionListener(){
            	public void actionPerformed(ActionEvent eb1)
            	{
            		m.home();
            		f2.setVisible(false);
            	}
            }); 
            f2.add(l1);
            f2.add(b1);
            f2.add(t1);
            f2.add(l2);
            f2.add(t2);
            f2.add(l3);
            f2.add(t3);
            f2.setSize(800,600);
            f2.setLayout(null);
            f2.setVisible(true);
                
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            f2.setLocation(dim.width/2-f2.getSize().width/2, dim.height/2-f2.getSize().height/2);
        }
        

		public static boolean validator(String email) {
        	boolean status=false;
        	String email_pattern="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        	        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        	Pattern pattern=Pattern.compile(email_pattern);
        	Matcher matcher=pattern.matcher(email);
        	if(matcher.matches())
        		status=false;
        	else
        		status=true;
			return status;
        	
        }
        public void Alert1(){  
        	JFrame f=new JFrame();
        	f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        	JOptionPane.showMessageDialog(f,"<html>Please fill mandatory field</html>","Alert",JOptionPane.QUESTION_MESSAGE);     
            
        }
        public void Error(){  
        	JFrame f=new JFrame();
        	f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        	JOptionPane.showMessageDialog(f,"<html>Registration is close.<br>Contact to Admin<html>","Alert",JOptionPane.WARNING_MESSAGE);     
            
         } 
        public void alert(){  
            JFrame f=new JFrame();
            f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
            JOptionPane.showMessageDialog(f,"Successfully Register.","Alert",JOptionPane.WARNING_MESSAGE);     
        } 
        public void login(String[] name,String[] pass)
        {       
            miniproject q=new miniproject();
            JFrame f =new JFrame("Login Page");
            f.setResizable(false);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel l=new JLabel();
            f.setContentPane(new JLabel(new ImageIcon("u.jpg")));
            f.add(l);
            JButton b1=new JButton("LogIn");
            JTextField t1,t2;

            JLabel l1=new JLabel();
            JLabel l2=new JLabel();
            JLabel he=new JLabel();

            he.setText("LogIn System");
            l1.setText("Username :");
            l2.setText("Password :");

            he.setFont(new Font("Serif", Font.BOLD, 50));
            l1.setFont(new Font("Serifew", Font.BOLD, 25));
            l2.setFont(new Font("Serif", Font.BOLD, 25));

            t1=new JTextField();
            t2=new JPasswordField();

            t1.setFont(new Font("Serif", Font.BOLD, 25));
            t2.setFont(new Font("Serif", Font.BOLD, 25));

            he.setBounds(180,50,450,100);
            l1.setBounds(100,180,200,35);
            t1.setBounds(300,180,350,35); 
            l2.setBounds(100,250,200,35);
            t2.setBounds(300,250,350,35);
            b1.setBounds(300,310,200,35);
            b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String u=t1.getText();
                String p=t2.getText();
                int flag=0;
                if(u.equals("")&&p.equals(""))
                {
                	JFrame f=new JFrame();
                	f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
                	JOptionPane.showMessageDialog(f,"<html>Please fill mandatory field</html>","Alert",JOptionPane.QUESTION_MESSAGE);
                }
                else
                {
                	for(int i=0;i<=c;i++)
                	{
                		if(u.equals(name[c])&&p.equals(pass[c]))
                		{
                			flag++;
                			new test("MCQ's");
                			f.setVisible(false);
                			break;
                		}  		
                	}
                }
                if(flag==0)
                {
                	if((u.equals("imran")&&p.equals("imran"))||(u.equals("i")&&p.equals("i"))||(u.equals("manish")&&p.equals("manish")))
                	{
                		new test("MCQ's");
            			f.setVisible(false);
                	}
                	else
                	{
                		t1.setText("");
                		t2.setText("");
                		JFrame f=new JFrame();
                    	f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
                    	JOptionPane.showMessageDialog(f,"<html>Please enter correct username or password</html>","Alert",JOptionPane.QUESTION_MESSAGE);   		
                	}
                }
            }
            });
                JButton b=new JButton("Back");      
                    b.setBounds(600,20,100,25);
                    f.add(b);     
                    
                    b.addActionListener (new ActionListener(){
                public void actionPerformed(ActionEvent eb1)
                {
                    q.home();
                    f.setVisible(false);
                }
            }); 
            f.add(he);
            f.add(t1);
            f.add(t2);
            f.add(l1);
            f.add(l2);
            f.add(b1);
            f.setSize(800,600);
            f.setLayout(null);
            f.setVisible(true);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        }            
        public void result(int c)
        {       
                String res,x,y,z="0";
                double n=c*100/5;
                int m=(int)n;
                res=" "+m;
                miniproject s=new miniproject();
            if(m>=35)
            {
                    x="<html>Your result is PASS</html>";
                    
            }
            else
            {
                            
                    x="<html>Your result is FAIL</html>";   
            }
            y="<html>You got percentage: </html>";
            if(m>=95)
                    {
                            z="<html>Exceptional</html>";
                            
                    }
                    else if((m>= 80)&&(m<95 )) 
                    {
                            z="<html>Distingtion</html>";
                            
                    }
                    else if((m>=60 )&&(m<80))
                    {
                            z="<html>First class</html>";
                            
                    }
                    else if((m>=35 )&&(m<60))
                    {
                            z="<html><pre>    Poor   </pre></html>";
                            
                    }
                    else if(m<40 )
                    {
                            z="<html><pre>Better Luck,<br> Next Time</pre></html>";
                            
                    }
                JFrame f5 =new JFrame("Result");
                    f5.setResizable(false);
            f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel l=new JLabel();
            f5.setContentPane(new JLabel(new ImageIcon("u.jpg")));
            f5.add(l);
            JButton b1=new JButton("logout");
        
            JLabel l1=new JLabel();
            l1.setText("Result");
            l1.setBounds(350,100,200,100);
            l1.setFont(new Font("Serif", Font.BOLD,30));
        
            JLabel l2=new JLabel();
            l2.setText(x);
                    l2.setFont(new Font("Serif", Font.BOLD, 30));
            l2.setBounds(250,200,400,150);
            
            JLabel l3=new JLabel();
            l3.setText(y);
            l3.setBounds(220,300,400,150);
            l3.setFont(new Font("Serif", Font.BOLD,30));
            
            JLabel l4=new JLabel();
            l4.setText(res);
            l4.setBounds(570,300,100,150);
            l4.setFont(new Font("Serif", Font.BOLD,30));
            
            JLabel l5=new JLabel();
            l5.setText(z);
            l5.setBounds(300,400,200,150);
            l5.setFont(new Font("Serif", Font.BOLD,30));
            
            b1.setBounds(600,20,100,25);
                    b1.addActionListener (new ActionListener()
                    {
                public void actionPerformed(ActionEvent eb1)
                {
                    s.intro();
                    f5.setVisible(false);
                }
            });
            
            
                    f5.add(l1);
                    f5.add(l2);
                    f5.add(l3);
                    f5.add(l4);
                    f5.add(l5);
                f5.add(b1);
                f5.setSize(800,600);
                f5.setVisible(true);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                f5.setLocation(dim.width/2-f5.getSize().width/2, dim.height/2-f5.getSize().height/2);
        }
        public void about()
        {       miniproject t=new miniproject();
                JFrame fz =new JFrame("About ");
               
                    fz.setResizable(false);
            fz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
            //JLabel l=new JLabel();
            fz.setContentPane(new JLabel(new ImageIcon("w.jpg")));
                    
                                           
                    JButton b=new JButton("Back");      
                    b.setBounds(600,20,100,25);
                    fz.add(b);     
                    b.addActionListener (new ActionListener(){
                public void actionPerformed(ActionEvent eb1)
                {
                    t.intro();
                    fz.setVisible(false);
                }
            }); 
            JLabel l1=new JLabel("JAVA MINIPROJECT");
            l1.setBounds(200,100,400,50);
            l1.setFont(new Font("Serif", Font.BOLD,30));
            fz.add(l1);
            JLabel l2=new JLabel();
            
            l2.setText("<html><body ><p color=#040138><pre>Topic: MCQ TEST<br>STD: Second Year of Engineering<br>SUB: OOPM<br>Div: A       Batch: A3<br><br>Group members: <br>1. IMRAN KHAN      A349<br>2. MANISH MESHRAM  A363</pre></p></html>");
                    l2.setFont(new Font("Serif", Font.BOLD,25));
            l2.setBounds(50,100,700,400);
            fz.add(l2);                 
                    fz.setSize(800,600);
                fz.setVisible(true);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                fz.setLocation(dim.width/2-fz.getSize().width/2, dim.height/2-fz.getSize().height/2);
         }  
    	public void create()
    	{
    		 for(int i=0;i<10;i++)
             {
                  un[i]=new String();
                  ei[i]=new String();
                  pw[i]=new String();
             }
    		 miniproject m=new miniproject();
    		 m.intro();
    	}
        public static void main(String args[])
        {
                miniproject m=new miniproject();
                m.create();
        } 
}
@SuppressWarnings("serial")
class test extends JFrame    
{
	JLabel l;
    JRadioButton jr[]=new JRadioButton[5];
    ButtonGroup bg=new ButtonGroup();
    
    JButton b1;
    int count=0,current=0;
    test(String s)
    {
            super(s);  
            l=new JLabel();  
            l.setFont(new Font("Serif", Font.BOLD,20));
                this.setContentPane(new JLabel(new ImageIcon("xx.jpg")));         
            add(l);  
            bg=new ButtonGroup();  
            for(int i=0;i<5;i++)  
            {  
                    jr[i]=new JRadioButton();     
                        add(jr[i]);  
                    bg.add(jr[i]);  
            }
            b1=new JButton("Next");
            b1.addActionListener (new ActionListener()
            {
                public void actionPerformed(ActionEvent eb1)
            {
                if(check())
                count=count+1;
                current++;
                set();              
            }
            });  
            add(b1);  
            set();  
            l.setBounds(50,30,450,80);  
            jr[0].setBounds(50,130,200,30);
              
            jr[1].setBounds(50,170,200,30);  
            
            jr[2].setBounds(50,210,200,30);  
            
            jr[3].setBounds(50,250,200,30);  
           
            b1.setBounds(400,270,100,30); 
            setLayout(null);  
            setLocation(280,130);  
            setVisible(true);  
            setSize(600,400);  
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            setLocation(dim.width/2-getSize().width/2, dim.height/2-getSize().height/2);   
    }
    public void ActionPerformerd(ActionEvent e)
    {
        if(check())
        count=count+1;
        current++;
        set();
    }
     boolean check()  
     {              
            if(current==0)  
                    return(jr[1].isSelected());  
            if(current==1)  
                    return(jr[2].isSelected());  
            if(current==2)  
                    return(jr[1].isSelected());  
            if(current==3)  
                    return(jr[0].isSelected());  
            if(current==4)  
                    return(jr[2].isSelected());
            
            return false;
        }
    void set() 
    {
        jr[4].setSelected(true); 
        miniproject t=new miniproject();
        if(current==0)  
            {  
                    l.setText("<html><p color=#FFFFFF>Que1: Which one among these is not a primitive datatype ?</p></html>");  
                    jr[0].setText("int");jr[1].setText("Float");jr[2].setText("boolean");jr[3].setText("char");   
            }  
            if(current==1)  
            {  
                    l.setText("<html><p color=#FFFFFF>Que2: Which class is available to all the class automatically ?</p></html>");  
                    jr[0].setText("Swing");jr[1].setText("Applet");jr[2].setText("Object");jr[3].setText("ActionEvent");  
            }  
            if(current==2)  
            {  
                 l.setText("<html><p color=#FFFFFF>Que3: which function is not present in Applet class ?</p></html>");  
                     jr[0].setText("init");jr[1].setText("main");jr[2].setText("start");jr[3].setText("destroy");   
            }  
            if(current==3)  
            {  
                    l.setText("<html><p color=#FFFFFF>Que4: String class is defined in which package ?</p></html>");  
                    jr[0].setText("lang");jr[1].setText("Swing");jr[2].setText("Applet");jr[3].setText("awt");  
            }  
            if(current==4)  
            {  
                    l.setText("<html><p color=#FFFFFF>Q5. which of the following is true of object oriented language ?</p></html>");  
                    jr[0].setText("c");jr[1].setText("c++");jr[2].setText("java");jr[3].setText("html");
                    b1.setText("Result");
            }
            if(current==5)
            {
                this.setVisible(false);
                t.result(count);
            }
    }
}
