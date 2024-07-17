public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        //String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <=7 ? "Recuperação" : "Reprovado"; // else-if ternário
        
        System.out.println(resultado);
    }
}
