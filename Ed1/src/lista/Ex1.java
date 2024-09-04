package lista;

import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lista = new ArrayList<Integer>();
		mostrarTodos(lista);
		lista.add(10);
		lista.add(20);
		lista.add(30);
		mostrarTodos(lista);
		System.out.println("Tamanho da lista: " + lista.size());
		System.out.println("Elemento do índice 2: " + lista.get(2));
		System.out.println("Removendo elemento do indice 1: ");
		lista.remove(1);
		mostrarTodos(lista);
		System.out.println("Índice do elemento 30: " + lista.indexOf(30));
		System.out.println("Removendo numero de valor 30: ");
		lista.remove((Integer) 30);
		mostrarTodos(lista);
		System.out.println("Contem o numero 3: " + lista.contains(3));
	}

	public static void mostrarTodos(List<Integer> list) {
		if (list == null || list.size() == 0) {
			System.out.print("Lista vazia!");
		}
		for (Object item : list) {
			System.out.print(item + "");
		}
		System.out.println();
	}

}
