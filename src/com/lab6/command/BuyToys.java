package com.lab6.command;

import java.util.List;
import java.util.Scanner;

import com.lab6.gameroom.*;

public class BuyToys extends GameRoom implements Command {

	private List<GameRoom> gameRoom;
	private Ball ball = new Ball();
	private Cube cube = new Cube();
	private Doll doll = new Doll();
	private SmallCar smallCar = new SmallCar();
	private MediumCar mediumCar = new MediumCar();
	private LargeCar largeCar = new LargeCar();

	public BuyToys(List<GameRoom> gameRoom) {

		this.gameRoom = gameRoom;
	}

	public void buyToys() {

		Scanner sc = new Scanner(System.in);

		buyMenu();

		switch (sc.next()) {

		case "1": {

			if (GameRoom.getMoneyBudget() > 0) {

				int count1;
				int count2 = 0;

				System.out.print("\nВведiть кiлькiсть м'ячiв, яку треба придбати: ");

				count1 = sc.nextInt();

				if (GameRoom.getMoneyBudget() - (ball.getPrice() * count1) > 0) {

					int remainder;

					for (int i = 0; i < count1; i++) {
						count2++;
						gameRoom.add(new Ball());
						remainder = GameRoom.getMoneyBudget() - (ball.getPrice());
						setMoneyBudget(remainder);

						if (remainder < ball.getPrice()) {
							ball.setCount(count2);
							System.out.println("\nЧерез нестачу грошей було куплено всього " + ball.getCount());
							break;
						}

						ball.setCount(count1);

					}

					System.out.println("\nКуплено " + ball.getCount() + " м'ячiв");

					System.out.println("\nЗалишилося грошей: " + GameRoom.getMoneyBudget() + " грн\n");
				}

				else {
					System.out.println("\nНе вистачає грошей\n");
				}
			}

			else {
				System.out.println("\nНемає грошей\n");
			}

			break;

		}

		case "2": {

			if (GameRoom.getMoneyBudget() > 0) {

				int count1;
				int count2 = 0;

				System.out.print("\nВведiть кiлькiсть кубикiв, яку треба придбати: ");

				count1 = sc.nextInt();

				if (GameRoom.getMoneyBudget() - (cube.getPrice() * count1) > 0) {

					int remainder;

					for (int i = 0; i < count1; i++) {
						gameRoom.add(new Cube());
						remainder = GameRoom.getMoneyBudget() - (cube.getPrice());
						setMoneyBudget(remainder);
						count2++;

						if (remainder < cube.getPrice()) {
							cube.setCount(count2);
							System.out.println("\nЧерез нестачу грошей було куплено всього " + cube.getCount());
							break;
						}

						cube.setCount(count1);

					}

					System.out.println("\nКуплено " + cube.getCount() + " кубикiв");

					System.out.println("\nЗалишилося грошей: " + GameRoom.getMoneyBudget() + " грн\n");
				}

				else {
					System.out.println("\nНе вистачає грошей\n");
				}
			}

			else {
				System.out.println("\nНемає грошей або бюджет ще не був видiлений\n");
			}

			break;

		}

		case "3": {

			if (GameRoom.getMoneyBudget() > 0) {

				int count1;
				int count2 = 0;

				System.out.print("\nВведiть кiлькiсть ляльок, яку треба придбати: ");

				count1 = sc.nextInt();

				if (GameRoom.getMoneyBudget() - (doll.getPrice() * count1) > 0) {

					int remainder;

					for (int i = 0; i < count1; i++) {
						gameRoom.add(new Doll());
						remainder = GameRoom.getMoneyBudget() - (doll.getPrice());
						setMoneyBudget(remainder);

						if (remainder < doll.getPrice()) {
							doll.setCount(count2);
							System.out.println("\nЧерез нестачу грошей було куплено всього " + doll.getCount());
							break;
						}

						doll.setCount(count1);
					}

					System.out.println("\nКуплено " + doll.getCount() + " ляльок");

					System.out.println("\nЗалишилося грошей: " + GameRoom.getMoneyBudget() + " грн\n");
				}

				else {
					System.out.println("\nНе вистачає грошей\n");
				}
			}

			else {
				System.out.println("\nНемає грошей\n");
			}

			break;

		}

		case "4": {

			if (GameRoom.getMoneyBudget() > 0) {

				int count1;
				int count2 = 0;

				System.out.print("\nВведiть кiлькiсть маленьких машин, яку треба придбати: ");

				count1 = sc.nextInt();

				int remainder;

				if (GameRoom.getMoneyBudget() - (smallCar.getPrice() * count1) > 0) {

					for (int i = 0; i < count1; i++) {
						count2++;
						remainder = GameRoom.getMoneyBudget() - (smallCar.getPrice());
						setMoneyBudget(remainder);
						gameRoom.add(new SmallCar());

						if (remainder < smallCar.getPrice()) {
							smallCar.setCount(count2);
							System.out.println("\nЧерез нестачу грошей було куплено всього " + smallCar.getCount());
							break;
						}

						smallCar.setCount(count1);
					}

					System.out.println("\nКуплено " + smallCar.getCount() + " маленьких машин");

					System.out.println("\nЗалишилося грошей: " + GameRoom.getMoneyBudget() + " грн\n");
				}

				else {
					System.out.println("\nНе вистачає грошей\n");
				}

			}

			else {
				System.out.println("\nНемає грошей\n");
			}

			break;

		}

		case "5": {

			if (GameRoom.getMoneyBudget() > 0) {

				int count1;
				int count2 = 0;

				System.out.print("\nВведiть кiлькiсть середнiх машин, яку треба придбати: ");

				count1 = sc.nextInt();

				if (GameRoom.getMoneyBudget() - (mediumCar.getPrice() * count1) > 0) {

					int remainder;

					for (int i = 0; i < count1; i++) {
						count2++;
						gameRoom.add(new MediumCar());
						remainder = GameRoom.getMoneyBudget() - (mediumCar.getPrice());
						setMoneyBudget(remainder);

						if (remainder < mediumCar.getPrice()) {
							mediumCar.setCount(count2);
							System.out.println("\nЧерез нестачу грошей було куплено всього " + mediumCar.getCount());
							break;
						}

						mediumCar.setCount(count1);
					}

					System.out.println("\nКуплено " + mediumCar.getCount() + " середнiх машин");

					System.out.println("\nЗалишилося грошей: " + GameRoom.getMoneyBudget() + " грн\n");
				}

				else {
					System.out.println("\nНе вистачає грошей");
				}
			}

			else {
				System.out.println("\nНемає грошей\n");
			}

			break;

		}

		case "6": {

			if (GameRoom.getMoneyBudget() > 0) {

				int count1;
				int count2 = 0;

				System.out.print("\nВведiть кiлькiсть великих машин, яку треба придбати: ");

				count1 = sc.nextInt();

				if (GameRoom.getMoneyBudget() - (largeCar.getPrice() * count1) > 0) {

					int remainder;

					for (int i = 0; i < count1; i++) {
						count2++;
						gameRoom.add(new LargeCar());
						remainder = GameRoom.getMoneyBudget() - (largeCar.getPrice());
						setMoneyBudget(remainder);

						if (remainder < largeCar.getPrice()) {
							largeCar.setCount(count2);
							System.out.println("\nЧерез нестачу грошей було куплено всього " + largeCar.getCount());
							break;
						}

						largeCar.setCount(count1);
					}

					System.out.println("\nКуплено " + largeCar.getCount() + " великих машин");

					System.out.println("\nЗалишилося грошей: " + GameRoom.getMoneyBudget() + " грн\n");
				}

				else {
					System.out.println("\nНе вистачає грошей");
				}
			}

			else {
				System.out.println("\nНемає грошей\n");
			}

			break;

		}

		case "7": {

			System.out.println();
			break;

		}

		default: {
			System.out.println("\nВведено неправильну команду, спробуйте ще раз");
			break;
		}
		}

	}

	public void buyMenu() {

		System.out.println("\nВведiть, який тип iграшки потрiбно придбати: ");
		System.out.println("\n1. М'яч");
		System.out.println("2. Кубик");
		System.out.println("3. Лялька");
		System.out.println("4. Маленька машина");
		System.out.println("5. Середня машина");
		System.out.println("6. Велика машина");
		System.out.println("7. Повернутися до головного меню\n");
	}

	@Override
	public void execute() {

		buyToys();
	}

}
