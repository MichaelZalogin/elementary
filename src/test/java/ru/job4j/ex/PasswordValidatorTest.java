package ru.job4j.ex;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    public void whenLengthLess8() {
        String result = PasswordValidator.validate("dwW3re");
        String expected = "Длина пароля должна находится в диапазоне от 8 до 32 символов";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenLengthMore32() {
        String result = PasswordValidator.validate("dewfewe3fewdewfewe3fewdewfewe3fewewq");
        String expected = "Длина пароля должна находится в диапазоне от 8 до 32 символов";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenNonUpperSymbol() {
        String result = PasswordValidator.validate("somewords");
        String expected = "Пароль должен содержать хотя бы один символ в верхнем регистре";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenNonLowerSymbol() {
        String result = PasswordValidator.validate("SOMEWORDS");
        String expected = "Пароль должен содержать хотя бы один символ в нижнем регистре";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenNotContainsDigits() {
        String result = PasswordValidator.validate("SOMEWfewfew");
        String expected = "Пароль должен содержать хотя бы одну цифру";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenNotContainsSpecialSymbol() {
        String result = PasswordValidator.validate("SOMEWfewfew32");
        String expected = "Пароль должен содержать хотя бы один специальный символ";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenPasswordContainsSimpleCombinations() {
        String result = PasswordValidator.validate("QweRty123#");
        String expected = "Пароль не должен содержать в себе простые пароли";
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenPasswordAsserted() {
        String result = PasswordValidator.validate("Q2dE#ew123#");
        String expected = "Q2dE#ew123#";
        assertThat(expected).isEqualTo(result);
    }
}