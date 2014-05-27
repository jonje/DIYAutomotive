package diyautoControllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.neumont.diyauto.ServiceLoader;
import edu.neumont.diyauto.Models.ModelAndView;
import edu.neumont.diyauto.Models.ThreadModel;
import edu.neumont.diyauto.Models.Threads;

public class ThreadGetController 
{
	HttpServletRequest request;
	HttpServletResponse response;
	Threads threads = ServiceLoader.threads;
	public ThreadGetController(HttpServletRequest request, HttpServletResponse response) 
	{
		this.request = request;
		this.response = response;
	}
	public ModelAndView createThread()
	{
		int threadID = ServiceLoader.threadID++;
		
		return null;
		
	}
	public ModelAndView getThread(int ID)
	{
		ThreadModel thread = threads.getThread(ID);
		ModelAndView MAV = new ModelAndView(thread, "ThreadView");
		return MAV;
		
	}
	
	
}
