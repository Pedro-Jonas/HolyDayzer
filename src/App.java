public class App {
    public static void main(String[] args) {
        Feriados feriados = new Feriados();


        feriados.Mostrar(); // mostra todos os feriados

        feriados.TemFeriado("07/09/2023"); //mostra o feriado da Independência do Brasil

        feriados.TemFeriado("02/02/2023"); // mostra a mensagem de que não encontrou nenhum feriado
    }

}