package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PasswordValidatorTest {

    @Test
    public void whenLengthLess8() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("dwW3re");
                });
        String expected = "Длина пароля должна находится в диапазоне от 8 до 32 символов";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenLengthMore32() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("dewfewe3fewdewfewe3fewdewfewe3fewewq");
                });
        String expected = "Длина пароля должна находится в диапазоне от 8 до 32 символов";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenNonUpperSymbol() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("somewords");
                });
        String expected = "Пароль должен содержать хотя бы один символ в верхнем регистре";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenNonLowerSymbol() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("SOMEWORDS");
                });
        String expected = "Пароль должен содержать хотя бы один символ в нижнем регистре";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenNotContainsDigits() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("SOMEWfewfew");
                });
        String expected = "Пароль должен содержать хотя бы одну цифру";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenNotContainsSpecialSymbol() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("SOMEWfewfew32");
                });
        String expected = "Пароль должен содержать хотя бы один специальный символ";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenPasswordContainsSimpleCombinations() {
    IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> {
                PasswordValidator.validate("QweRty123#");
            });
    String expected = "Пароль не должен содержать в себе простые пароли";
    assertThat(exception.getMessage()).isEqualTo(expected);
}

    @Test
    public void whenPasswordAsserted() {
        String result = PasswordValidator.validate("Q2dE#ew123#");
        String expected = "Q2dE#ew123#";
        assertThat(expected).isEqualTo(result);
    }
}