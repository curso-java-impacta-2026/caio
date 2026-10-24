package laboratorios.impacta.cap17;


public class Piloto extends Thread{

	private String nome;
	
	public Piloto(String nome) {
		this.nome = nome;
	}
	
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("O piloto : " + nome + " completou a volta de nr: " + i);
				Thread.sleep((long)(Math.random() * 1000));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
	
	
	
	
	
	
	
	
	






