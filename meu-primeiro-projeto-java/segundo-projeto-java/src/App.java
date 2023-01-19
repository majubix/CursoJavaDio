//pedindo base
	String base = JOptionPane.showInputDialog("digite a base do triangulo:");
	double baseD = Double.parseDouble(base);
	//pedindo altura
	String altura = JOptionPane.showInputDialog("digite a altura do triangulo:");
	double alturaD = Double.parseDouble(altura);
	//calculo

	double resultado = (baseD*alturaD)/2;
	JOptionPane.showMessageDialog(null, "resultado: "+resultado);

}
