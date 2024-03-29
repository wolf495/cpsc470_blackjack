package big_project;

import java.util.ArrayList;
import big_project.BlackjackRules;

public class PlayerJoseph extends PlayerAbstract {
    
    public boolean doesPlayerHit(String dealerUpCard) {
		if(BlackjackRules.countPoints(hand) >= 21)
			return false;
		else if(BlackjackRules.countPoints(hand) >= 16)
				return true;
    	    return true;
    }
    
    public int placeBet(ArrayList<String> playedCards) {
        if(bank <= bankStart * .1)
		bet *= .1;
	else if(bank <= bankStart * .25)
		bank *= .25;
	else if(bank <= bankStart * .5)
		bank *= .5;
	else if(bank <= bankStart * .75)
		bank *= .75;
	else
		bet = (int)(bank * .1);
      	bank -= bet;
	return bet;	
						
    }

    public int placeBetInitial() {
        bet = 100;
	bank -= 100;
	return bet;
    }

    public boolean quit() {
	    if(bank >= bankStart * 2) return true;
        return false;
    }
}
