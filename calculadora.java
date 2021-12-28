

Scanner entrada = new Scanner(System.in);

	System.out.print("Informe o número:");
	double num1 = entrada.nextDouble();
	
	System.out.print("Informe o número:");
	double num2 = entrada.nextDouble();

	System.out.print("Informe a operação:");
	String op = entrada.next();

	double resultado = "+".equals(op) ? num1 + num2: 0;
	resultado = "-".equals(op) ?num1 - num2 : resultado;
	resultado = "*".equals(op) ?num1 * num2 : resultado;
	resultado = "/".equals(op) ?num1 / num2 : resultado;
	resultado = "%".equals(op) ?num1 % num2 : resultado;

	System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);


entrada.close();






		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Rodrigo Alves";
		funcionario.salarioBruto = 4356.99;
		funcionario.imposto = 0.15;
		
		System.out.println("Funcionário: "+funcionario.nome);
		System.out.println("Salário Bruto: "+ funcionario.salarioBruto);
		
		System.out.println("Salário Atualizado com Imposto:");
		System.out.println("Salário Líquido: "+funcionario.salarioBruto * (1 - funcionario.imposto));






























//Scanner entrada = new Scanner(System.in);
		
		
		
		
		
//		System.out.println("Informe o nome do Funcionário:");
//		String nome = entrada.next();
//	
//		System.out.println("Informe o salário bruto:");
//		double salarioBruto = entrada.nextDouble();		
//		
//		System.out.println("Informe o valor do imposto:");
//		double imposto = entrada.nextDouble();
//		
//		System.out.println("Salário Líquido eh:");
//		double salarioLiquido = entrada.nextDouble();
//		
	
		
		
		
		// entrada.close();
		

		

        String nome;
	double salarioBruto;
	double salarioLiquido;
	double imposto;
	


==================================================================================================================

String nome;
	double salarioBruto;
	double salarioLiquido;
	double imposto;
	
	
	public void salarioBruto() {
		salarioBruto = salarioBruto + (salarioBruto  * 7.5/100);
	}
	
	public String toString() {
		return nome + ", R$" + String.format("%2f", salarioLiquido);
	}

	public double salarioLiquido(double imposto) {
	return	 salarioBruto - (salarioBruto * 15/100);
		
	}
	
==============================================================================================================


	
		Scanner entrada = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.printf("Informe o nome do funcionario:");
		funcionario.nome = entrada.next();
		
		System.out.printf("Informe o salario Bruto:");
		funcionario.salarioBruto = entrada.nextDouble();
		
		System.out.printf("Informe o valor do Imposto:");
		double imposto = entrada.nextDouble();
		funcionario.salarioLiquido(imposto);
		
		System.out.println("Salario atual do funcionario eh: " + funcionario);
		
		
		
		
		entrada.close();

	}














Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos 
três trimestres do ano(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada).
• Ao final:
◦ Mostrar qual a nota final do aluno no ano. 
◦ Informar se o aluno está aprovado ou reprovado.
◦ Em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser 
aprovado (que é 60% da nota).















