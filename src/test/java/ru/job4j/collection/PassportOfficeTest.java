package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenNumberIsAlreadyThere() {
        Citizen citizen1 = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("2f44a", "Ivan Ivanov");
        PassportOffice office = new PassportOffice();
        office.add(citizen1);
        boolean expected = office.add(citizen2);
        assertFalse(expected);
    }
}