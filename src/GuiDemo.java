import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class GuiDemo{

    public static void main(String[] args) {
	// write your code here
        Frame f=new Frame ("my awt");
       f.setSize(500,400);
       f.setLocation(300,200);
       f.setLayout(new FlowLayout());

       Button b=new Button("老子是一个按钮");


       f.addWindowListener(new MyWin());
       f.setVisible(true);
       System.out.println("Hello?");

    }
}
class MyWin extends WindowAdapter{
    /**
     * @老子瞎写的
     */
    public void windowsClosing (WindowEvent e){
        System.out.println("老子关了");
        System.exit(0);
    }
}
