package com.lab6.command;

import java.util.List;
import java.util.Scanner;

import com.lab6.gameroom.*;

public class AllocateMoneyBudget extends GameRoom implements Command {

	public AllocateMoneyBudget(List<GameRoom> gameRoom) {
	}

	public void allocateMoneyBudget() {

		Scanner sc = new Scanner(System.in);

		if (getMoneyBudget() == 0) {

			int money;

			System.out.print("\nВведiть кiлькiсть грошей, яку потрiбно видiлити на iгрову кiмнату: ");

			money = sc.nextInt();

			System.out.println();

			setMoneyBudget(money);

			System.out.println("На iгрову кiмнату було видiлено " + getMoneyBudget() + " грн " + "бюджету\n");

		}

		else {

			System.out.println("\nГрошей на iгрову кiмнату вже видiлено\n");
		}

	}

	@Override
	public void execute() {

		allocateMoneyBudget();
	}

}
