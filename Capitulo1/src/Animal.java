
/**
 *
 * @author ficdev
 */
public class Animal {

    private final String nome;
    private final int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() {
        System.out.println(nome + " esta comendo. ");
    }

    public void dormir() {
        System.out.println(nome + " esta dormindo. ");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    }
