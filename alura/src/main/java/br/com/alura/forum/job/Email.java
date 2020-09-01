package br.com.alura.forum.job;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerUtils;
import org.quartz.impl.StdSchedulerFactory;

public class Email implements Job {
	
	public void execute(JobExecutionContext context) {
		System.out.println("enviando email para evisar mudanca de senha...");
		// acessar api de e-mail aqui
		
		SchedulerFactory sf = new StdSchedulerFactory();
		
		try {
			Scheduler sched = sf.getScheduler();

			JobDetail job = new JobDetail("dispara_email", "grupo", Email.class);
			Trigger aMeiaNoite = TriggerUtils.makeDailyTrigger(13, 58);
			sched.scheduleJob(job, aMeiaNoite);
					
			sched.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			}	

}
