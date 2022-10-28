package com.lab6.gameroom;

public class GameRoom {

	public static int moneyBudget;
	public String typeOfToy;
	public int price;
	public int count;

	public GameRoom() {
	}

	public GameRoom(String typeOfToy, int price) {
		this.typeOfToy = typeOfToy;
		this.price = price;
	}

	public static int getMoneyBudget() {
		return moneyBudget;
	}

	public void setMoneyBudget(int moneyBudget) {
		GameRoom.moneyBudget = moneyBudget;
	}

	public String getTypeOfToy() {
		return typeOfToy;
	}

	public void setTypeOfToy(String typeOfToy) {
		this.typeOfToy = typeOfToy;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Iграшка - " + typeOfToy + ", цiна - " + getPrice() + " грн";
	}

}
