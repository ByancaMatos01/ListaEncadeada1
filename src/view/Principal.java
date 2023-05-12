package view;
import model.ILista;
import model.Lista;

public class Principal {

		public static void main(String[] args) {
			
			ILista lista = new Lista();
			int valor;
			
			try {
				
				lista.addFirst(3);
				lista.addLast(5);
				lista.addLast(18);
				lista.addLast(12);
				lista.addLast(9);
				lista.addLast(7);
				lista.addLast(6);
				lista.addLast(2);
				lista.addLast(13);
				lista.addLast(4);
				lista.addLast(16);
		  
				
				while (!lista.isEmpty()) {
					for(int i=10; i>=0; i--) {
					valor = lista.get(i);
					System.out.print(valor + " ");
					lista.removeLast();
				}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
