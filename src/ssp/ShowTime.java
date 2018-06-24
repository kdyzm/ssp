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
                //获取eclipse启动的时间  
                long eclipseStartTime = Long.parseLong(System.getProperty("eclipse.startTime"));  
                //获取系统当前的时间  
                long costTime = System.currentTimeMillis() - eclipseStartTime;  
                Shell shell = Display.getDefault().getActiveShell();  
                String message = "Eclipse启动时间为  " + costTime + "ms";  
                MessageDialog.openInformation(shell, "Information", message);  
            }  
        });  
    }  
  
}  
