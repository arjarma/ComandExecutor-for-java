import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class CommandExecutor extends JFrame implements ActionListener
{
JTextField tf;
JButton exec;
JButton can;
JPanel jp;
JLabel lb;
Process pro;
ProcessBuilder builder;

CommandExecutor()
{
	lb=new JLabel("Command");
jp=new JPanel();
jp.setLayout(null);
tf=new JTextField();
exec=new JButton("Run");
can=new JButton("Cancel");
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
lb.setBounds(15,5,100,20);
tf.setBounds(15,40,200,35);
exec.setBounds(60,85,60,30);
can.setBounds(130,85,80,30);
/*
setLayout(new BorderLayout);
BorderLayout.NORTH
*/
jp.add(lb);
jp.add(tf);
jp.add(exec);
jp.add(can);
add(jp);
exec.addActionListener(this);
can.addActionListener(this);

}//cons ends

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==exec)
{
	if(tf.getText().equalsIgnoreCase("notepad")==true)
	{
	try
	{
	//pro=Runtime.getRuntime().exec("notepad.exe");
	//builder=new ProcessBuilder("msconfig.exe");
	builder=new ProcessBuilder("notepad");
	pro=builder.start();
	
	}
	catch(Exception e){}
	}//notepad end
	
		else if(tf.getText().equalsIgnoreCase("notepad++")==true)
	{
	try
	{
		builder=new ProcessBuilder("C:\\npp.7.4.1.bin.x64\\notepad++.exe");
		pro=builder.start();
	
	}
	catch(Exception e){}
	}
	
	else if(tf.getText().equalsIgnoreCase("Uninstaller")==true)
	{
	try
	{
		//uninstall a program
		pro=Runtime.getRuntime().exec("cmd /c start appwiz.cpl");
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("Security center")==true)
	{
	try
	{	pro=Runtime.getRuntime().exec("cmd /c start wscui.cpl");
		
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("adobe reader")==true)
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start acrord32.exe");
		
	}
	catch(Exception e){}
	}
	
	else if(tf.getText().equalsIgnoreCase("property")==true)
	{
	try
	{
		//properties
		pro=Runtime.getRuntime().exec("cmd /c start control.exe system");
	
	}
	catch(Exception e){}
	}
	
	else if(tf.getText().equalsIgnoreCase("advanced tab")==true)
	{
	try
	{
		builder=new ProcessBuilder("systempropertiesadvanced");//advnaced tAB
		pro=builder.start();
	
	}
	catch(Exception e){}
	}
	
	
	
	else if(tf.getText().equalsIgnoreCase("system configuration")==true)
	{
	try
	{
		builder=new ProcessBuilder("msconfig");//system configuration
		pro=builder.start();
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("task manager")==true)
	{
	try
	{
		builder=new ProcessBuilder("taskmgr");//task manager
		pro=builder.start();
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("device manager")==true)
	{
	try
	{
		builder=new ProcessBuilder();//device management
		pro=Runtime.getRuntime().exec("cmd /c start devmgmt.msc");
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("event viewer")==true)
	{
	try
	{	
		builder=new ProcessBuilder("eventvwr");//event viewer
		pro=builder.start();
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("computer manager")==true)
	{
	try
	{
		////computer management
		pro=Runtime.getRuntime().exec("cmd /c start compmgmt.msc");
		
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("System information")==true)
	{
	try
	{
		builder=new ProcessBuilder("msinfo32");//System information
		pro=builder.start();
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("control panel")==true)
	{
	try
	{
		builder=new ProcessBuilder("control");//control Panel
		pro=builder.start();
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("registry editor")==true)
	{
	try
	{
		builder=new ProcessBuilder("regedit");//registry editor
		pro=builder.start();
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("system restore")==true)
	{
	try
	{
		builder=new ProcessBuilder("rstrui");//System restore
		pro=builder.start();
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("internet configuration")==true)
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start ipconfig.exe");
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("resource monitor")==true)
	{
	try
	{
		builder=new ProcessBuilder("resmon");//resource monitor
		pro=builder.start();
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("calculator")==true)
	{
	try
	{
		builder=new ProcessBuilder("calc");//calculator
		pro=builder.start();
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("paint")==true)
	{
	try
	{
		builder=new ProcessBuilder("mspaint");//mspaint
		pro=builder.start();
	
	}
	catch(Exception e){}
	}
	
	else if(tf.getText().equalsIgnoreCase("Services")==true)
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start services.msc");
	
	}
	catch(Exception e){}
	}
	
	else if(tf.getText().equalsIgnoreCase("You Tube")==true)
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start /new-tab www.youtube.com");
	
	}
	catch(Exception e){}
	}
	
	
	else if(tf.getText().equalsIgnoreCase("Keyboard")==true)
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start osk");
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("Disk manager")==true)
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start diskmgmt.msc");
	
	}
	catch(Exception e){}
	}
	
	
	else if(tf.getText().equalsIgnoreCase("bluetooth")==true)
	{
	try
	{
		builder=new ProcessBuilder("fsquirt");//mspaint
		pro=builder.start();
	
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("disk partition")==true)
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start diskpart");//diskpart
		
	
	}
	catch(Exception e){}
	}
	//process builder methods end here
	//Runtime getRuntime exec starts
	else if(tf.getText().equalsIgnoreCase("CMD")==true)//for command prompt
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start cmd");
		
	}
	catch(Exception e){}
	}
	
	else if(tf.getText().equalsIgnoreCase("chrome")==true)//for opening chrome
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start chrome");
		
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("google")==true)//for opening google
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start chrome www.google.com");
		
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("new tab")==true)
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start chrome /new-tab www.google.com");//for opening goole in new tab
		
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("new window")==true)//for opening google in new window
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start chrome /new-window www.google.com");
		
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("gmail")==true)//for opening gmail
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start chrome /new-tab www.gmail.com");
		
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("facebook")==true)//for opening facebook
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start chrome /new-tab www.facebook.com");
		
	}
	catch(Exception e){}
	}
	
	else if(tf.getText().equalsIgnoreCase("Wordpad")==true)//word pad
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start write");
		
	}
	catch(Exception e){}
	}
	
	
	else if(tf.getText().equalsIgnoreCase("microsoft word")==true)//for microsoft word
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start winword");
		
	}
	catch(Exception e){}
	}
	else if(tf.getText().equalsIgnoreCase("powerpoint")==true)//for powerpoint
	{
	try
	{
		pro=Runtime.getRuntime().exec("cmd /c start powerpnt");

	}
	catch(Exception e){}
	}
else if(tf.getText().equalsIgnoreCase("close")==true)//for destroying a process
	{
		pro.destroy();
	}
	
	//pro=builder.start();
	//PrintStream ps=new PrintStream("demo.txt");
	//System.setOut(ps);
	//System.out.println("hey There");
	
	

	
	}
if(ae.getSource()==can)
{
	this.setVisible(false);
}

}
public static void main(String args[])
{
CommandExecutor co=new CommandExecutor();
co.setSize(270,180);
co.setVisible(true);
co.setTitle("Commands");
co.setLayout(null);
co.setLocationRelativeTo(null);//for opening in center
}
}
