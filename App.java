public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, 5, 70);
        Carro SUV = new Carro("SUV", TipoCombustivel.GASOLINA, TipoCombustivel.FLEX, 8, 55);
        Carro SUVFlex = new Carro("SUVFlex", TipoCombustivel.FLEX, 0, 65);
        Carro econo = new Carro("Econo", TipoCombustivel.GASOLINA, 20, 55);


        System.out.println("Tipos de veiculos:");
        System.out.println(basico);
        System.out.println(esportivo);
        System.out.println(utilitario);
        System.out.println(SUV);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro esportivo com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 45);
        System.out.println(esportivo);
        System.out.println("\nViajando com o carro esportivo");
        esportivo.viaja(250);
        esportivo.viaja(150);
        System.out.println(esportivo);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro utilitario com diesel");
        utilitario.abastece(TipoCombustivel.DIESEL, 70);
        System.out.println(utilitario);
        System.out.println("\nViajando com o carro utilitario");
        utilitario.viaja(250);
        utilitario.viaja(150);
        System.out.println(utilitario);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro SUV com FLEX");
        SUV.abastece(TipoCombustivel.FLEX, 55);
        System.out.println(SUV);
        System.out.println("\nViajando com o carro SUV");
        SUV.viaja(250);
        SUV.viaja(150);
        System.out.println(SUV);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro SUVFlex com Alcool");
        SUVFlex.abastece(TipoCombustivel.ALCOOL, 65);
        System.out.println(SUVFlex);
        System.out.println("\nViajando com o carro SUVFlex");
        SUVFlex.viaja(250);
        SUVFlex.viaja(100);
        System.out.println(SUVFlex);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro Econo com gasolina");
        econo.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(econo);
        System.out.println("\nViajando com o carro Econo");
        econo.viaja(250);
        econo.viaja(150);
        System.out.println(econo);
    }
}