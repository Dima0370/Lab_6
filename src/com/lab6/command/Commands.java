package com.lab6.command;

public class Commands {
	private Command allocateMoneyBudget;
	private Command buyToys;
	private Command sortByPrice;
	private Command findByPrice;

	public Commands(Command allocateMoneyBudget, Command buyToys, Command sortByPrice, Command findByPrice) {

		this.allocateMoneyBudget = allocateMoneyBudget;
		this.buyToys = buyToys;
		this.sortByPrice = sortByPrice;
		this.findByPrice = findByPrice;
	}

	public void allocateMoneyBudget() {

		allocateMoneyBudget.execute();
	}

	public void buyToys() {

		buyToys.execute();
	}

	public void sortByPrice() {

		sortByPrice.execute();
	}

	public void findByPrice() {

		findByPrice.execute();
	}

}
