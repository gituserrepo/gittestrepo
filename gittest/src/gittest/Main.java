/**
* Class Information
* @author shravans
* @version 1.2 - 12-Jul-2019
*/
package gittest;

public class Main {
	public static void main(String[] args) {
		Thread th = new Thread(new ReadTask());
		th.start();
	}
}
