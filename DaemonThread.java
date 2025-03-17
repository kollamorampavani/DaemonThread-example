package threads;
class Captain extends Thread{
	@Override
	public void run() {
		try {
			BattingCoach b=new BattingCoach();
			b.setName("BAC");
			BowlingCoach bc=new BowlingCoach();
			bc.setName("BOC");
			b.setDaemon(true);
			bc.setDaemon(true);
			b.start();
			bc.start();
			System.out.println("captain goes to ground");
			Thread.sleep(3000);
			System.out.println("captain do warmup");
			Thread.sleep(3000);
			System.out.println("captain do catching practice");
			Thread.sleep(3000);
			System.out.println("captain do bowling practice");
			Thread.sleep(3000);
			System.out.println("captain goes to hotel");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class BattingCoach extends Thread{
	@Override
	public void run() {
		for( ; ;) {
			System.out.println("batting coach is in the ground");
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class BowlingCoach extends Thread{
	@Override
	public void run() {
		for( ; ;) {
			System.out.println("bowling coach is in the ground");
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class DaemonThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Captain c=new Captain();
 c.setName("captain");
 c.start();
	}

}
