package util;

public class Formatacao {
    public static String formatarComQuebraDeLinha(String descricao, int PPL){
        String[] palavras = descricao.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (Integer i = 0; i<palavras.length; i++)
        {
            sb.append(palavras[i]).append("  ");
            if((i + 1) % PPL == 0) { sb.append("\n");}

        }

        return sb.toString().trim();
    }
}
