public class TesteCarro {
            public static void main(String[] args){
                Carro carro = new Carro();
                carro.modelo = "Sedan";
                carro.ano = 2021; // acessivel, pois TesteCarro e Carro estão no mesmo pacote
                
                // carro.fabricante = "Ford"; // erro de compilação, fabricante é privado
                
                CarroEsportivo esportivo = new CarroEsportivo();
                esportivo.modelo = "Esportivo";
                esportivo.ano = 2023;
                // esportivo.fabricante = "Ferrari"; // erro de compilação, fabricante é privado
            }  
           
        }
