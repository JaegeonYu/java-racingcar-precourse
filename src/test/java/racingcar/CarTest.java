package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

class CarTest {
        @Test
        public void printCarPositionTest() throws Exception{
                Car car = new Car("bebe");
                car.move(5);
                car.move(4);
                car.move(1);
                Assertions.assertEquals(car.toString(),"bebe : --");
        }

        @Test
        public void carNameTest() throws Exception{
                org.assertj.core.api.Assertions.assertThatThrownBy(()->
                        new Car("ffffff")).isInstanceOf(IllegalArgumentException.class);
        }
        @Test
        public void $NAME() throws Exception{
           String hello = ",,1";
           String[] split = hello.split(",");
           int count = 0;
           for(String x : split){
                   if(x.equals("")) System.out.println("blank");
           }
        }
}