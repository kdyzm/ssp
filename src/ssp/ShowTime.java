package ssp;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IStartup;

public class ShowTime implements IStartup{  
	  
    @Override  
    public void earlyStartup() {  
        // TODO Auto-generated method stub  
        Display.getDefault().syncExec(new Runnable() {  
            public void run(){  
                //��ȡeclipse������ʱ��  
                long eclipseStartTime = Long.parseLong(System.getProperty("eclipse.startTime"));  
                //��ȡϵͳ��ǰ��ʱ��  
                long costTime = System.currentTimeMillis() - eclipseStartTime;  
                Shell shell = Display.getDefault().getActiveShell();  
                String message = "Eclipse����ʱ��Ϊ  " + costTime + "ms";  
                MessageDialog.openInformation(shell, "Information", message);  
            }  
        });  
    }  
  
}  
