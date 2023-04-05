package Com.Sprint1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
    	ApplicationContext spc =new ClassPathXmlApplicationContext("config.xml");
       RBI bank =(RBI)spc.getBean("bank");
       bank.credit();
       bank.debit();
    
       
    }
}
