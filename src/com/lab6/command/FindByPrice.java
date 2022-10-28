package com.lab6.command;

import com.lab6.gameroom.*;

import java.util.List;
import java.util.Scanner;

public class FindByPrice implements Command {

	private List<GameRoom> gameRoom;

	public FindByPrice(List<GameRoom> gameRoom) {

		this.gameRoom = gameRoom;
	}

	public void findByPrice() {

		Scanner sc = new Scanner(System.in);

		if (gameRoom.size() > 0) {

			System.out.print("\nВведiть мiнiмальну цiну iграшки: ");
			int minPrice = sc.nextInt();

			System.out.print("\nВведiть максимальну цiну iграшки: ");
			int maxPrice = sc.nextInt();

			int countToys = 0;
			
			System.out.println();

			for (GameRoom toys : gameRoom) {

				if (toys.getPrice() >= minPrice && toys.getPrice() <= maxPrice) {

					System.out.println(toys);
					countToys++;
				}
			}

			if (countToys == 0) {

				System.out.println("Не знайдено жодної iграшки");
			}
			
			System.out.println();
		}

		else {
			System.out.println("\nНемає iграшок для знаходження за параметром\n");
		}

	}

	@Override
	public void execute() {

		findByPrice();
	}

}
