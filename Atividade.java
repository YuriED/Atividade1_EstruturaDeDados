import java.util.*;

public class Atividade {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Carlos", "55555555", "1", "333.333.333-33"));
        pessoas.add(new Pessoa("Ana", "66666666", "2", "444.444.444-44"));
        pessoas.add(new Pessoa("Pedro", "77777777", "3", "555.555.555-55"));
        pessoas.add(new Pessoa("Julia", "88888888", "4", "666.666.666-66"));
        pessoas.add(new Pessoa("Lucas", "99999999", "5", "777.777.777-77"));
        pessoas.add(new Pessoa("Fernanda", "10101010", "6", "888.888.888-88"));
        pessoas.add(new Pessoa("Rafael", "11111111", "7", "999.999.999-99"));
        pessoas.add(new Pessoa("Camila", "12121212", "8", "000.000.000-00"));
        pessoas.add(new Pessoa("Miguel", "13131313", "9", "111.111.111-11"));
        pessoas.add(new Pessoa("Isabela", "14141414", "10", "222.222.222-22"));
        pessoas.add(new Pessoa("Felipe", "15151515", "11", "333.333.333-33"));
        pessoas.add(new Pessoa("Amanda", "16161616", "12", "444.444.444-44"));
        pessoas.add(new Pessoa("Gustavo", "17171717", "13", "555.555.555-55"));
        pessoas.add(new Pessoa("Laura", "18181818", "14", "666.666.666-66"));
        pessoas.add(new Pessoa("Vinícius", "19191919", "15", "777.777.777-77"));
        pessoas.add(new Pessoa("Beatriz", "20202020", "16", "888.888.888-88"));
        pessoas.add(new Pessoa("Enzo", "21212121", "17", "999.999.999-99"));
        pessoas.add(new Pessoa("Larissa", "22222222", "18", "000.000.000-00"));
        pessoas.add(new Pessoa("João", "123456789", "19", "111.111.111-11"));
        pessoas.add(new Pessoa("Maria", "987654321", "20", "222.222.222-22"));

        Scanner scan = new Scanner(System.in);
        System.out.println("digite o valor de : ");
        int m = scan.nextInt();

        int i = 0;
        while (pessoas.size() > 1) {
            i = (i + m - i) % pessoas.size();
            System.out.println("Removendo: " + pessoas.get(i));
            pessoas.remove(i);

        }
        System.out
                .println("A pessoa sobrevivente é: " + pessoas.get(0).getNome() + " (" + pessoas.get(0).getCpf() + ")");
    }
}
// o codigo esta rodando corretamente mais no meu visualStudio esta dando erro
// no getNome() e getCpf() ver para mim se no seu tambem esta dando esse erro .