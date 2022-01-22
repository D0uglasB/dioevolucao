package strings;

public class Strings {

  public static void main(String[] args) {

    var nome = "Douglas";
    var sobreNome = "Batista";
    final var nomeCompleto = nome + sobreNome;

    System.out.println(nome);
    System.out.println("Nome do cliente : " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto);
    var string = new String(" Minha  String ");

    //Mostra a posição do caractere na posição 5
    System.out.println("Char na posição : " + string.charAt(5));
    //Tamanho da String
    System.out.println("Quantidade=" + string.length());
    //Tira os carcteres em branco exemplo sem TRIM
    System.out.println("Sem Trim [" + string + "]");
    //Exemplo com TRIM
    System.out.println("Com Trim [" + string.trim() + "]");
    //Exibi os caracteres em minusculo
    System.out.println("Lower " + string.toLowerCase());
    //Exibi os caracteres em maiusculo
    System.out.println("Upper " + string.toUpperCase());
    //Para verificar se contém um caracter especifico na String
    System.out.println("Contém M? " + string.contains("M"));
    //Para verificar se contém um caracter especifico na String
    System.out.println("Contém X? " + string.contains("X"));
    //Substituir uma letra por outra
    System.out.println("Replace " + string.replace("n", "$"));
    //Comparação de Strings
    System.out.println("Equals? " + string.equals(" Minha String "));
    //Comparação de Strings
    System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG "));
    //Pega uma parte da String
    System.out.println("Substring(1,6)=" + string.substring(1, 6));

  }
}
