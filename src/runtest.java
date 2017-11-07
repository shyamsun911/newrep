import org.testng.annotations.Test;

public class runtest {
	 @Test
	  public void f() throws Throwable {
		  checkbox chk=new checkbox();
		  chk.checkboxmethod();
		  
	  }
	 @Test
	
	 public void BasicAuthTest() throws Throwable {
		 BasicAuth BA=new BasicAuth();
		  BA.BasicAuthmethod();
	 }
	 
	 @Test
	 public void contextmenutest() throws Throwable {
		 Contextmenu cm=new Contextmenu();
		  cm.Cntmethod();
	 }
	 
	 @Test
	 public void dropdowntest() throws Throwable {
		 dropdown dd=new dropdown();
		  dd.dropdownmethod();
	 }
	 
	 @Test
	 public void Horizontalslidetest() throws Throwable {
		 Horizontalslide hs=new Horizontalslide();
		  hs.horizontalmethod();
	 }
	 
	 @Test
	 public void Hoverstest() throws Throwable {
		 Hovers hss=new Hovers();
		  hss.Hoversmethod();
	 }
	
	 @Test
	 public void JavaScriptAlertstest() throws Throwable {
		 JavaScriptAlerts jss=new JavaScriptAlerts();
		  jss.jsalertsmethod();
	 }
	 
	 
	 @Test
	 public void Newwindowstest() throws Throwable {
		 Newwindow nw=new Newwindow();
		  nw.newwindowmethod();
	 }
	 
	 @Test
	 public void Notificationmessagetest() throws Throwable {
		 Notificationmessage ntw=new Notificationmessage();
		  ntw.notificationmessagemethod();
	 }
	 
	 
	 @Test
	 public void uploadfiletest() throws Throwable {
		 uploadfile up=new uploadfile();
		  up.uploadfilemethod();
	 } 
	 
	 
	 
}
