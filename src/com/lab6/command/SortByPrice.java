package com.lab6.command;

import com.lab6.gameroom.GameRoom;

import java.util.Collections;
import java.util.List;

public class SortByPrice implements Command {

	private List<GameRoom> gameRoom;

	public SortByPrice(List<GameRoom> gameRoom) {

		this.gameRoom = gameRoom;
	}

	public void sortByPrice() {

		if (gameRoom.size() > 1) {

			System.out.println("\nВiдсортований список iграшкiв за цiною: \n");

			Collections.sort(gameRoom, new PriceComparator());

			for (GameRoom toys : gameRoom) {
				System.out.println(toys);
			}

			System.out.println();

		}

		else if (gameRoom.size() == 0) {
			System.out.println("\nНемає iграшок для сортування\n");
		}

		else if (gameRoom.size() == 1) {
			System.out.println("\nДля сортування потрiбно мiнiмум двi iграшки\n");
		}

	}

	@Override
	public void execute() {

		sortByPrice();
	}

}
