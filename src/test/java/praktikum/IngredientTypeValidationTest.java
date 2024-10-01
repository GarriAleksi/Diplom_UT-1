package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeValidationTest {

    // Ожидаемые значения для ингредиентов
    private static final String EXPECTED_SAUCE = "SAUCE";
    private static final String EXPECTED_FILLING = "FILLING";

    // Параметры теста
    @Parameterized.Parameter(0)
    public IngredientType ingredientType;

    @Parameterized.Parameter(1)
    public String expectedValue;

    // Параметризованные данные
    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {IngredientType.SAUCE, EXPECTED_SAUCE},
                {IngredientType.FILLING, EXPECTED_FILLING}
        };
    }

    @Test
    public void testIngredientType() {
        // Проверка строкового представления типа
        String actualType = ingredientType.toString();
        assertEquals("Expected ingredient type to match its string representation.", expectedValue, actualType);
    }
}
