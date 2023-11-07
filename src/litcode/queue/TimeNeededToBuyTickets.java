package litcode.queue;

public class TimeNeededToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int secondsSpend = 0;

        for (int i = 0; i <= k; i++) {
            secondsSpend += Math.min(tickets[k], tickets[i]);
        }


        for (int i = k + 1 ; i < tickets.length; i++) {
            secondsSpend += Math.min(tickets[k] - 1, tickets[i]);
        }
        return secondsSpend;
    }
}
