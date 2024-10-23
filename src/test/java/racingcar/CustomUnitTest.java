package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CustomUnitTest {

    @Test
    void CHECK_RANDOM_GENERATOR(){
        int randomNumber = Randoms.pickNumberInRange(8,9);
        assertThat(randomNumber).isBetween(8,9);
    }


    @Test
    void CHECK_CAR_NAME_IS_EMPTY_EXCEPTION(){
        // arrange
        CarValidator carValidator = new CarValidator();
        Car car = new Car();

        // act
        car.setName("");

        // assert
        assertThrows(IllegalArgumentException.class, () -> {
            carValidator.checkEmptyOrNullCarName(car.getName());
        });
    }
}