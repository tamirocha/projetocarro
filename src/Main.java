public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.modelo = "Fiest Sedam";
        meuCarro.anoDeFabricacao = 2015 ;
        meuCarro.fabricante = "Ford";
        meuCarro.cor = "Prata";
        meuCarro.tipoCombustivel = "Flex (gasolina e álcool)" ;
        meuCarro.valorDeMercado = 33000.00 ;

        Carro seuCarro = new Carro();

        seuCarro.modelo = "Palio";
        seuCarro.anoDeFabricacao = 2011 ;
        seuCarro.fabricante = "Fiat";
        seuCarro.cor = "Preto";
        seuCarro.tipoCombustivel = "Gasolina" ;
        seuCarro.valorDeMercado = 25000.00 ;


        System.out.println("Meu carro");
        System.out.println("---------------------");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoDeFabricacao);
        System.out.println("Fabricante: " + meuCarro.fabricante);
        System.out.println("Cor: " + meuCarro.cor);
        System.out.println("Tipo de Combustível: " + meuCarro.tipoCombustivel);
        System.out.println("Valor de Mercado: " + meuCarro.valorDeMercado);


        System.out.println();
        System.out.println("Seu carro");
        System.out.println("---------------------");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoDeFabricacao);
        System.out.println("Fabricante: " + seuCarro.fabricante);
        System.out.println("Cor: " + seuCarro.cor);
        System.out.println("Tipo de Combustível: " + seuCarro.tipoCombustivel);
        System.out.println("Valor de Mercado: " + seuCarro.valorDeMercado);

    }
}