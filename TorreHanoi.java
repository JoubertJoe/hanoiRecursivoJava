import java.util.Stack;

public class TorreHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int argolas = 8;
		encheTorre(argolas, torre01);

		System.out.println(resolve(argolas, torre01, torre02, torre03) + " passos.");
	}

	static Stack<Integer> torre01 = new Stack<>();
	static Stack<Integer> torre02 = new Stack<>();
	static Stack<Integer> torre03 = new Stack<>();

	static void encheTorre(int argolas, Stack<Integer> torre) {
		for (int i = 0; i < argolas; i++) {
			torre.push(i);
		}
	}

	static int cont = 0;

	static int resolve(int n, Stack<Integer> inicio, Stack<Integer> meio, Stack<Integer> fim) {

		if (n == 1) {

			fim.push(inicio.pop());
			System.out.println("Passo " + (cont+1) + ":\n" + torre01.toString() + "\n" + torre02.toString() + "\n"
					+ torre03.toString() + "\n\n");
			cont = cont + 1;

		} else {
			resolve(n - 1, inicio, fim, meio);
			fim.push(inicio.pop());
			System.out.println("Passo " + (cont + 1) +":\n" + torre01.toString() + "\n" + torre02.toString() + "\n"
					+ torre03.toString() + "\n\n");
			cont = cont + 1;

			resolve(n - 1, meio, inicio, fim);
		}
		return cont;
	}

}
