package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

import static racingcar.message.ErrorMessage.*;
import static racingcar.message.Message.*;

public class View extends OutputView {
    public List<Car> inputCar() {
        printCarsName();
        String input = Console.readLine();
        String[] splitInput = input.split(DELIMITER.getMessage());
        List<Car> cars = new ArrayList<>();
        makeCars(splitInput, cars);
        return cars;
    }

    private void makeCars(String[] splitInput, List<Car> cars) {
        try {
            for (String car : splitInput) {
                cars.add(new Car(car));
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            inputCar();
        }
    }

    public int inputRound() {
        printInputFinalRound();
        String inputRound = Console.readLine();
        try {
            validateRound(inputRound);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception);
            inputRound();
        }
        return Integer.parseInt(inputRound);
    }

    private void validateRound(String inputRound) {
        try {
            Integer.parseInt(inputRound);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException(ROUND_IS_DIGIT.getMessage());
        }
    }
}
