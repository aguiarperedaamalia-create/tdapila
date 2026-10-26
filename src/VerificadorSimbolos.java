public class VerificadorSimbolos {

    public static boolean estaBalanceada(String expresion) {
        LinkedStack<Character> pila = new LinkedStack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.Push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                Character abierto = pila.Pop();
                if (abierto == null || !corresponden(abierto, c)) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    private static boolean corresponden(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')')
            || (apertura == '[' && cierre == ']')
            || (apertura == '{' && cierre == '}');
    }
}
