public class Main {

    public static void main(String[] args) {

        System.out.println("LinkedStack");

        LinkedStack<String> pila = new LinkedStack<String>();

        pila.Push("Elemento 1");
        pila.Push("Elemento 2");
        pila.Push("Elemento 3");
        pila.Push("Elemento 4");

        pila.Pop();

        System.out.println("El tope es: " + pila.Top());

        System.out.println();
        System.out.println("Vaciando la pila (orden LIFO):");
        while (!pila.isEmpty()) {
            System.out.println("  Pop -> " + pila.Pop());
        }
        System.out.println("¿Pila vacía? " + pila.isEmpty());
        System.out.println("Top en pila vacía: " + pila.Top());
        System.out.println("Pop en pila vacía: " + pila.Pop());

        System.out.println();
        System.out.println("Aplicación: verificación de símbolos balanceados");
        String[] expresiones = { "(a + b) * [c - d]", "{[(x)]}", "(a + b]", "((a + b)", "a + b)" };
        for (String e : expresiones) {
            System.out.println("  " + e + " -> "
                    + (VerificadorSimbolos.estaBalanceada(e) ? "balanceada" : "desequilibrada"));
        }
    }
}
