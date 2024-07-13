
public class ContaPoupanca  extends Conta {


	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		System.out.println(String.format("Agencia: %d", super.agencia));
		super.imprimirInfoComuns();
	}
}
