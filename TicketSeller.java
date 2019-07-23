package main;

import java.util.Scanner;

public class TicketSeller {
	static Scanner input = new Scanner(System.in);
	private final static int MAXTICKET = 100;
	public static void  main(String []args) {
		int currentTicket = MAXTICKET;
		int buyers=0;
		while(currentTicket>0) {
			System.out.print("Ticket Need = ");
			int ticket = input.nextInt();
			if(ticket>=1 && ticket<=4 && ticket<=currentTicket) {
				currentTicket = currentTicket - ticket;
				System.out.println("Ticket Remaining: " + currentTicket);
				buyers = buyers + 1;
			}
		}

		System.out.println("The Number of Buyers is: " + buyers);
	}
}
