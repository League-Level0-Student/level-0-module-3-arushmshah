
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsbirthday = "July 15th";
		String dadsbirthday = "October 19th";
		String brothersbirthday = "May 10th";
		String mybirthday = "December 20th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String Birthday = JOptionPane.showInputDialog("Would you like to find out Moms birthday, Dads birthday, Brothers birthday or Arush birthday?");
		// 3. Print out what the user typed
		System.out.println(Birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(Birthday.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsbirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		if(Birthday.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsbirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		if(Birthday.equalsIgnoreCase("arush")) {
			JOptionPane.showMessageDialog(null, mybirthday);
		}
		if(Birthday.equals("brothers")) {
			JOptionPane.showMessageDialog(null, brothersbirthday);
		}
		//7. otherwise print "Sorry, I don't remember that person's birthday!"
		else{
			
		JOptionPane.showMessageDialog(null, "Sorry, I dont remember that persons birthday.");
		}
	} 
}
