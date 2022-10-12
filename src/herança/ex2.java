package herança;

public class ex2 {
	public static void main(String[] args) {
		ex2PessoaFisica p1 = new ex2PessoaFisica();
		p1.setNome("pessoa 1");
		p1.setRendaBruta(1000);
		p1.setCpf("428.547.467-08");
		
		ex2PessoaJuridica p2 = new ex2PessoaJuridica();
		p2.setNome("pessoa 2");
		p2.setRendaBruta(5000);
		p2.setCnpj("97.004.542/0001-74");
		
		ex2PessoaFisica p3 = new ex2PessoaFisica();
		p3.setNome("pessoa 3");
		p3.setRendaBruta(2000);
		p3.setCpf("869.345.456-05");
		
		ex2PessoaJuridica p4 = new ex2PessoaJuridica();
		p4.setNome("pessoa 4");
		p4.setRendaBruta(3000);
		p4.setCnpj("38.120.699/0001-04");
		
		ex2PessoaFisica p5 = new ex2PessoaFisica();
		p5.setNome("pessoa 5");
		p5.setRendaBruta(3700);
		p5.setCpf("301.832.396-36");
		
		ex2PessoaJuridica p6 = new ex2PessoaJuridica();
		p6.setNome("pessoa 6");
		p6.setRendaBruta(4000);
		p6.setCnpj("24.987.441/0001-97");
		
		ex2Pessoa[] pessoas = new ex2Pessoa[6];
		
		pessoas[0] = p1;
		pessoas[1] = p2;
		pessoas[2] = p3;
		pessoas[3] = p4;
		pessoas[4] = p5;
		pessoas[5] = p6;
		
		for(ex2Pessoa c : pessoas) {
			System.out.println(c.toString());
		}
		
	}

}
