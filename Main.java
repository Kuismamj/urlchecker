import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
// URL TARKISTIN
public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Käyttö: java Main <url>");
            return;
        }

        String url = args[0]; // käyttäjän URL osoite
        HttpClient client = HttpClient.newHttpClient(); // http pyynnöt
        HttpRequest req = HttpRequest.newBuilder(URI.create(url)).GET().build(); // GET

        long t0 = System.currentTimeMillis(); // alku
        HttpResponse<byte[]> res = client.send(req, HttpResponse.BodyHandlers.ofByteArray()); // lähetys ja vastaus
        long t1 = System.currentTimeMillis(); // loppu 

        System.out.println("URL: " + url);
        System.out.println("Status: " + res.statusCode());
        System.out.println("Vasteen koko: " + res.body().length + " tavua");
        System.out.println("Kesto: " + (t1 - t0) + " ms");
    }
}
