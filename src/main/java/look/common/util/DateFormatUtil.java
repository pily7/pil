package look.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * ThreadLocal是Java中的�?个API,此对象提供了
 * 这样的一种机�?,能够将某个对象绑定到当前线程
 * 也可以从当前线程获取某个对象,目的是保证线�?
 * 内部单例(某个类的实例在当前线程中只有�?�?)
 * 
 * @author adminitartor
 *
 */
public class DateFormatUtil {//ThreadLocal
	private static volatile ThreadLocal<SimpleDateFormat> td=
			new ThreadLocal<SimpleDateFormat>();
	private static SimpleDateFormat getInstance(){
		//1.获取当前线程中format对象
		SimpleDateFormat sdf=td.get();
		//2.当前线程假如没有format对象,则先创建,然后绑定
		if(sdf==null){
			sdf=new SimpleDateFormat("yyyy-MM-dd");
			td.set(sdf);//绑定put(key,value)
		}
		return sdf;
	}
	//静�?�同步方法默认使用的对象锁为(类名.class)
	public static  String format(Date date){
		return getInstance().format(date);
	}
	public static  Date parse(String str)
			throws ParseException{
		return getInstance().parse(str);
	}
	static SimpleDateFormat sdf1;
	static SimpleDateFormat sdf3;
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(){
			@Override
			public void run() {
				sdf1=getInstance();
				SimpleDateFormat sdf2=getInstance();
				System.out.println(sdf1==sdf2);
			}
		};
		Thread t2=new Thread(){
			@Override
			public void run() {
				sdf3=getInstance();
				SimpleDateFormat sdf4=getInstance();
				System.out.println(sdf4==sdf3);
			}
		};
		t1.start();
		t1.join();//保证t1线程先执行结�?
		t2.start();
		t2.join();//保证t2线程先执行结�?
		System.out.println(sdf1==sdf3);
	}
}
