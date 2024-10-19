public class Main {
    public static void main(String[] args) {
        // Örnek String'ler
        String str1 = "Hello";
        String str2 = "World!";
        String str3 = "hello";

        // String birleştirme (Concatenation)
        String combined = str1 + " " + str2; // "+" operatörü ile birleştirme
        System.out.println("Birleştirilmiş String: " + combined);

        // String uzunluğu
        System.out.println("Birinci String'in uzunluğu: " + str1.length());
        System.out.println("İkinci String'in uzunluğu: " + str2.length());
        System.out.println("Üçüncü String'in uzunluğu: " + str3.length());

        // String karşılaştırma (equals, equalsIgnoreCase)
        System.out.println("str1 ve str3 eşit mi? (equals): " + str1.equals(str3));
        System.out.println("str1 ve str3 eşit mi? (equalsIgnoreCase): " +
                str1.equalsIgnoreCase(str3));

        // Alt dize (substring) alma
        String subString = combined.substring(0, 5); // "Hello"
        System.out.println("Alt Dize: " + subString);

        // Büyük/küçük harf dönüşümü
        System.out.println("str1'in büyük harf hali: " + str1.toUpperCase());
        System.out.println("str2'nin küçük harf hali: " + str2.toLowerCase());

        // String içinde kelime arama
        if (combined.contains("World")) {
            System.out.println("Combined string 'World' kelimesini içeriyor.");
        } else {
            System.out.println("Combined string 'World' kelimesini içermiyor.");
        }
    }
}