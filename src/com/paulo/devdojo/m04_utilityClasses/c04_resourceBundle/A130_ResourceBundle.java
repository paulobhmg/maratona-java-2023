package com.paulo.devdojo.m04_utilityClasses.c04_resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

/* Resource Bundles são arquivos de propriedades, utilizados para intenacionalizar mensagens.
   Deverá existir um arquivo para cada localidade, seguindo o padrão de nomenclatura, que exige informar qual é o language
   utilizado.

   Quando o sistema é internacionalizado, é possível que busque por uma chave que não existe. Para isso, a classe fornece
   métodos que permite verificar se uma chave existe antes de pesquisar no ResourceBundle. Internamente o resourceBundle prioriza
   os arquivos, buscando o arquivo de acordo com a localização.

   REGRAS: Locale("pt", "BR");
   1 - Procura arquivo messages_pt_BR.properties
   2 - Procura arquivo messages_pt.properties
   3 - Procura arquivo default do sistema: messages_en_US.properties
   4 - Procua arquivo messages_en
   5 - Como última opção, tenta procurar um arquivo genérico: messages.properties

   Caso não encontre a a chave em nenhum desses arquivos, retorna exceção. */
public class A130_ResourceBundle {
    public static void main(String[] args) {
        ResourceBundle resourceBR = setResourceBundle("messages", new Locale("pt", "br"));
        ResourceBundle resourceUS = setResourceBundle("messages", Locale.US);

        System.out.println(resourceBR.getString("hello"));
        System.out.println(resourceBR.getString("good.morning"));

        System.out.println(resourceUS.getString("hello"));
        System.out.println(resourceUS.getString("good.morning"));
    }

    public static ResourceBundle setResourceBundle(String key, Locale locale) {
        return ResourceBundle.getBundle(key, locale);
    }
}
