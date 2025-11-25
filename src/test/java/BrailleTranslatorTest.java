import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitarios para la clase BrailleTranslator.
 * Verifica la correcta conversión de texto español a código Braille.
 */
class BrailleTranslatorTest {

    private BrailleTranslator translator;

    @BeforeEach
    void setUp() {
        translator = new BrailleTranslator();
    }

    @Test
    @DisplayName("Test 1: Conversión de letras básicas en minúsculas")
    void testLetrasBasicas() {
        String resultado = translator.textToBraille("hola");
        String esperado = "⠓⠕⠇⠁";
        assertEquals(esperado, resultado, "Las letras 'hola' deben convertirse correctamente a Braille");
    }

    @Test
    @DisplayName("Test 2: Conversión de vocales acentuadas")
    void testVocalesAcentuadas() {
        String resultado = translator.textToBraille("café");
        String esperado = "⠉⠁⠋⠮";
        assertEquals(esperado, resultado, "La palabra 'café' con acento debe convertirse correctamente");
    }

    @Test
    @DisplayName("Test 3: Conversión de números con prefijo numérico")
    void testNumeros() {
        String resultado = translator.textToBraille("123");
        String esperado = "⠼⠁⠃⠉";
        assertEquals(esperado, resultado, "Los números deben incluir el prefijo ⠼ y convertirse correctamente");
    }

    @Test
    @DisplayName("Test 4: Conversión de texto mixto (letras, números y espacios)")
    void testTextoMixto() {
        String resultado = translator.textToBraille("hola 123 mundo");
        String esperado = "⠓⠕⠇⠁ ⠼⠁⠃⠉ ⠍⠥⠝⠙⠕";
        assertEquals(esperado, resultado, "El texto mixto debe manejar letras, números y espacios correctamente");
    }

    @Test
    @DisplayName("Test 5: Conversión de signos de puntuación")
    void testPuntuacion() {
        String resultado = translator.textToBraille("¿hola?");
        String esperado = "⠦⠓⠕⠇⠁⠢";
        assertEquals(esperado, resultado, "Los signos de puntuación deben convertirse correctamente");
    }

    @Test
    @DisplayName("Test 6: Manejo de entrada vacía o nula")
    void testEntradaVaciaONula() {
        assertEquals("", translator.textToBraille(""), "Una cadena vacía debe retornar vacío");
        assertEquals("", translator.textToBraille(null), "Una entrada nula debe retornar vacío");
        assertEquals("", translator.textToBraille("   "), "Una cadena con solo espacios debe retornar vacío");
    }
}