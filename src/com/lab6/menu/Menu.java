package com.lab6.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lab6.command.*;
import com.lab6.gameroom.*;

public class Menu {

	public void startMenu() {

		Scanner sc = new Scanner(System.in);

		List<GameRoom> gameRoom = new ArrayList<>();
		Command allocateMoneyBudget = new AllocateMoneyBudget(gameRoom);
		Command buyToys = new BuyToys(gameRoom);
		Command sortByPrice = new SortByPrice(gameRoom);
		Command findByPrice = new FindByPrice(gameRoom);
		Commands start = new Commands(allocateMoneyBudget, buyToys, sortByPrice, findByPrice);

		while (true) {

			displayMenu();

			switch (sc.next()) {

			case "1": {
				start.allocateMoneyBudget();
				break;
			}

			case "2": {
				start.buyToys();
				break;
			}

			case "3": {
				printToyList(gameRoom);
				break;
			}

			case "4": {
				start.sortByPrice();
				break;
			}

			case "5": {
				start.findByPrice();
				break;
			}

			case "6": {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("\nНевiрна команда, спробуйте ще раз\n");
			}

			}

		}

	}

	public void displayMenu() {

		System.out.println("\nВведiть одну з команд: \n");
		System.out.println("1 - Видiлити бюджет для iгрової кiмнати");
		System.out.println("2 - Купити iграшки для iгрової кiмнати");
		System.out.println("3 - Вивести список куплених iграшок");
		System.out.println("4 - Вiдсортувати iграшки за цiною");
		System.out.println("5 - Знайти iграшки в дiапазонi цiн");
		System.out.println("6 - Вийти з програми\n");
	}

	public void printToyList(List<GameRoom> gameRoom) {

		if (gameRoom.size() > 0) {

			System.out.println();

			for (GameRoom toys : gameRoom) {

				if (toys.equals(toys)) {
					System.out.println(toys);
				}

			}

			System.out.println();

		}

		else {
			System.out.println("\nСписок iграшок для iгрової кiмнати пустий\n");
		}

	}
}
