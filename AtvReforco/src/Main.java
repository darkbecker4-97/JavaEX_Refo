public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Ford", "Fiesta", 2020, "preto");

        meuCarro.acelerar();  // Imprime "Acelerando o carro!"

        Calculadora minhaCalculadora = new Calculadora();

        int resultadoSoma = minhaCalculadora.somar(2, 3);
        int resultadoSubtracao = minhaCalculadora.subtrair(5, 3);
        int resultadoMultiplicacao = minhaCalculadora.multiplicar(4, 5);
        double resultadoDivisao = minhaCalculadora.dividir(10.0, 2.5);

        System.out.println("2 + 3 = " + resultadoSoma);
        System.out.println("5 - 3 = " + resultadoSubtracao);
        System.out.println("4 * 5 = " + resultadoMultiplicacao);
        System.out.println("10 / 2.5 = " + resultadoDivisao);

        Retangulo meuRetangulo = new Retangulo(5, 3);

        double area = meuRetangulo.calcularArea();
        double perimetro = meuRetangulo.calcularPerimetro();

        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);

        ContaBancaria minhaConta = new ContaBancaria("1234-5", 1000.0, "Fulano");

        minhaConta.depositar(500.0);
        minhaConta.sacar(200.0);

        ContaBancaria outraConta = new ContaBancaria("5678-9", 500.0, "Ciclano");
        minhaConta.transferir(300.0, outraConta);

    }
}