/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch;

/**
 *
 * @author Surbhit
 */
import java.io.*;
public class Watch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException 
    {
        
	stopwatch obj=new stopwatch();
        obj.setVisible(true);
	System.out.println("Let's see what time you are stopped at!");
    }
    
}
