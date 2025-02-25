package sample.cafekiosk.unit.beverage;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AmericanoTest {


    @Test
    void getName() {
        //given
        Americano americano = new Americano();
        // when
//        assertEquals(americano.getName(), "아메리카노");
        assertThat(americano.getName()).isEqualTo("아메리카노");
        // then
    }

    @Test
    void getPrice() {
        //given
        Americano americano = new Americano();
        // when

        // then
        assertThat(americano.getPrice()).isEqualTo(4_000);
    }
}