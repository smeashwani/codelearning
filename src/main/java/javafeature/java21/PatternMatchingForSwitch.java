package javafeature.java21;

public class PatternMatchingForSwitch {

	public static void main(String[] args) {
		System.out.println(getBalanceWithSwitchPattern(new SavingsAccount()));
		System.out.println(getBalanceWithOutSwitchPattern(new SavingsAccount()));
	}
	
	
	static double getBalanceWithSwitchPattern(Account account) {
	    double result = 0;
	    switch (account) {
	        case null -> throw new RuntimeException("Oops, account is null");
	        case SavingsAccount sa -> result = sa.getSavings();
	        case TermAccount ta -> result = ta.getTermAccount();
	        case CurrentAccount ca -> result = ca.getCurrentAccount();
	        default -> result = account.getBalance();
	    };
	    return result;
	}
	
	static double getBalanceWithOutSwitchPattern(Account account) {
	    double balance = 0;
	    if(account instanceof SavingsAccount sa) {
	        balance = sa.getSavings();
	    }
	    else if(account instanceof TermAccount ta) {
	        balance = ta.getTermAccount();
	    }
	    else if(account instanceof CurrentAccount ca) {
	        balance = ca.getCurrentAccount();
	    }
	    return balance;
	}
	

	static class Account {
		double getBalance() {
			return 0;
		}
	}
	static class SavingsAccount extends Account {
	    double getSavings() {
	    	System.out.println("Savings Account");
	        return 100;
	    }
	}
	static class TermAccount extends Account {
	    double getTermAccount() {
	    	System.out.println("Term Account");
	        return 1000;
	    } 
	}
	static class CurrentAccount extends Account {
	    double getCurrentAccount() {
	    	System.out.println("Current Account");
	        return 10000;
	    } 
	}

}
